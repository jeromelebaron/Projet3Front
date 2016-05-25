package fr.s2re.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class AdresseDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;
    private String numero;
    private String rue;
    private Boolean publie;
    private String type;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private ClientDto client;
    private VilleDto ville;

    public AdresseDto() {
        super();
    }

    public AdresseDto(Integer paramId, String paramLibelle, String paramNumero, String paramRue, Boolean paramPublie, String paramType,
            BigDecimal paramLongitude, BigDecimal paramLatitude, ClientDto paramClient, VilleDto paramVille) {
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

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto paramClient) {
        client = paramClient;
    }

    public VilleDto getVille() {
        return ville;
    }

    public void setVille(VilleDto paramVille) {
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
        return "AdresseDto [libelle=" + libelle + ", numero=" + numero + ", rue=" + rue + ", ville=" + ville + "]";
    }
}