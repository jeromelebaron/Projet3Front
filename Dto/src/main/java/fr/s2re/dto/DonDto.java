package fr.s2re.dto;

import java.io.Serializable;

public class DonDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer quantite;
    private ProduitDto produit;
    private AssociationDto association;

    public DonDto() {
        super();
    }

    public DonDto(Integer paramId, Integer paramQuantite, ProduitDto paramProduit, AssociationDto paramAssociation) {
        super();
        id = paramId;
        quantite = paramQuantite;
        produit = paramProduit;
        association = paramAssociation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer paramQuantite) {
        quantite = paramQuantite;
    }

    public ProduitDto getProduit() {
        return produit;
    }

    public void setProduit(ProduitDto paramProduit) {
        produit = paramProduit;
    }

    public AssociationDto getAssociation() {
        return association;
    }

    public void setAssociation(AssociationDto paramAssociation) {
        association = paramAssociation;
    }
}