package fr.s2re.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adresse")
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(length = 50, name = "libelle", nullable = true)
    private String libelle;

    @Column(name = "numero", length = 10, nullable = false)
    private String numero;

    @Column(name = "rue", length = 50, nullable = false)
    private String rue;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    @Column(name = "type", length = 50, nullable = false)
    private String type;

    @Column(name = "longitude", nullable = true, columnDefinition = "Decimal(10,0)")
    private BigDecimal longitude;

    @Column(name = "latitude", nullable = true, columnDefinition = "Decimal(10,0)")
    private BigDecimal latitude;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = true)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_ville", nullable = false)
    private Ville ville;

    public Adresse() {
        super();
    }

    public Adresse(Integer paramId, String paramLibelle, String paramNumero, String paramRue, Boolean paramPublie, String paramType,
            BigDecimal paramLongitude, BigDecimal paramLatitude, Client paramClient, Ville paramVille) {
        super();
        id = paramId;
        libelle = paramLibelle;
        numero = paramNumero;
        rue = paramRue;
        publie = paramPublie;
        type = paramType;
        longitude = paramLongitude;
        latitude = paramLatitude;
        client = paramClient;
        ville = paramVille;
    }

    public Adresse(String paramLibelle, String paramNumero, String paramRue, Boolean paramPublie, String paramType,
            BigDecimal paramLongitude, BigDecimal paramLatitude, Client paramClient, Ville paramVille) {
        super();
        libelle = paramLibelle;
        numero = paramNumero;
        rue = paramRue;
        publie = paramPublie;
        type = paramType;
        longitude = paramLongitude;
        latitude = paramLatitude;
        client = paramClient;
        ville = paramVille;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String paramNumero) {
        numero = paramNumero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String paramRue) {
        rue = paramRue;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }

    public String getType() {
        return type;
    }

    public void setType(String paramType) {
        type = paramType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client paramClient) {
        client = paramClient;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville paramVille) {
        ville = paramVille;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Adresse [libelle=" + libelle + ", numero=" + numero + ", rue=" + rue + ", type=" + type + ", ville=" + ville + "]";
    }
}