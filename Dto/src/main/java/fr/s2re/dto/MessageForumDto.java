package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MessageForumDto extends MessageDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private SujetDto sujet;
    private UtilisateurDto auteur;

    public MessageForumDto() {
        super();
    }

    public MessageForumDto(SujetDto paramSujet, UtilisateurDto paramAuteur) {
        super();
        sujet = paramSujet;
        auteur = paramAuteur;
    }

    public MessageForumDto(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessageDto> paramAlertes) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
    }

    public MessageForumDto(Integer paramId, String paramMessage, Date paramDate, Boolean paramPublie, Date paramDateModif) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie);
    }

    public SujetDto getSujet() {
        return sujet;
    }

    public void setSujet(SujetDto paramSujet) {
        sujet = paramSujet;
    }

    public UtilisateurDto getAuteur() {
        return auteur;
    }

    public void setAuteur(UtilisateurDto paramAuteur) {
        auteur = paramAuteur;
    }
}