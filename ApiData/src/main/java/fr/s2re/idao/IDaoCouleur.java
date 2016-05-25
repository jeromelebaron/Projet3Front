package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Couleur;

public interface IDaoCouleur {
    List<Couleur> getAll();

    Couleur getByLibelle(String paramLibelle);
}