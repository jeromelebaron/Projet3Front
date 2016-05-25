package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "COMMENTAIRE")
public class AlerteCommentaire extends Alerte implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_note", nullable = false)
    private Note note;

    public AlerteCommentaire() {
        super();
    }

    public AlerteCommentaire(Integer paramId, Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur,
            ObjetAlerte paramObjet, Note paramNote) {
        super(paramId, paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        note = paramNote;
    }

    public AlerteCommentaire(Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur, ObjetAlerte paramObjet,
            Note paramNote) {
        super(paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        note = paramNote;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note paramNote) {
        note = paramNote;
    }
}