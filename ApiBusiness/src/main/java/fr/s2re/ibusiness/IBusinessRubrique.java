package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.RubriqueDto;

public interface IBusinessRubrique {
    RubriqueDto addRubrique(RubriqueDto paramRubrique);

    RubriqueDto updateRubrique(RubriqueDto paramRubrique);

    List<RubriqueDto> getAll();

    List<RubriqueDto> getSousRubrique(RubriqueDto paramRubrique);

    RubriqueDto getByLibelle(String paramLibelle);
}