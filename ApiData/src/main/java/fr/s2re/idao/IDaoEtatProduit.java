package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.EtatProduit;

public interface IDaoEtatProduit {
    List<EtatProduit> getAll();

    EtatProduit getById(Integer paramId);

    EtatProduit getByLibelle(String paramLibelle);
}