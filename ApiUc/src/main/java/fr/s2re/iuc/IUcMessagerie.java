package fr.s2re.iuc;

import java.util.List;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.MessageInboxDto;
import fr.s2re.dto.MessagerieDto;
import fr.s2re.dto.ProduitDto;

public interface IUcMessagerie {
    MessagerieDto envoyerMessage(ClientDto paramClientDto, ProduitDto paramProduitDto);

    MessagerieDto deleteMessage(MessageInboxDto paramMessageInboxDto);

    List<MessagerieDto> consuleterListeMessagerie(ClientDto paramClientDto);

    List<MessageInboxDto> consulterMessagerie(MessagerieDto paramMessagerieDto);
}
