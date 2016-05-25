package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.TypeReduction;

public interface IDaoTypeReduction {
    List<TypeReduction> getAll();

    TypeReduction getByLibelle(String paramLibelle);
}