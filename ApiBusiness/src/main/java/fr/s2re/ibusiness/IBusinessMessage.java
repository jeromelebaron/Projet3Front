package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.AlerteDto;
import fr.s2re.dto.AlerteMessageDto;
import fr.s2re.dto.MessageDto;
import fr.s2re.dto.MessageForumDto;
import fr.s2re.dto.MessageInboxDto;
import fr.s2re.dto.MessagerieDto;
import fr.s2re.dto.SujetDto;

public interface IBusinessMessage {
    MessageDto addMessage(MessageDto paramMessage);

    MessageDto updateMessage(MessageDto paramMessage);

    MessageDto getById(Integer paramId);

    void delete(MessageDto paramMessage);

    List<MessageDto> getByAlerte(AlerteDto paramAlerte);

    List<MessageForumDto> getBySujet(SujetDto paramSujet);

    List<MessageInboxDto> getByMessagerie(MessagerieDto paramMessagerie);

    List<AlerteMessageDto> getAlerte(MessageDto paramMessage);
}