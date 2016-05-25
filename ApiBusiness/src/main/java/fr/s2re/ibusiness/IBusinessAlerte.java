package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.AlerteDto;
import fr.s2re.dto.UtilisateurDto;

public interface IBusinessAlerte {
    AlerteDto addAlerte(AlerteDto paramAlerte);

    AlerteDto updateAlerte(AlerteDto paramAlerte);

    List<AlerteDto> getAll();

    AlerteDto getById(Integer paramId);

    List<AlerteDto> getByObjet(Object paramObject);

    List<AlerteDto> getByEmetteur(UtilisateurDto paramUtilisateur);

    List<AlerteDto> getByObject(Object paramObj);
}