package fr.s2re.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.EtatCommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcVendeur;

@ManagedBean
@SessionScoped
public class HistoriqueVenteMb {
    private static Logger log = Logger.getLogger(HistoriqueCommandeMb.class);

    private final static String URL_LOGIN = "login.xhtml?faces-redirect=true";

    private EtatCommandeDto etatCommande;

    private String textBouton;

    private ProduitDto p = null;

    private List<ProduitDto> produits = null;

    private List<String> reference;

    private List<String> couleur;

    private List<String> marque;

    private int etat;

    private List<CommandeDto> lcommande = null;

    private List<CommandeDto> lventeEnCour = null;

    private List<LigneDeCommandeDto> lg = new ArrayList<>();

    @ManagedProperty(value = "#{connectionMb}")
    private ConnectionMb connectionMb;

    private UtilisateurDto utilisateur;

    private ClientDto client;

    @EJB
    private IUcVendeur ucVendeur;

    @EJB
    private IUcClient ucClient;

    private Boolean tets = false;

    public String getTextBouton() {
        return textBouton;
    }

    public void setTextBouton(String textBouton) {
        this.textBouton = textBouton;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public List<CommandeDto> getLventeEnCour() {
        return lventeEnCour;
    }

    public void setLventeEnCour(List<CommandeDto> lventeEnCour) {
        this.lventeEnCour = lventeEnCour;
    }

    public Boolean getTets() {
        return tets;
    }

    public void setTets(Boolean tets) {
        this.tets = tets;
    }

    @PostConstruct
    public void init() {
        if (connectionMb.getUser() != null && connectionMb != null && connectionMb.getUser().getClass() == ClientDto.class) {
            client = (ClientDto) connectionMb.getUser();
        } else {
            client = null;
        }
    }

    public String gererVente() {
        if (client == null) {
            log.info("Client non connecté");
            return URL_LOGIN;
        } else {
            log.info("Client connecté : " + client.getId() + " actif : " + client.getActif());
            return "/profilClient.xhtml?faces-redirect=true";
        }
    }

    public String produitEnVente() {
        if (client == null) {
            log.info("Client non connecté");
            return URL_LOGIN;
        } else {
            log.info("Client connecté : " + client.getId() + " actif : " + client.getActif());
            produits = ucVendeur.voirVentesEnCours(client);
            return "/venteEnCour.xhtml?faces-redirect=true";
        }
    }

    public String historiqueProduit() {
        if (client == null) {
            log.info("Client non connecté");
            return URL_LOGIN;
        } else {
            log.info("Client connecté : " + client.getId() + " actif : " + client.getActif());
            lcommande = ucVendeur.voirHistoriqueVentes(client);
            lventeEnCour = ucVendeur.voirVentesEnPreparation(client);
            if (!lventeEnCour.isEmpty()) {
                for (CommandeDto c : lventeEnCour) {
                    log.info("coucou");
                    c.setLignesDeCommande(ucClient.afficherLignesDeCommande(c));
                }
            }
            return "/historiqueVentes.xhtml?faces-redirect=true";
        }
    }

    public void validerCommande(CommandeDto commande) {
        commande.getEtat().setId(3);
        commande = ucVendeur.modifierCommande(commande);
        log.info(commande.getEtat().getLibelle());
    }

    public void supprimerProduit(ProduitDto p) {
        ucVendeur.supprimer(p);
    }

    public void modifierProduit(ProduitDto paramProduitDto) {

        p = ucVendeur.modifier(paramProduitDto);

    }

    public void loadSupprime() {
        if (FacesContext.getCurrentInstance().isPostback()) { // c quand on revient sur la mm page
            produitEnVente();
        }
    }

    public void loadetat() {
        if (FacesContext.getCurrentInstance().isPostback()) { // c quand on revient sur la mm page
            historiqueProduit();
        }
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public List<ProduitDto> getProduits() {
        return produits;
    }

    public void setProduits(List<ProduitDto> produits) {
        this.produits = produits;
    }

    public UtilisateurDto getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurDto utilisateur) {
        this.utilisateur = utilisateur;
    }

    public IUcVendeur getUcVendeur() {
        return ucVendeur;
    }

    public void setUcVendeur(IUcVendeur ucVendeur) {
        this.ucVendeur = ucVendeur;
    }

    public List<CommandeDto> getLcommande() {
        return lcommande;
    }

    public void setLcommande(List<CommandeDto> lcommande) {
        this.lcommande = lcommande;
    }

    public void getrefrence() {
        for (ProduitDto p1 : produits) {
            reference.add(p1.getReference());
        }
    }

    public void getcouleur() {
        for (ProduitDto p1 : produits) {
            couleur.add(p1.getCouleur().getLibelle());
        }
    }

    public void getmarque() {
        for (ProduitDto p1 : produits) {
            marque.add(p1.getMarque().getLibelle());
        }
    }

    public List<String> getReference() {
        return reference;
    }

    public void setReference(List<String> reference) {
        this.reference = reference;
    }

    public List<String> getCouleur() {
        return couleur;
    }

    public void setCouleur(List<String> couleur) {
        this.couleur = couleur;
    }

    public List<String> getMarque() {
        return marque;
    }

    public void setMarque(List<String> marque) {
        this.marque = marque;
    }

    public ConnectionMb getConnectionMb() {
        return connectionMb;
    }

    public void setConnectionMb(ConnectionMb connectionMb) {
        this.connectionMb = connectionMb;
    }

    public ProduitDto getP() {
        return p;
    }

    public void setP(ProduitDto p) {
        this.p = p;
    }

    public void test() {
        this.setTets(true);

    }

    public EtatCommandeDto getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(EtatCommandeDto etatCommande) {
        this.etatCommande = etatCommande;
    }

    public List<LigneDeCommandeDto> getLg() {
        return lg;
    }

    public void setLg(List<LigneDeCommandeDto> paramLg) {
        lg = paramLg;
    }
}
