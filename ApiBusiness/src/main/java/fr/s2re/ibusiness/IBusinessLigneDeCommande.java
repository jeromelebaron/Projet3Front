package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;

public interface IBusinessLigneDeCommande {
    LigneDeCommandeDto addLigneDeCmd(LigneDeCommandeDto paramLigneDeCmd);

    LigneDeCommandeDto getById(Integer paramId);

    List<LigneDeCommandeDto> getByCommande(CommandeDto paramCommande);
}