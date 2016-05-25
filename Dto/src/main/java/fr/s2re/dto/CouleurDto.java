package fr.s2re.dto;

import java.io.Serializable;

public class CouleurDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;

    public CouleurDto() {
        super();
    }

    public CouleurDto(Integer paramId, String paramLibelle) {
        super();
        id = paramId;
        libelle = paramLibelle;
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
}