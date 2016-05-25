package fr.s2re.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "don")
public class Don implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "quantite", length = 5, nullable = false)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "id_association", nullable = false)
    private Association association;

    public Don() {
        super();
    }

    public Don(Integer paramId, Integer paramQuantite, Produit paramProduit, Association paramAssociation) {
        super();
        id = paramId;
        quantite = paramQuantite;
        produit = paramProduit;
        association = paramAssociation;
    }

    public Don(Integer paramQuantite, Produit paramProduit, Association paramAssociation) {
        super();
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

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit paramProduit) {
        produit = paramProduit;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association paramAssociation) {
        association = paramAssociation;
    }
}