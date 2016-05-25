package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.CiviliteDto;

public interface IBusinessCivilite {
    List<CiviliteDto> getAll();

    CiviliteDto getByLibelle(String paramLibelle);
}