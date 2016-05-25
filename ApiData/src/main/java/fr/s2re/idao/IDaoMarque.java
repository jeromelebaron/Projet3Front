package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Marque;

public interface IDaoMarque {
    List<Marque> getAll();

    Marque getByLibelle(String paramLibelle);

    Marque add(Marque paramMarque);
}