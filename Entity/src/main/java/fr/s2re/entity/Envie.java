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
@Table(name = "envie", uniqueConstraints = @UniqueConstraint(columnNames = { "id_produit", "id_client" }) )
public class Envie implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "quantite", length = 5, nullable = true)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    public Envie() {
        super();
    }

    public Envie(Integer paramId, Integer paramQuantite, Produit paramProduit, Client paramClient) {
        super();
        id = paramId;
        quantite = paramQuantite;
        produit = paramProduit;
        client = paramClient;
    }

    public Envie(Integer paramQuantite, Produit paramProduit, Client paramClient) {
        super();
        quantite = paramQuantite;
        produit = paramProduit;
        client = paramClient;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client paramClient) {
        client = paramClient;
    }
}