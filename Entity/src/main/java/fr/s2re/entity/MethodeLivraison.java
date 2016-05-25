package fr.s2re.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "methode_livraison", uniqueConstraints = @UniqueConstraint(columnNames = { "libelle" }) )
public class MethodeLivraison implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "libelle", length = 50, nullable = false)
    private String libelle;

    @Column(name = "prix", length = 5, precision = 2, nullable = true)
    private Double prix;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    public MethodeLivraison() {
        super();
    }

    public MethodeLivraison(Integer paramId, String paramLibelle, Double paramPrix, Boolean paramPublie) {
        super();
        id = paramId;
        libelle = paramLibelle;
        prix = paramPrix;
        publie = paramPublie;
    }

    public MethodeLivraison(String paramLibelle, Double paramPrix, Boolean paramPublie) {
        super();
        libelle = paramLibelle;
        prix = paramPrix;
        publie = paramPublie;
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
}