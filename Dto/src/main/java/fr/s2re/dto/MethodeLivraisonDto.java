package fr.s2re.dto;

import java.io.Serializable;

public class MethodeLivraisonDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;
    private Double prix;
    private Boolean publie;

    public MethodeLivraisonDto() {
        super();
    }

    public MethodeLivraisonDto(Integer paramId, String paramLibelle, Double paramPrix, Boolean paramPublie) {
        super();
        id = paramId;
        libelle = paramLibelle;
        prix = paramPrix;
        publie = paramPublie;
    }

    public MethodeLivraisonDto(String paramLibelle, Double paramPrix, Boolean paramPublie) {
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