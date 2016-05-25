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
@Table(name = "carte_paiement")
public class CartePaiement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "numero", length = 50, nullable = false)
    private String numero;

    @Column(name = "detenteur", length = 50, nullable = false)
    private String detenteur;

    @Column(name = "date_expiration", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateExpiration;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_type", nullable = false)
    private TypeCB type;

    public CartePaiement() {
        super();
    }

    public CartePaiement(Integer paramId, String paramNumero, String paramDetenteur, Date paramDateExpiration, Boolean paramPublie,
            Client paramClient, TypeCB paramType) {
        super();
        id = paramId;
        numero = paramNumero;
        detenteur = paramDetenteur;
        dateExpiration = paramDateExpiration;
        publie = paramPublie;
        client = paramClient;
        type = paramType;
    }

    public CartePaiement(String paramNumero, String paramDetenteur, Date paramDateExpiration, Boolean paramPublie, Client paramClient,
            TypeCB paramType) {
        super();
        numero = paramNumero;
        detenteur = paramDetenteur;
        dateExpiration = paramDateExpiration;
        publie = paramPublie;
        client = paramClient;
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

    public String getDetenteur() {
        return detenteur;
    }

    public void setDetenteur(String paramDetenteur) {
        detenteur = paramDetenteur;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date paramDateExpiration) {
        dateExpiration = paramDateExpiration;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client paramClient) {
        client = paramClient;
    }

    public TypeCB getType() {
        return type;
    }

    public void setType(TypeCB paramType) {
        type = paramType;
    }
}