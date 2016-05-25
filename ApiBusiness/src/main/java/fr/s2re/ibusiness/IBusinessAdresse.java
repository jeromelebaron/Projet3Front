package fr.s2re.ibusiness;

import java.math.BigDecimal;
import java.util.List;

import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.UtilisateurDto;

public interface IBusinessAdresse {
    AdresseDto addAdresse(AdresseDto paramAdresse);

    AdresseDto updateAdresse(AdresseDto paramAdresse);

    AdresseDto getById(Integer paramId);

    List<AdresseDto> getAll();

    List<AdresseDto> getByUser(UtilisateurDto paramUtilisateur);

    AdresseDto getByCoordonnees(BigDecimal paramLongitude, BigDecimal paramLatitude);
}