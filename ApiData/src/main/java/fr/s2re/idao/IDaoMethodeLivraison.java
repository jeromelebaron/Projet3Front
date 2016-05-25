package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.MethodeLivraison;

public interface IDaoMethodeLivraison {
    List<MethodeLivraison> getAll();

    MethodeLivraison getByLibelle(String paramLibelle);
}