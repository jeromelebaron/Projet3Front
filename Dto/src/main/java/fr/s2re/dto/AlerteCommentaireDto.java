package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;

public class AlerteCommentaireDto extends AlerteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private NoteDto note;

    public AlerteCommentaireDto() {
        super();
    }

    public AlerteCommentaireDto(Integer paramId, Date paramDateCreation, Date paramDateCloture, UtilisateurDto paramEmeteur,
            ObjetAlerteDto paramObjet, NoteDto paramNote) {
        super(paramId, paramDateCreation, paramDateCloture, paramEmeteur, paramObjet);
        note = paramNote;
    }

    public NoteDto getNote() {
        return note;
    }

    public void setNote(NoteDto paramNote) {
        note = paramNote;
    }
}