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
@Table(name = "produit")
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "reference", length = 25, nullable = false)
    private String reference;

    @Column(name = "libelle", length = 100, nullable = false)
    private String libelle;

    @Column(name = "description", length = 1000, nullable = true)
    private String description;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @Column(name = "prix", columnDefinition = "Decimal(7,2)", nullable = true)
    private Double prix;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    @ManyToOne
    @JoinColumn(name = "id_couleur", nullable = true)
    private Couleur couleur;

    @OneToMany(mappedBy = "produitParent")
    private List<Produit> produitsClients;

    @ManyToOne
    @JoinColumn(name = "id_produit_parent", nullable = true)
    private Produit produitParent;

    @ManyToOne
    @JoinColumn(name = "id_vendeur", nullable = true)
    private Client vendeur;

    @ManyToOne
    @JoinColumn(name = "id_etat", nullable = false)
    private EtatProduit etat;

    @OneToMany(mappedBy = "produit")
    private List<NoteProduit> notes;

    @ManyToOne
    @JoinColumn(name = "id_categorie", nullable = false)
    private Categorie categorie;

    @OneToMany(mappedBy = "produit")
    private List<AlerteProduit> alertes;

    // private List<CodeReduction> codeReductions;
    @ManyToOne
    @JoinColumn(name = "id_marque", nullable = true)
    private Marque marque;

    @OneToMany(mappedBy = "produit")
    private List<ProduitCodeReduction> produitsCodesReduction;

    @OneToMany(mappedBy = "produit")
    private List<Image> images;

    public Produit() {
        super();
    }

    public Produit(Integer paramId, String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite,
            Double paramPrix, Boolean paramPublie, Couleur paramCouleur, Client paramVendeur, EtatProduit paramEtat,
            Categorie paramCategorie, Marque paramMarque) {
        super();
        id = paramId;
        reference = paramReference;
        libelle = paramLibelle;
        description = paramDescription;
        quantite = paramQuantite;
        prix = paramPrix;
        publie = paramPublie;
        couleur = paramCouleur;
        vendeur = paramVendeur;
        etat = paramEtat;
        categorie = paramCategorie;
        marque = paramMarque;
    }

    public Produit(Integer paramId, String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite,
            Double paramPrix, Boolean paramPublie, Couleur paramCouleur, Produit paramProduitParent, Client paramVendeur,
            EtatProduit paramEtat, Categorie paramCategorie, Marque paramMarque) {
        super();
        id = paramId;
        reference = paramReference;
        libelle = paramLibelle;
        description = paramDescription;
        quantite = paramQuantite;
        prix = paramPrix;
        publie = paramPublie;
        couleur = paramCouleur;
        produitParent = paramProduitParent;
        vendeur = paramVendeur;
        etat = paramEtat;
        categorie = paramCategorie;
        marque = paramMarque;
    }

    public Produit(Integer paramId, String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite,
            Double paramPrix, Boolean paramPublie, Couleur paramCouleur, List<Produit> paramProduitsClients, Produit paramProduitParent,
            Client paramVendeur, EtatProduit paramEtat, List<NoteProduit> paramNotes, Categorie paramCategorie,
            List<AlerteProduit> paramAlertes, /* List<CodeReduction> paramCodeReductions, */Marque paramMarque,
            List<ProduitCodeReduction> paramProduitsCodesReduction, List<Image> paramImages) {
        super();
        id = paramId;
        reference = paramReference;
        libelle = paramLibelle;
        description = paramDescription;
        quantite = paramQuantite;
        prix = paramPrix;
        publie = paramPublie;
        couleur = paramCouleur;
        produitsClients = paramProduitsClients;
        produitParent = paramProduitParent;
        vendeur = paramVendeur;
        etat = paramEtat;
        notes = paramNotes;
        categorie = paramCategorie;
        alertes = paramAlertes;
        // codeReductions = paramCodeReductions;
        marque = paramMarque;
        produitsCodesReduction = paramProduitsCodesReduction;
        images = paramImages;
    }

    public Produit(String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite, Double paramPrix,
            Boolean paramPublie, Couleur paramCouleur, Client paramVendeur, EtatProduit paramEtat, Categorie paramCategorie,
            Marque paramMarque) {
        super();
        reference = paramReference;
        libelle = paramLibelle;
        description = paramDescription;
        quantite = paramQuantite;
        prix = paramPrix;
        publie = paramPublie;
        couleur = paramCouleur;
        vendeur = paramVendeur;
        etat = paramEtat;
        categorie = paramCategorie;
        marque = paramMarque;
    }

    public Produit(String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite, Double paramPrix,
            Boolean paramPublie, Couleur paramCouleur, Produit paramProduitParent, Client paramVendeur, EtatProduit paramEtat,
            Categorie paramCategorie, Marque paramMarque) {
        super();
        reference = paramReference;
        libelle = paramLibelle;
        description = paramDescription;
        quantite = paramQuantite;
        prix = paramPrix;
        publie = paramPublie;
        couleur = paramCouleur;
        produitParent = paramProduitParent;
        vendeur = paramVendeur;
        etat = paramEtat;
        categorie = paramCategorie;
        marque = paramMarque;
    }

    public Produit(String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite, Double paramPrix,
            Boolean paramPublie, Couleur paramCouleur, List<Produit> paramProduitsClients, Produit paramProduitParent, Client paramVendeur,
            EtatProduit paramEtat, List<NoteProduit> paramNotes, Categorie paramCategorie, List<AlerteProduit> paramAlertes,
            /* List<CodeReduction> paramCodeReductions, */Marque paramMarque, List<ProduitCodeReduction> paramProduitsCodesReduction,
            List<Image> paramImages) {
        super();
        reference = paramReference;
        libelle = paramLibelle;
        description = paramDescription;
        quantite = paramQuantite;
        prix = paramPrix;
        publie = paramPublie;
        couleur = paramCouleur;
        produitsClients = paramProduitsClients;
        produitParent = paramProduitParent;
        vendeur = paramVendeur;
        etat = paramEtat;
        notes = paramNotes;
        categorie = paramCategorie;
        alertes = paramAlertes;
        // codeReductions = paramCodeReductions;
        marque = paramMarque;
        produitsCodesReduction = paramProduitsCodesReduction;
        images = paramImages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String paramReference) {
        reference = paramReference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String paramDescription) {
        description = paramDescription;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer paramQuantite) {
        quantite = paramQuantite;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double paramPrix) {
        prix = paramPrix;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur paramCouleur) {
        couleur = paramCouleur;
    }

    public List<Produit> getProduitsClients() {
        return produitsClients;
    }

    public void setProduitsClients(List<Produit> paramProduitsClients) {
        produitsClients = paramProduitsClients;
    }

    public Produit getProduitParent() {
        return produitParent;
    }

    public void setProduitParent(Produit paramProduitParent) {
        produitParent = paramProduitParent;
    }

    public Client getVendeur() {
        return vendeur;
    }

    public void setVendeur(Client paramVendeur) {
        vendeur = paramVendeur;
    }

    public EtatProduit getEtat() {
        return etat;
    }

    public void setEtat(EtatProduit paramEtat) {
        etat = paramEtat;
    }

    public List<NoteProduit> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteProduit> paramNotes) {
        notes = paramNotes;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie paramCategorie) {
        categorie = paramCategorie;
    }

    public List<AlerteProduit> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<AlerteProduit> paramAlertes) {
        alertes = paramAlertes;
    }

    /*
     * public List<CodeReduction> getCodeReductions() { return codeReductions; } public void setCodeReductions(List<CodeReduction>
     * paramCodeReductions) { codeReductions = paramCodeReductions; }
     */
    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque paramMarque) {
        marque = paramMarque;
    }

    public List<ProduitCodeReduction> getProduitsCodesReduction() {
        return produitsCodesReduction;
    }

    public void setProduitsCodesReduction(List<ProduitCodeReduction> paramProduitsCodesReduction) {
        produitsCodesReduction = paramProduitsCodesReduction;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}