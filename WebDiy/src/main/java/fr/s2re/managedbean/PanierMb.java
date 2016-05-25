package fr.s2re.managedbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.iuc.IUcClient;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@SessionScoped
public class PanierMb {
    private int totalProduits = 0;

    private int qte = 1;

    private String coupon;

    private Double totalPanier = 0.0;

    private Double panierFraisLivraison = 0.0;

    private UtilisateurDto user;

    private List<LigneDeCommandeDto> listLigneDeCommande = new ArrayList<>();

    private HashMap<LigneDeCommandeDto, Double> mapLigneCmd = new HashMap<>();

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
    }

    public String ajoutAuPanier(int paramIdProduit) {
        LigneDeCommandeDto ligne = new LigneDeCommandeDto();
        ligne.setQuantite(qte);
        ligne.setProduit(ucUtilisateur.getById(paramIdProduit));
        boolean produitDiff = true;
        if (!listLigneDeCommande.isEmpty()) {
            for (LigneDeCommandeDto l : listLigneDeCommande) {
                if (l.getProduit().getId() == ligne.getProduit().getId()) {
                    l.setQuantite(ligne.getQuantite() + l.getQuantite());
                    produitDiff = false;
                    break;
                }
            }
            if (produitDiff) {
                listLigneDeCommande.add(ligne);
            }
        } else {
            listLigneDeCommande.add(ligne);
        }
        for (LigneDeCommandeDto l : listLigneDeCommande) {
            mapLigneCmd.put(l, l.getProduit().getPrix() * l.getQuantite());
        }
        qte = 1;
        return "";
    }

    public String decrementeQteProduit(int paramIdPdt) {
        for (LigneDeCommandeDto l : listLigneDeCommande) {
            if (l.getProduit().getId() == paramIdPdt) {
                if (l.getQuantite() > 1) {
                    l.setQuantite(l.getQuantite() - 1);
                }
            }
            mapLigneCmd.put(l, l.getProduit().getPrix() * l.getQuantite());
        }
        return "";
    }

    public String incrementeQteProduit(int paramIdPdt) {
        for (LigneDeCommandeDto l : listLigneDeCommande) {
            if (l.getProduit().getId() == paramIdPdt) {
                l.setQuantite(l.getQuantite() + 1);
            }
            mapLigneCmd.put(l, l.getProduit().getPrix() * l.getQuantite());
        }
        return "";
    }

    public String supprProduit(Integer paramIdPdt) {
        Iterator<LigneDeCommandeDto> iterator = listLigneDeCommande.iterator();
        while (iterator.hasNext()) {
            Integer idProduit = iterator.next().getProduit().getId();
            if (idProduit == paramIdPdt) {
                // On supprime l'élément courant de la liste
                iterator.remove();
            }
        }
        return "";
    }

    public String viderPanier() {
        totalPanier = 0.0;
        totalProduits = 0;
        listLigneDeCommande = new ArrayList<>();
        coupon = "";
        mapLigneCmd = new HashMap<>();
        panierFraisLivraison = 0.0;
        qte = 0;
        return "accueil.xhtml?faces-redirect=true";
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int paramQte) {
        qte = paramQte;
    }

    public List<LigneDeCommandeDto> getListLigneDeCommande() {
        return listLigneDeCommande;
    }

    public void setListLigneDeCommande(List<LigneDeCommandeDto> paramListLigneDeCommande) {
        listLigneDeCommande = paramListLigneDeCommande;
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
        if (!listLigneDeCommande.isEmpty()) {
            for (LigneDeCommandeDto l : listLigneDeCommande) {
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
        totalProduits = 0;
        if (!listLigneDeCommande.isEmpty()) {
            for (LigneDeCommandeDto l : listLigneDeCommande) {
                totalProduits += l.getQuantite();
            }
        }
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

    public void setMapLigneCmd(HashMap<LigneDeCommandeDto, Double> paramMapLigneCmd) {
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
