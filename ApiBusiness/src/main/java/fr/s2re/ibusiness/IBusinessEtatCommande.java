package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.EtatCommandeDto;

public interface IBusinessEtatCommande {
    List<EtatCommandeDto> getAll();

    EtatCommandeDto getById(Integer paramId);

    List<EtatCommandeDto> getByLibelle(String paramLibelle);
}