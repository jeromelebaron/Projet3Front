package fr.s2re.managedbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.MethodeLivraisonDto;
import fr.s2re.dto.TypeCBDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcCommande;
import fr.s2re.iuc.IUcPanier;
import fr.s2re.iuc.IUcUtilisateur;
import fr.s2re.livraison.servicelivraison.ServiceLivraisonDto;

@ManagedBean
@SessionScoped
public class CommandeMb {
    private int methodeLivraisonChoisi = 2;

    private int typeCbChoisi = 1;

    private UtilisateurDto user;
    /**
     * La {@link CommandeDto} à payer.
     */
    private CommandeDto commande = new CommandeDto();
    /**
     * Le montant du panier.
     */
    private double montantPanier;
    /**
     * Le frais de livraison de la {@link CommandeDto}.
     */
    private Double fraisLivraison = 2.5;
    /**
     * Le montant total de la {@link CommandeDto} avec les frais de port.
     */
    private Double montantTotalCommande;

    private List<MethodeLivraisonDto> methodesLivraison;

    private List<TypeCBDto> typesCb;

    private List<LigneDeCommandeDto> listLigneDeCommande;
    /**
     * La map en cas de problème de stock vace l'id produit en clé et en valeur la quantité restante
     * en stock.
     */
    private Map<Integer, Integer> mapLigneCommandeStockInsuffisant = new HashMap<>();
    /**
     * La liste des {@link ServiceLivraisonDto}.
     */
    private List<ServiceLivraisonDto> lesServicesDeLivraison = new ArrayList<>();

    @EJB
    private IUcClient ucClient;

    @EJB
    private IUcUtilisateur ucUtilisateur;

    /**
     * Concerne les use case du panier.
     */
    @EJB
    private IUcPanier ucPanier;
    /**
     * Concerne les uses case de la {@link CommandeDto}.
     */
    @EJB
    private IUcCommande ucCommande;

    @ManagedProperty(value = "#{panierMb}")
    private PanierMb panierMb;

    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    @ManagedProperty(value = "#{clientMb}")
    private ClientMb clientMb;

    public String commander() {
        listLigneDeCommande = panierMb.getCommandeDto().getLignesDeCommande();
        mapLigneCommandeStockInsuffisant = ucPanier.validerPanier(listLigneDeCommande);
        if (!mapLigneCommandeStockInsuffisant.isEmpty()) {
            return "";
        }
        commande.setLignesDeCommande(listLigneDeCommande);
        montantPanier = panierMb.getTotalPanier();
        montantTotalCommande = montantPanier + fraisLivraison;

        if (connectionMb != null && connectionMb.getUser() != null) {
            user = connectionMb.getUser();
        }
        if (user != null && user.getClass() == ClientDto.class) {
            methodesLivraison = ucClient.retournerMethodeDeLivraison();
            if (clientMb.getAdresses().isEmpty()) {
                clientMb.setAdresses(ucClient.retournerMesAdresses((ClientDto) user));
                if (!clientMb.getAdresses().isEmpty()) {
                    for (AdresseDto a : clientMb.getAdresses()) {
                        if ("livraison".equals(a.getType())) {
                            clientMb.getAdressesLivraison().add(a);
                        } else if ("facturation".equals(a.getType())) {
                            clientMb.getAdressesFacturation().add(a);
                        }
                    }
                }
            }
            if (!clientMb.getAdressesLivraison().isEmpty()) {
                clientMb.setAdresseDisplay(clientMb.getAdressesLivraison().get(0));
                lesServicesDeLivraison = ucCommande.getServiceLivraisonByCodePostalVille(clientMb
                        .getAdressesLivraison().get(0).getVille().getCp());
            }
            typesCb = ucClient.retournerTypeCb();
            return "paiement.xhtml?faces-redirect=true";
        }
        if (user == null) {
            return "login.xhtml?faces-redirect=true";
        }
        return "";
    }

    /**
     * Pour mettre à jour en ajax le panneau de récapitulatif de la commande.
     * @param event l'évènement ajax à récupérer.
     */
    public void mettreAJourRecapitulatifCommande(AjaxBehaviorEvent event) {
        montantTotalCommande = montantPanier + fraisLivraison;
    }

    public String allerPayer() {
        // CommandeDto cmdTmp = new CommandeDto();
        // for(TypeCBDto t : typesCb){
        // if(t.getId() == typeCbChoisi){
        // cmdTmp.setTypeCB(t);
        // }
        // }
        // TODO déplacer ce traitement dans le paiement
        commande.setTypeCB(typesCb.get(0));
        for (MethodeLivraisonDto m : methodesLivraison) {
            if (m.getId() == methodeLivraisonChoisi) {
                commande.setMethodeLivraison(m);
                fraisLivraison = m.getPrix();
            }
        }
        montantTotalCommande = panierMb.getTotalPanier() + fraisLivraison;
        commande.setAdresseFacturation(ucUtilisateur.retournerAdresseParId(clientMb
                .getAdresseFacturationChoisie()));
        commande.setAdresseLivraison(ucUtilisateur.retournerAdresseParId(clientMb
                .getAdresseLivraisonChoisie()));
        return "confirmationPaiement.xhtml?faces-redirect=true";
    }

    public int getMethodeLivraisonChoisi() {
        return methodeLivraisonChoisi;
    }

    public void setMethodeLivraisonChoisi(int paramMethodeLivraisonChoisi) {
        methodeLivraisonChoisi = paramMethodeLivraisonChoisi;
    }

    public int getTypeCbChoisi() {
        return typeCbChoisi;
    }

