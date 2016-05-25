package fr.s2re.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "type_reduction", uniqueConstraints = @UniqueConstraint(columnNames = { "libelle" }) )
public class TypeReduction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "libelle", length = 50, nullable = false)
    private String libelle;

    public TypeReduction() {
        super();
    }

    public TypeReduction(Integer paramId, String paramLibelle) {
        super();
        id = paramId;
        libelle = paramLibelle;
    }

    public TypeReduction(String paramLibelle) {
        super();
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