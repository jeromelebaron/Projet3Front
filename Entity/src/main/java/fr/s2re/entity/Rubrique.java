package fr.s2re.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rubrique")
public class Rubrique implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "libelle", length = 50, nullable = false)
    private String libelle;

    @OneToMany(mappedBy = "rubrique")
    private List<Sujet> sujets;

    @OneToMany(mappedBy = "rubriqueParent")
    private List<Rubrique> rubriques;

    @ManyToOne
    @JoinColumn(name = "id_rubrique_parent", nullable = true)
    private Rubrique rubriqueParent;

    public Rubrique() {
        super();
    }

    public Rubrique(Integer paramId, String paramLibelle) {
        super();
        id = paramId;
        libelle = paramLibelle;
    }

    public Rubrique(Integer paramId, String paramLibelle, Rubrique paramRubriqueParent) {
        super();
        id = paramId;
        libelle = paramLibelle;
        rubriqueParent = paramRubriqueParent;
    }

    public Rubrique(Integer paramId, String paramLibelle, List<Sujet> paramSujets, List<Rubrique> paramRubriques,
            Rubrique paramRubriqueParent) {
        super();
        id = paramId;
        libelle = paramLibelle;
        sujets = paramSujets;
        rubriques = paramRubriques;
        rubriqueParent = paramRubriqueParent;
    }

    public Rubrique(String paramLibelle) {
        super();
        libelle = paramLibelle;
    }

    public Rubrique(String paramLibelle, Rubrique paramRubriqueParent) {
        super();
        libelle = paramLibelle;
        rubriqueParent = paramRubriqueParent;
    }

    public Rubrique(String paramLibelle, List<Sujet> paramSujets, List<Rubrique> paramRubriques, Rubrique paramRubriqueParent) {
        super();
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

    public List<Sujet> getSujets() {
        return sujets;
    }

    public void setSujets(List<Sujet> paramSujets) {
        sujets = paramSujets;
    }

    public List<Rubrique> getRubriques() {
        return rubriques;
    }

    public void setRubriques(List<Rubrique> paramRubriques) {
        rubriques = paramRubriques;
    }

    public Rubrique getRubriqueParent() {
        return rubriqueParent;
    }

    public void setRubriqueParent(Rubrique paramRubriqueParent) {
        rubriqueParent = paramRubriqueParent;
    }
}