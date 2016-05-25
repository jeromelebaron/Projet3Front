package fr.s2re.dto;

import java.io.Serializable;
import java.util.List;

public class ProduitDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String reference;
    private String libelle;
    private String description;
    private Integer quantite;
    private Double prix;
    private Boolean publie;
    private CouleurDto couleur;
    private List<ProduitDto> produitsClients;
    private ProduitDto produitParent;
    private ClientDto vendeur;
    private EtatProduitDto etat;
    private List<NoteProduitDto> notes;
    private CategorieDto categorie;
    private List<AlerteProduitDto> alertes;
    // private List<CodeReductionDto> codeReductions;
    private MarqueDto marque;
    private List<ProduitCodeReductionDto> produitsCodesReduction;
    private List<ImageDto> images;

    public ProduitDto() {
        super();
    }

    public ProduitDto(Integer paramId, String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite,
            Double paramPrix, Boolean paramPublie, CouleurDto paramCouleur, ClientDto paramVendeur, EtatProduitDto paramEtat,
            CategorieDto paramCategorie, MarqueDto paramMarque) {
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

    public ProduitDto(Integer paramId, String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite,
            Double paramPrix, Boolean paramPublie, CouleurDto paramCouleur, ProduitDto paramProduitParent, ClientDto paramVendeur,
            EtatProduitDto paramEtat, CategorieDto paramCategorie, MarqueDto paramMarque) {
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

    public ProduitDto(Integer paramId, String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite,
            Double paramPrix, Boolean paramPublie, CouleurDto paramCouleur, List<ProduitDto> paramProduitsClients,
            ProduitDto paramProduitParent, ClientDto paramVendeur, EtatProduitDto paramEtat, List<NoteProduitDto> paramNotes,
            CategorieDto paramCategorie, List<AlerteProduitDto> paramAlertes,
            /* List<CodeReductionDto> paramCodeReductions, */MarqueDto paramMarque,
            List<ProduitCodeReductionDto> paramProduitsCodesReduction, List<ImageDto> paramImages) {
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

    public ProduitDto(String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite, Double paramPrix,
            Boolean paramPublie, CouleurDto paramCouleur, ClientDto paramVendeur, EtatProduitDto paramEtat, CategorieDto paramCategorie,
            MarqueDto paramMarque) {
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

    public ProduitDto(String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite, Double paramPrix,
            Boolean paramPublie, CouleurDto paramCouleur, ProduitDto paramProduitParent, ClientDto paramVendeur, EtatProduitDto paramEtat,
            CategorieDto paramCategorie, MarqueDto paramMarque) {
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

    public ProduitDto(String paramReference, String paramLibelle, String paramDescription, Integer paramQuantite, Double paramPrix,
            Boolean paramPublie, CouleurDto paramCouleur, List<ProduitDto> paramProduitsClients, ProduitDto paramProduitParent,
            ClientDto paramVendeur, EtatProduitDto paramEtat, List<NoteProduitDto> paramNotes, CategorieDto paramCategorie,
            List<AlerteProduitDto> paramAlertes, /* List<CodeReductionDto> paramCodeReductions, */MarqueDto paramMarque,
            List<ProduitCodeReductionDto> paramProduitsCodesReduction, List<ImageDto> paramImages) {
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

    public CouleurDto getCouleur() {
        return couleur;
    }

    public void setCouleur(CouleurDto paramCouleur) {
        couleur = paramCouleur;
    }

    public List<ProduitDto> getProduitsClients() {
        return produitsClients;
    }

    public void setProduitsClients(List<ProduitDto> paramProduitsClients) {
        produitsClients = paramProduitsClients;
    }

    public ProduitDto getProduitParent() {
        return produitParent;
    }

    public void setProduitParent(ProduitDto paramProduitParent) {
        produitParent = paramProduitParent;
    }

    public ClientDto getVendeur() {
        return vendeur;
    }

    public void setVendeur(ClientDto paramVendeur) {
        vendeur = paramVendeur;
    }

    public EtatProduitDto getEtat() {
        return etat;
    }

    public void setEtat(EtatProduitDto paramEtat) {
        etat = paramEtat;
    }

    public List<NoteProduitDto> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteProduitDto> paramNotes) {
        notes = paramNotes;
    }

    public CategorieDto getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieDto paramCategorie) {
        categorie = paramCategorie;
    }

    public List<AlerteProduitDto> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<AlerteProduitDto> paramAlertes) {
        alertes = paramAlertes;
    }

    /*
     * public List<CodeReductionDto> getCodeReductions() { return codeReductions; } public void setCodeReductions(List<CodeReductionDto>
     * paramCodeReductions) { codeReductions = paramCodeReductions; }
     */
    public MarqueDto getMarque() {
        return marque;
    }

    public void setMarque(MarqueDto paramMarque) {
        marque = paramMarque;
    }

    public List<ProduitCodeReductionDto> getProduitsCodesReduction() {
        return produitsCodesReduction;
    }

    public void setProduitsCodesReduction(List<ProduitCodeReductionDto> paramProduitsCodesReduction) {
        produitsCodesReduction = paramProduitsCodesReduction;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<ImageDto> getImages() {
        return images;
    }

    public void setImages(List<ImageDto> images) {
        this.images = images;
    }
}