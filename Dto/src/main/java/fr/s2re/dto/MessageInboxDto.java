package fr.s2re.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MessageInboxDto extends MessageDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private MessagerieDto messagerie;

    public MessageInboxDto() {
        super();
    }

    public MessageInboxDto(MessagerieDto paramMessagerie) {
        super();
        messagerie = paramMessagerie;
    }

    public MessageInboxDto(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessageDto> paramAlertes) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
    }

    public MessageInboxDto(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie);
    }

    public MessagerieDto getMessagerie() {
        return messagerie;
    }

    public void setMessagerie(MessagerieDto paramMessagerie) {
        messagerie = paramMessagerie;
    }
}