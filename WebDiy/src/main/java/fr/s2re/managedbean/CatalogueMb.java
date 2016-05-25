package fr.s2re.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import fr.s2re.dto.ImageDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcUtilisateur;

@ManagedBean
@RequestScoped
public class CatalogueMb {
    private ImageDto image;

    private List<ProduitDto> listProduits;

    private String message;

    @EJB
    private IUcUtilisateur ucUtilisateur;

    @PostConstruct
    public void init() {
        listProduits = ucUtilisateur.getAllProduit();
    }

    public List<ProduitDto> getListProduits() {
        return listProduits;
    }

    public void setListProduits(List<ProduitDto> paramListProduits) {
        listProduits = paramListProduits;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String paramMessage) {
        message = paramMessage;
    }

    public IUcUtilisateur getUcUtilisateur() {
        return ucUtilisateur;
    }

    public void setUcUtilisateur(IUcUtilisateur paramUcUtilisateur) {
        ucUtilisateur = paramUcUtilisateur;
    }

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto paramImage) {
        image = paramImage;
    }
}
