package fr.s2re.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {

    /**
     * Pour la sérialisation.
     */
    private static final long serialVersionUID = 6942394910844678055L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "libelle", length = 50, nullable = false)
    private String libelle;

    @OneToMany(mappedBy = "categorieParent")
    private List<Categorie> categories;

    @ManyToOne
    @JoinColumn(name = "id_categorie_parent", nullable = true)
    private Categorie categorieParent;

    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;

    public Categorie() {
        super();
    }

    public Categorie(Integer paramId, String paramLibelle, Categorie paramCategorieParent) {
        super();
        id = paramId;
        libelle = paramLibelle;
        categorieParent = paramCategorieParent;
    }

    public Categorie(Integer paramId, String paramLibelle, List<Categorie> paramCategories, Categorie paramCategorieParent,
            List<Produit> paramProduits) {
        super();
        id = paramId;
        libelle = paramLibelle;
        categories = paramCategories;
        categorieParent = paramCategorieParent;
        produits = paramProduits;
    }

    public Categorie(String paramLibelle, List<Categorie> paramCategories, Categorie paramCategorieParent, List<Produit> paramProduits) {
        super();
        libelle = paramLibelle;
        categories = paramCategories;
        categorieParent = paramCategorieParent;
        produits = paramProduits;
    }

    public Categorie(String paramLibelle, Categorie paramCategorieParent) {
        super();
        libelle = paramLibelle;
        categorieParent = paramCategorieParent;
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

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> paramCategories) {
        categories = paramCategories;
    }

    public Categorie getCategorieParent() {
        return categorieParent;
    }

    public void setCategorieParent(Categorie paramCategorieParent) {
        categorieParent = paramCategorieParent;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> paramProduits) {
        produits = paramProduits;
    }
}