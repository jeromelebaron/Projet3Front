package fr.s2re.dto;

import java.io.Serializable;

public class ObjetAlerteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;

    public ObjetAlerteDto() {
        super();
    }

    public ObjetAlerteDto(Integer paramId, String paramLibelle) {
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