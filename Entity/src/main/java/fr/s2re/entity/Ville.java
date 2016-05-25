package fr.s2re.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ville")
public class Ville implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cp", length = 5, nullable = false)
    private String cp;

    @Column(name = "nom", length = 50, nullable = false)
    private String nom;

    public Ville() {
        super();
    }

    public Ville(Integer paramId, String paramCp, String paramNom) {
        super();
        id = paramId;
        cp = paramCp;
        nom = paramNom;
    }

    public Ville(String paramCp, String paramNom) {
        super();
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