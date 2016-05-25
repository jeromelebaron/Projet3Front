package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;

public class AlerteMessageDto extends AlerteDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private MessageDto message;

    public AlerteMessageDto() {
        super();
    }

    public AlerteMessageDto(Integer paramId, Date paramDateCreation, Date paramDateCloture, UtilisateurDto paramEmetteur,
            ObjetAlerteDto paramObjet, MessageDto paramMessage) {
        super(paramId, paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        message = paramMessage;
    }

    public MessageDto getMessage() {
        return message;
    }

    public void setMessage(MessageDto paramMessage) {
        message = paramMessage;
    }

}