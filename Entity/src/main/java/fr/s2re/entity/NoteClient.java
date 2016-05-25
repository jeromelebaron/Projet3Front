package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "CLIENT")
public class NoteClient extends Note implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_vendeur", nullable = false)
    private Client vendeur;

    public NoteClient() {
        super();
    }

    public NoteClient(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
    }

    public NoteClient(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
    }

    public NoteClient(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
    }

    public NoteClient(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
    }

    public NoteClient(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes, Client paramVendeur) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
        vendeur = paramVendeur;
    }

    public NoteClient(Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            Client paramVendeur) {
        super(paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
        vendeur = paramVendeur;
    }

    public NoteClient(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            List<AlerteCommentaire> paramAlertes, Client paramVendeur) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur, paramAlertes);
        vendeur = paramVendeur;
    }

    public NoteClient(Integer paramId, Double paramNote, String paramCommentaire, Date paramDate, Boolean paramPublie, Client paramNoteur,
            Client paramVendeur) {
        super(paramId, paramNote, paramCommentaire, paramDate, paramPublie, paramNoteur);
        vendeur = paramVendeur;
    }

    public Client getVendeur() {
        return vendeur;
    }

    public void setVendeur(Client paramVendeur) {
        vendeur = paramVendeur;
    }
}