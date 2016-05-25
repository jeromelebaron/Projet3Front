package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.RubriqueDto;
import fr.s2re.dto.SujetDto;
import fr.s2re.dto.TypeSujetDto;

public interface IBusinessSujet {
    SujetDto addSujet(SujetDto paramSujet);

    SujetDto updateSujet(SujetDto paramSujet);

    SujetDto closeSujet(SujetDto paramSujet);

    SujetDto getById(Integer paramId);

    List<SujetDto> getAll();

    List<SujetDto> getByType(TypeSujetDto paramTypeSujet);

    List<SujetDto> getByRubrique(RubriqueDto paramRubrique);

    List<SujetDto> getByPublication(Boolean paramBoolean);
}