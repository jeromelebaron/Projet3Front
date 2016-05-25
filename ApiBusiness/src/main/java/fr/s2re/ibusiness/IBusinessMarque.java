package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.MarqueDto;

public interface IBusinessMarque {
    List<MarqueDto> getAll();

    MarqueDto getByLibelle(String paramLibelle);

    MarqueDto add(MarqueDto paramMarque);
}