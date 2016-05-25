package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.CodeReduction;
import fr.s2re.entity.TypeReduction;

public interface IDaoCodeReduction {
    List<CodeReduction> getAll();

    List<CodeReduction> getByType(TypeReduction paramTypeReduc);

    CodeReduction add(CodeReduction paramCodeReduction);
}