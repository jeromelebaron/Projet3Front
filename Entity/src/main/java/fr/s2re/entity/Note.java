package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "note")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_note")
public class Note implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "note", columnDefinition = "Decimal(1,0)", nullable = false)
    private Double note;

    @Column(name = "commentaire", length = 1000, nullable = true)
    private String commentaire;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "publie", nullable = false)
    private Boolean publie;

    @ManyToOne
    @JoinColumn(name = "id_noteur", nullable = false)
    private Client noteur;

    @OneToMany(mappedBy = "note")
    private List<AlerteCommentaire> alertes;

    public Note() {
        super();
    }

    public Note(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur) {
        super();
        id = paramId;
        note = paramNote;
        commentaire = paramCommentaire;
        date = paramDate;
        publie = paramPublie;
        noteur = paramNoteur;
    }

    public Note(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes) {
        super();
        id = paramId;
        note = paramNote;
        commentaire = paramCommentaire;
        date = paramDate;
        publie = paramPublie;
        noteur = paramNoteur;
        alertes = paramAlertes;
    }

    public Note(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur) {
        super();
        note = paramNote;
        commentaire = paramCommentaire;
        date = paramDate;
        publie = paramPublie;
        noteur = paramNoteur;
    }

    public Note(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes) {
        super();
        note = paramNote;
        commentaire = paramCommentaire;
        date = paramDate;
        publie = paramPublie;
        noteur = paramNoteur;
        alertes = paramAlertes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer paramId) {
        id = paramId;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double paramNote) {
        note = paramNote;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String paramCommentaire) {
        commentaire = paramCommentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date paramDate) {
        date = paramDate;
    }

    public Client getNoteur() {
        return noteur;
    }

    public void setNoteur(Client paramNoteur) {
        noteur = paramNoteur;
    }

    public List<AlerteCommentaire> getAlertes() {
        return alertes;
    }

    public void setAlertes(List<AlerteCommentaire> paramAlertes) {
        alertes = paramAlertes;
    }

    public Boolean getPublie() {
        return publie;
    }

    public void setPublie(Boolean paramPublie) {
        publie = paramPublie;
    }
}