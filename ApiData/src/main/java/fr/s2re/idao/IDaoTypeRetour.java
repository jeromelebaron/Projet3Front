package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.TypeRetour;

public interface IDaoTypeRetour {
    List<TypeRetour> getAll();

    TypeRetour getByLibelle(String paramLibelle);
}