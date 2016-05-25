package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.TypeReductionDto;

public interface IBusinessTypeReduction {
    List<TypeReductionDto> getAll();

    TypeReductionDto getByLibelle(String paramLibelle);
}