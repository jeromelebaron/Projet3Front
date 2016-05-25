package fr.s2re.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "MESSAGE")
public class AlerteMessage extends Alerte implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "id_message", nullable = false)
    private Message message;

    public AlerteMessage() {
        super();
    }

    public AlerteMessage(Integer paramId, Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur, ObjetAlerte paramObjet,
            Message paramMessage) {
        super(paramId, paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        message = paramMessage;
    }

    public AlerteMessage(Date paramDateCreation, Date paramDateCloture, Utilisateur paramEmetteur, ObjetAlerte paramObjet,
            Message paramMessage) {
        super(paramDateCreation, paramDateCloture, paramEmetteur, paramObjet);
        message = paramMessage;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message paramMessage) {
        message = paramMessage;
    }

}