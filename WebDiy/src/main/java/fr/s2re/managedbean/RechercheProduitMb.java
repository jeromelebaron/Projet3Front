package fr.s2re.managedbean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@SessionScoped
public class RechercheProduitMb {
    private Logger log = Logger.getLogger(RechercheProduitMb.class);

    private List<ProduitDto> listProduits;

    private String libelle = "";

    @EJB
    private IUcUtilisateur ucUtilisateur;

    public String rechercheProduit() {
        listProduits = ucUtilisateur.getProduitByLibelle(libelle);
        log.info("taille liste dans rechercheByLibelle : " + listProduits.size());
        for (ProduitDto p : listProduits) {
            log.info("produit : " + p.getId());
        }
        return "/rechercheProduit.xhtml?faces-redirect=true";
    }

    public String rechercheProduitByCat(int paramCategorie) {
        listProduits = ucUtilisateur.getProduitByCatg(paramCategorie);
        log.info("taille liste dans rechercheByCat : " + listProduits.size());
        for (ProduitDto p : listProduits) {
            log.info("produit : " + p.getId());
        }
        return "/rechercheProduit.xhtml?faces-redirect=true";
    }

    public List<ProduitDto> getListProduits() {
        return listProduits;
    }

    public void setListProduits(List<ProduitDto> paramListProduits) {
        listProduits = paramListProduits;
    }

    public IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }
}
