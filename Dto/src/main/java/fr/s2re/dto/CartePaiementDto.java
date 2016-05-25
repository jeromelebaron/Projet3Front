package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;

public class CartePaiementDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String numero;
    private String detenteur;
    private Date dateExpiration;
    private Boolean publie;
    private ClientDto client;
    private TypeCBDto type;

    public CartePaiementDto() {
        super();
    }

    public CartePaiementDto(Integer paramId, String paramNumero, String paramDetenteur, Date paramDateExpiration, Boolean paramPublie,
            ClientDto paramClient, TypeCBDto paramType) {
        super();
        id = paramId;
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

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto paramClient) {
        client = paramClient;
    }

    public TypeCBDto getType() {
        return type;
    }

    public void setType(TypeCBDto paramType) {
        type = paramType;
    }
}