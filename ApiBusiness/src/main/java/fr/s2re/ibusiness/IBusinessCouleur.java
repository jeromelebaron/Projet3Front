package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.CouleurDto;

public interface IBusinessCouleur {
    List<CouleurDto> getAll();

    CouleurDto getByLibelle(String paramLibelle);
}