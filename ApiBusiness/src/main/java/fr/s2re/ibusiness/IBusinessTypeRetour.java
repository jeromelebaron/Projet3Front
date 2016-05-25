package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.TypeRetourDto;

public interface IBusinessTypeRetour {
    List<TypeRetourDto> getAll();

    TypeRetourDto getByLibelle(String paramLibelle);
}