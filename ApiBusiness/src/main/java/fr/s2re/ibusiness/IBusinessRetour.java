package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.RetourDto;

public interface IBusinessRetour {
    RetourDto addRetour(RetourDto paramRetour);

    List<RetourDto> getByLigneCommande(LigneDeCommandeDto paramLigneDeCmd);
}