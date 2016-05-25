package fr.s2re.dto;

import java.io.Serializable;
import java.util.List;

public class CategorieDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;
    private List<CategorieDto> categories;
    private CategorieDto categorieParent;
    private List<ProduitDto> produits;

    public CategorieDto() {
        super();
    }

    public CategorieDto(Integer paramId, String paramLibelle, CategorieDto paramCategorieParent) {
        super();
        id = paramId;
        libelle = paramLibelle;
        categorieParent = paramCategorieParent;
    }

    public CategorieDto(Integer paramId, String paramLibelle, List<CategorieDto> paramCategories, CategorieDto paramCategorieParent,
            List<ProduitDto> paramProduits) {
        super();
        id = paramId;
        libelle = paramLibelle;
        categories = paramCategories;
        categorieParent = paramCategorieParent;
        produits = paramProduits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }

    public List<CategorieDto> getCategories() {
        return categories;
    }

    public void setCategories(List<CategorieDto> paramCategories) {
        categories = paramCategories;
    }

    public CategorieDto getCategorieParent() {
        return categorieParent;
    }

    public void setCategorieParent(CategorieDto paramCategorieParent) {
        categorieParent = paramCategorieParent;
    }

    public List<ProduitDto> getProduits() {
        return produits;
    }

    public void setProduits(List<ProduitDto> paramProduits) {
        produits = paramProduits;
    }
}