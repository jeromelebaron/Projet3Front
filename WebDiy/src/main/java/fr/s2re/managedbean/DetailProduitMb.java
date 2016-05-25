package fr.s2re.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@SessionScoped
public class DetailProduitMb {
    private ProduitDto produit;

    private List<ProduitDto> listProduits;

    private Double noteMoyenne = 0.0;

    @EJB
    private IUcUtilisateur ucUtilisateur;

    @PostConstruct
    public void init() {
        setListProduits(ucUtilisateur.getAllProduit());
    }

    public String afficherDetailProduit(int paramId) {
        produit = new ProduitDto();
        noteMoyenne = 0.0;
        produit = ucUtilisateur.getById(paramId);
        for (NoteProduitDto n : produit.getNotes()) {
            noteMoyenne += n.getNote();
        }
        noteMoyenne = noteMoyenne / produit.getNotes().size();
        return "/single.xhtml?faces-redirect=true";
    }

    public final ProduitDto getProduit() {
        return produit;
    }

    public final void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }

    public final IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public final void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    public Double getNoteMoyenne() {
        return noteMoyenne;
    }

    public void setNoteMoyenne(Double paramNoteMoyenne) {
        noteMoyenne = paramNoteMoyenne;
    }

    public List<ProduitDto> getListProduits() {
        return listProduits;
    }

    public void setListProduits(List<ProduitDto> paramListProduits) {
        listProduits = paramListProduits;
    }
}