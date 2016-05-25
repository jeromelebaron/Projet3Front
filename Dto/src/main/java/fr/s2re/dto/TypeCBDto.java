package fr.s2re.dto;

import java.io.Serializable;

public class TypeCBDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;
    private String url;

    public TypeCBDto() {
        super();
    }

    public TypeCBDto(Integer paramId, String paramLibelle, String paramUrl) {
        super();
        id = paramId;
        libelle = paramLibelle;
        url = paramUrl;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String paramUrl) {
        url = paramUrl;
    }
}