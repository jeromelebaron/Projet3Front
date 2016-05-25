package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Civilite;

public interface IDaoCivilite {
    List<Civilite> getAll();

    Civilite getByLibelle(String paramLibelle);
}