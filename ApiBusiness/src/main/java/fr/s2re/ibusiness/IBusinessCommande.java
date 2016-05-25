package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;

public interface IBusinessCommande {
    CommandeDto addCommande(ClientDto paramClientDto, List<LigneDeCommandeDto> paramList, CommandeDto paramCommandeDto);

    List<CommandeDto> getByClient(ClientDto paramClient);

    CommandeDto getByNumero(String paramNumero);

    CommandeDto getById(Integer paramId);

    List<LigneDeCommandeDto> getLigneDeCommande(CommandeDto paramCommande);

    List<CommandeDto> getSousCommandes(CommandeDto paramCommande);

    String genererNumeroCommande(ClientDto paramClientDto);

    String genererNumeroSousCommande(CommandeDto paramCommande, int i);

    List<CommandeDto> getCommandeDesVendeur(ClientDto paramClientDto);

    CommandeDto modifierCommande(CommandeDto cmd);

}