    public void setTypeCbChoisi(int paramTypeCbChoisi) {
        typeCbChoisi = paramTypeCbChoisi;
    }

    public UtilisateurDto getUser() {
        return user;
    }

    public void setUser(UtilisateurDto paramUser) {
        user = paramUser;
    }

    public CommandeDto getCommande() {
        return commande;
    }

    public void setCommande(CommandeDto paramCommande) {
        commande = paramCommande;
    }

    /**
     * Accesseur en lecture du champ <code>montantPanier</code>.
     * @return le champ <code>montantPanier</code>.
     */
    public double getMontantPanier() {
        return montantPanier;
    }

    /**
     * Accesseur en écriture du champ <code>montantPanier</code>.
     * @param paramMontantPanier la valeur à écrire dans <code>montantPanier</code>.
     */
    public void setMontantPanier(double paramMontantPanier) {
        montantPanier = paramMontantPanier;
    }

    /**
     * Accesseur en lecture du champ <code>montantTotalCommande</code>.
     * @return le champ <code>montantTotalCommande</code>.
     */
    public Double getMontantTotalCommande() {
        return montantTotalCommande;
    }

    /**
     * Accesseur en écriture du champ <code>montantTotalCommande</code>.
     * @param paramMontantTotalCommande la valeur à écrire dans <code>montantTotalCommande</code>.
     */
    public void setMontantTotalCommande(Double paramMontantTotalCommande) {
        montantTotalCommande = paramMontantTotalCommande;
    }

    public List<MethodeLivraisonDto> getMethodesLivraison() {
        return methodesLivraison;
    }

    public void setMethodesLivraison(List<MethodeLivraisonDto> paramMethodesLivraison) {
        methodesLivraison = paramMethodesLivraison;
    }

    public List<TypeCBDto> getTypesCb() {
        return typesCb;
    }

    public void setTypesCb(List<TypeCBDto> paramTypesCb) {
        typesCb = paramTypesCb;
    }

    public List<LigneDeCommandeDto> getListLigneDeCommande() {
        return listLigneDeCommande;
    }

    public void setListLigneDeCommande(List<LigneDeCommandeDto> paramListLigneDeCommande) {
        listLigneDeCommande = paramListLigneDeCommande;
    }

    /**
     * Accesseur en lecture du champ <code>mapLigneCommandeStockInsuffisant</code>.
     * @return le champ <code>mapLigneCommandeStockInsuffisant</code>.
     */
    public Map<Integer, Integer> getMapLigneCommandeStockInsuffisant() {
        return mapLigneCommandeStockInsuffisant;
    }

    /**
     * Accesseur en écriture du champ <code>mapLigneCommandeStockInsuffisant</code>.
     * @param paramMapLigneCommandeStockInsuffisant la valeur à écrire dans
     *            <code>mapLigneCommandeStockInsuffisant</code>.
     */
    public void setMapLigneCommandeStockInsuffisant(
            Map<Integer, Integer> paramMapLigneCommandeStockInsuffisant) {
        mapLigneCommandeStockInsuffisant = paramMapLigneCommandeStockInsuffisant;
    }

    /**
     * Accesseur en lecture du champ <code>lesServicesDeLivraison</code>.
     * @return le champ <code>lesServicesDeLivraison</code>.
     */
    public List<ServiceLivraisonDto> getLesServicesDeLivraison() {
        return lesServicesDeLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>lesServicesDeLivraison</code>.
     * @param paramLesServicesDeLivraison la valeur à écrire dans
     *            <code>lesServicesDeLivraison</code>.
     */
    public void setLesServicesDeLivraison(List<ServiceLivraisonDto> paramLesServicesDeLivraison) {
        lesServicesDeLivraison = paramLesServicesDeLivraison;
    }

    public IUcClient getUcClient() {
        return ucClient;
    }

    public void setUcClient(IUcClient paramUcClient) {
        ucClient = paramUcClient;
    }

    public IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    /**
     * Accesseur en lecture du champ <code>ucPanier</code>.
     * @return le champ <code>ucPanier</code>.
     */
    public IUcPanier getUcPanier() {
        return ucPanier;
    }

    /**
     * Accesseur en écriture du champ <code>ucPanier</code>.
     * @param paramUcPanier la valeur à écrire dans <code>ucPanier</code>.
     */
    public void setUcPanier(IUcPanier paramUcPanier) {
        ucPanier = paramUcPanier;
    }

    /**
     * Accesseur en lecture du champ <code>ucCommande</code>.
     * @return le champ <code>ucCommande</code>.
     */
    public IUcCommande getUcCommande() {
        return ucCommande;
    }

    /**
     * Accesseur en écriture du champ <code>ucCommande</code>.
     * @param paramUcCommande la valeur à écrire dans <code>ucCommande</code>.
     */
    public void setUcCommande(IUcCommande paramUcCommande) {
        ucCommande = paramUcCommande;
    }

    public PanierMb getPanierMb() {
        return panierMb;
    }

    public void setPanierMb(PanierMb paramPanierMb) {
        panierMb = paramPanierMb;
    }

    public ConnectionMb getConnectionMb() {
        return connectionMb;
    }

    public void setConnectionMb(ConnectionMb paramConnectionMb) {
        connectionMb = paramConnectionMb;
    }

    public ClientMb getClientMb() {
        return clientMb;
    }

    public void setClientMb(ClientMb paramClientMb) {
        clientMb = paramClientMb;
    }

    public Double getFraisLivraison() {
        return fraisLivraison;
    }

    public void setFraisLivraison(Double paramFraisLivraison) {
        fraisLivraison = paramFraisLivraison;
    }

}
