package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Client;
import fr.s2re.entity.Envie;

public interface IDaoEnvie {
    Envie addEnvie(Envie paramEnvie);

    Envie updateEnvie(Envie paramEnvie);

    Envie deleteEnvie(Envie paramEnvie);

    List<Envie> getAll();

    List<Envie> getByClient(Client paramClient);
}