package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Alerte;
import fr.s2re.entity.AlerteMessage;
import fr.s2re.entity.Message;
import fr.s2re.entity.MessageForum;
import fr.s2re.entity.MessageInbox;
import fr.s2re.entity.Messagerie;
import fr.s2re.entity.Sujet;

public interface IDaoMessage {
    Message addMessage(Message paramMessage);

    Message updateMessage(Message paramMessage);

    Message getById(Integer paramId);

    void delete(Message paramMessage);

    List<Message> getByAlerte(Alerte paramAlerte);

    List<MessageForum> getBySujet(Sujet paramSujet);

    List<MessageInbox> getByMessagerie(Messagerie paramMessagerie);

    List<AlerteMessage> getAlerte(Message paramMessage);
}