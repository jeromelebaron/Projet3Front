package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.TypeSujet;

public interface IDaoTypeSujet {
    List<TypeSujet> getAll();

    TypeSujet getByLibelle(String paramLibelle);
}