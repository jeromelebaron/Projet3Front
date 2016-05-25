package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "retour")
public class Retour implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero", length = 25, nullable = false)
    private String numero;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "quantite", length = 5, nullable = false)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "id_ligne_de_commande", nullable = false)
    private LigneDeCommande ligneDeCommande;

    @ManyToOne
    @JoinColumn(name = "id_rib", nullable = false)
    private Rib rib;

    @ManyToOne
    @JoinColumn(name = "id_type", nullable = false)
    private TypeRetour type;

    public Retour() {
        super();
    }

    public Retour(Integer paramId, String paramNumero, Date paramDate, Integer paramQuantite, LigneDeCommande paramLigneDeCommande,
            Rib paramRib, TypeRetour paramType) {
        super();
        id = paramId;
        numero = paramNumero;
        date = paramDate;
        quantite = paramQuantite;
        ligneDeCommande = paramLigneDeCommande;
        rib = paramRib;
        type = paramType;
    }

    public Retour(String paramNumero, Date paramDate, Integer paramQuantite, LigneDeCommande paramLigneDeCommande, Rib paramRib,
            TypeRetour paramType) {
        super();
        numero = paramNumero;
        date = paramDate;
        quantite = paramQuantite;
        ligneDeCommande = paramLigneDeCommande;
        rib = paramRib;
        type = paramType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String paramNumero) {
        numero = paramNumero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date paramDate) {
        date = paramDate;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer paramQuantite) {
        quantite = paramQuantite;
    }

    public LigneDeCommande getLigneDeCommande() {
        return ligneDeCommande;
    }

    public void setLigneDeCommande(LigneDeCommande paramLigneDeCommande) {
        ligneDeCommande = paramLigneDeCommande;
    }

    public Rib getRib() {
        return rib;
    }

    public void setRib(Rib paramRib) {
        rib = paramRib;
    }

    public TypeRetour getType() {
        return type;
    }

    public void setType(TypeRetour paramType) {
        type = paramType;
    }
}