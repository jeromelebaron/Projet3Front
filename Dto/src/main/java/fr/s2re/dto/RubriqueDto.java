package fr.s2re.dto;

import java.io.Serializable;
import java.util.List;

public class RubriqueDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String libelle;
    private List<SujetDto> sujets;
    private List<RubriqueDto> rubriques;
    private RubriqueDto rubriqueParent;

    public RubriqueDto() {
        super();
    }

    public RubriqueDto(Integer paramId, String paramLibelle) {
        super();
        id = paramId;
        libelle = paramLibelle;
    }

    public RubriqueDto(Integer paramId, String paramLibelle, RubriqueDto paramRubriqueParent) {
        super();
        id = paramId;
        libelle = paramLibelle;
        rubriqueParent = paramRubriqueParent;
    }

    public RubriqueDto(Integer paramId, String paramLibelle, List<SujetDto> paramSujets, List<RubriqueDto> paramRubriques,
            RubriqueDto paramRubriqueParent) {
        super();
        id = paramId;
        libelle = paramLibelle;
        sujets = paramSujets;
        rubriques = paramRubriques;
        rubriqueParent = paramRubriqueParent;
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

    public List<SujetDto> getSujets() {
        return sujets;
    }

    public void setSujets(List<SujetDto> paramSujets) {
        sujets = paramSujets;
    }

    public List<RubriqueDto> getRubriques() {
        return rubriques;
    }

    public void setRubriques(List<RubriqueDto> paramRubriques) {
        rubriques = paramRubriques;
    }

    public RubriqueDto getRubriqueParent() {
        return rubriqueParent;
    }

    public void setRubriqueParent(RubriqueDto paramRubriqueParent) {
        rubriqueParent = paramRubriqueParent;
    }
}