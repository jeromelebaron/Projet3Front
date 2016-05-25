package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.TypeSujetDto;

public interface IBusinessTypeSujet {
    List<TypeSujetDto> getAll();

    TypeSujetDto getByLibelle(String paramLibelle);
}