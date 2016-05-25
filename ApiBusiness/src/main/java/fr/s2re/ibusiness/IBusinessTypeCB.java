package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.TypeCBDto;

public interface IBusinessTypeCB {
    List<TypeCBDto> getAll();

    TypeCBDto getByLibelle(String paramLibelle);
}