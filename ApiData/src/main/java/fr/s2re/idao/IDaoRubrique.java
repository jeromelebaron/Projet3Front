package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Rubrique;

public interface IDaoRubrique {
    Rubrique addRubrique(Rubrique paramRubrique);

    Rubrique updateRubrique(Rubrique paramRubrique);

    List<Rubrique> getAll();

    List<Rubrique> getSousRubrique(Rubrique paramRubrique);

    Rubrique getByLibelle(String paramLibelle);
}