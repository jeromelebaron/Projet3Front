package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.ObjetAlerte;

public interface IDaoObjetAlerte {
    List<ObjetAlerte> getAll();

    ObjetAlerte getByLibelle(String paramLibelle);
}