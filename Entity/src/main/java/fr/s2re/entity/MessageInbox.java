package fr.s2re.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "INBOX")
public class MessageInbox extends Message {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_messagerie", nullable = false)
    private Messagerie messagerie;

    public MessageInbox() {
        super();
    }

    public MessageInbox(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessage> paramAlertes) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
    }

    public MessageInbox(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie);
    }

    public MessageInbox(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, List<AlerteMessage> paramAlertes) {
        super(paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
    }

    public MessageInbox(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie) {
        super(paramMessage, paramDate, paramDateModif, paramPublie);
    }

    public MessageInbox(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            List<AlerteMessage> paramAlertes, Messagerie paramMessagerie) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
        messagerie = paramMessagerie;
    }

    public MessageInbox(Integer paramId, String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie,
            Messagerie paramMessagerie) {
        super(paramId, paramMessage, paramDate, paramDateModif, paramPublie);
        messagerie = paramMessagerie;
    }

    public MessageInbox(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, List<AlerteMessage> paramAlertes,
            Messagerie paramMessagerie) {
        super(paramMessage, paramDate, paramDateModif, paramPublie, paramAlertes);
        messagerie = paramMessagerie;
    }

    public MessageInbox(String paramMessage, Date paramDate, Date paramDateModif, Boolean paramPublie, Messagerie paramMessagerie) {
        super(paramMessage, paramDate, paramDateModif, paramPublie);
        messagerie = paramMessagerie;
    }

    public Messagerie getMessagerie() {
        return messagerie;
    }

    public void setMessagerie(Messagerie paramMessagerie) {
        messagerie = paramMessagerie;
    }
}