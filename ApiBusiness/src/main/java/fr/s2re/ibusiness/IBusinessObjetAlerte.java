package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.ObjetAlerteDto;

public interface IBusinessObjetAlerte {
    List<ObjetAlerteDto> getAll();

    ObjetAlerteDto getByLibelle(String paramLibelle);
}