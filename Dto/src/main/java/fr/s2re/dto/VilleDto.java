package fr.s2re.dto;

import java.io.Serializable;

public class VilleDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String cp;
    private String nom;

    public VilleDto() {
        super();
    }

    public VilleDto(Integer paramId, String paramCp, String paramNom) {
        super();
        id = paramId;
        cp = paramCp;
        nom = paramNom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String paramCp) {
        cp = paramCp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        nom = paramNom;
    }
}