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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ligne_de_commande",

uniqueConstraints = @UniqueConstraint(columnNames = { "id_commande", "id_produit" }) )
public class LigneDeCommande implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "quantite", length = 5, nullable = false)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "id_commande", nullable = false)
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private Produit produit;

    public LigneDeCommande() {
        super();
    }

    public LigneDeCommande(Integer paramId, Integer paramQuantite, Commande paramCommande, Produit paramProduit) {
        super();
        id = paramId;
        quantite = paramQuantite;
        commande = paramCommande;
        produit = paramProduit;
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

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande paramCommande) {
        commande = paramCommande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit paramProduit) {
        produit = paramProduit;
    }
}