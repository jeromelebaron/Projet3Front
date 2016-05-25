package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "alerte")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_alerte")
public class Alerte implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_creation", nullable = false)
    private Date dateCreation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_cloture", nullable = true)
    private Date dateCloture;

    @ManyToOne
    @JoinColumn(name = "id_emetteur", nullable = false)
    private Utilisateur emetteur;

    @ManyToOne
    @JoinColumn(name = "id_objet", nullable = false)
    private ObjetAlerte objet;

    public Alerte() {
        super();
    }

    public Alerte(Integer paramId, Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur, ObjetAlerte paramObjet) {
        super();
        id = paramId;
        dateCreation = paramDateCreation;
        dateCloture = paramDateCloture;
        emetteur = paramEmetteur;
        objet = paramObjet;
    }

    public Alerte(Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur, ObjetAlerte paramObjet) {
        super();
        dateCreation = paramDateCreation;
        dateCloture = paramDateCloture;
        emetteur = paramEmetteur;
        objet = paramObjet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date paramDateCreation) {
        dateCreation = paramDateCreation;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date paramDateCloture) {
        dateCloture = paramDateCloture;
    }

    public Utilisateur getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Utilisateur paramEmetteur) {
        emetteur = paramEmetteur;
    }

    public ObjetAlerte getObjet() {
        return objet;
    }

    public void setObjet(ObjetAlerte paramObjet) {
        objet = paramObjet;
    }
}