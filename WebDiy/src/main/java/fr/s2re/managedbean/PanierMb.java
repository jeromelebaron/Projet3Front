package fr.s2re.managedbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@SessionScoped
public class PanierMb {

    /**
     * La quantité totale de produits dans le panier.
     */
    private int totalProduits = 0;

    private String coupon;

    private Double totalPanier = 0.0;

    private Double panierFraisLivraison = 0.0;

    private UtilisateurDto user;
    /**
     * La commande en cours de création du panier.
     */
    private CommandeDto commandeDto = new CommandeDto();

    private Map<LigneDeCommandeDto, Double> mapLigneCmd = new HashMap<>();

    @EJB
    private IUcUtilisateur ucUtilisateur;

    @EJB
    private IUcClient ucClient;

    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    @ManagedProperty(value = "#{clientMb}")
    private ClientMb clientMb;

    @PostConstruct
    public void init() {
        if (connectionMb != null && connectionMb.getUser() != null) {
            user = connectionMb.getUser();
        } else {
            user = null;
        }
        commandeDto.setLignesDeCommande(new ArrayList<LigneDeCommandeDto>());
    }

    /**
     * Pour ajouter un {@link ProduitDto} au panier.
     * @param paramIdProduit l'id du {@link ProduitDto} à ajouter.
     * @return sur la même page.
     */
    public String ajoutAuPanier(int paramIdProduit) {
        LigneDeCommandeDto ligne = new LigneDeCommandeDto();
        ligne.setQuantite(1);
        ligne.setProduit(ucUtilisateur.getById(paramIdProduit));
        boolean produitDiff = true;
        if (!commandeDto.getLignesDeCommande().isEmpty()) {
            for (LigneDeCommandeDto l : commandeDto.getLignesDeCommande()) {
                if (l.getProduit().getId() == ligne.getProduit().getId()) {
                    l.setQuantite(ligne.getQuantite() + l.getQuantite());
                    produitDiff = false;
                    totalProduits++;
                    break;
                }
            }
            if (produitDiff) {
                commandeDto.getLignesDeCommande().add(ligne);
                totalProduits++;
            }
        } else {
            commandeDto.getLignesDeCommande().add(ligne);
            totalProduits++;
        }
        for (LigneDeCommandeDto l : commandeDto.getLignesDeCommande()) {
            mapLigneCmd.put(l, l.getProduit().getPrix() * l.getQuantite());
        }
        return "";
    }

    public String decrementeQteProduit(int paramIdPdt) {
        for (LigneDeCommandeDto l : commandeDto.getLignesDeCommande()) {
            if (l.getProduit().getId() == paramIdPdt) {
                if (l.getQuantite() > 1) {
                    l.setQuantite(l.getQuantite() - 1);
                }
            }
            mapLigneCmd.put(l, l.getProduit().getPrix() * l.getQuantite());
            totalProduits--;
        }
        return "";
    }

    public String supprProduit(Integer paramIdPdt) {
        Iterator<LigneDeCommandeDto> iterator = commandeDto.getLignesDeCommande().iterator();
        while (iterator.hasNext()) {
            Integer idProduit = iterator.next().getProduit().getId();
            if (idProduit == paramIdPdt) {
                // On supprime l'élément courant de la liste
                iterator.remove();
            }
        }
        return "";
    }

    /**
     * Pour vider complètement le panier.
     * @return sur la page d'accueil.
     */
    public String viderPanier() {
        totalPanier = 0.0;
        totalProduits = 0;
        commandeDto.setLignesDeCommande(new ArrayList<LigneDeCommandeDto>());
        coupon = "";
        mapLigneCmd = new HashMap<>();
        panierFraisLivraison = 0.0;
        return "accueil.xhtml?faces-redirect=true";
    }

    /**
     * Accesseur en lecture du champ <code>commandeDto</code>.
     * @return le champ <code>commandeDto</code>.
     */
    public CommandeDto getCommandeDto() {
        return commandeDto;
    }

    /**
     * Accesseur en écriture du champ <code>commandeDto</code>.
     * @param paramCommandeDto la valeur à écrire dans <code>commandeDto</code>.
     */
    public void setCommandeDto(CommandeDto paramCommandeDto) {
        commandeDto = paramCommandeDto;
    }

    public IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    public IUcClient getUcClient() {
        return ucClient;
    }

    public void setUcClient(IUcClient paramUcClient) {
        ucClient = paramUcClient;
    }

    public Double getTotalPanier() {
        totalPanier = 0.0;
        if (!commandeDto.getLignesDeCommande().isEmpty()) {
            for (LigneDeCommandeDto l : commandeDto.getLignesDeCommande()) {
                totalPanier += l.getProduit().getPrix() * l.getQuantite();
            }
        }
        panierFraisLivraison = totalPanier + 5.5;
        return totalPanier;
    }

    public void setTotalPanier(Double paramTotalPanier) {
        totalPanier = paramTotalPanier;
    }

    public int getTotalProduits() {
        return totalProduits;
    }

    public void setTotalProduits(int paramTotalProduits) {
        totalProduits = paramTotalProduits;
    }

    public ConnectionMb getConnectionMb() {
        return connectionMb;
    }

    public void setConnectionMb(ConnectionMb paramConnectionMb) {
        connectionMb = paramConnectionMb;
    }

    public UtilisateurDto getUser() {
        return user;
    }

    public void setUser(UtilisateurDto paramUser) {
        user = paramUser;
    }

    public ClientMb getClientMb() {
        return clientMb;
    }

    public void setClientMb(ClientMb paramClientMb) {
        clientMb = paramClientMb;
    }

    public Map<LigneDeCommandeDto, Double> getMapLigneCmd() {
        return mapLigneCmd;
    }

    public void setMapLigneCmd(Map<LigneDeCommandeDto, Double> paramMapLigneCmd) {
        mapLigneCmd = paramMapLigneCmd;
    }

    public Double getPanierFraisLivraison() {
        return panierFraisLivraison;
    }

    public void setPanierFraisLivraison(Double paramPanierFraisLivraison) {
        panierFraisLivraison = paramPanierFraisLivraison;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String paramCoupon) {
        coupon = paramCoupon;
    }
}
