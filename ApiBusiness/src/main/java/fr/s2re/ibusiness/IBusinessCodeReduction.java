package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.CodeReductionDto;
import fr.s2re.dto.TypeReductionDto;

public interface IBusinessCodeReduction {
    List<CodeReductionDto> getAll();

    List<CodeReductionDto> getByType(TypeReductionDto paramTypeReduc);

    CodeReductionDto add(CodeReductionDto paramCodeReduction);
}