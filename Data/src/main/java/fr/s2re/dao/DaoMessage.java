package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Alerte;
import fr.s2re.entity.AlerteMessage;
import fr.s2re.entity.Message;
import fr.s2re.entity.MessageForum;
import fr.s2re.entity.MessageInbox;
import fr.s2re.entity.Messagerie;
import fr.s2re.entity.Sujet;
import fr.s2re.idao.IDaoMessage;

@Remote(IDaoMessage.class)
@Stateless
public class DaoMessage implements IDaoMessage {
    @Override
    public Message addMessage(Message paramMessage) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Message updateMessage(Message paramMessage) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Message getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public void delete(Message paramMessage) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Message> getByAlerte(Alerte paramAlerte) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<MessageForum> getBySujet(Sujet paramSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<MessageInbox> getByMessagerie(Messagerie paramMessagerie) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AlerteMessage> getAlerte(Message paramMessage) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}