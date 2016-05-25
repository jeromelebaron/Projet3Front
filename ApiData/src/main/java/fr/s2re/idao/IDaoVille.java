package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Ville;

public interface IDaoVille {
    List<Ville> getAll();

    List<Ville> getByCp(String paramCp);

    Ville getByNom(String paramNom);

    Ville getById(int paramId);

    Ville getByCpNom(String paramCp, String paramNom);
}