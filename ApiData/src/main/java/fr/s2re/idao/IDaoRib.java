package fr.s2re.idao;

import fr.s2re.entity.Client;
import fr.s2re.entity.Rib;

public interface IDaoRib {
    Rib addRib(Rib paramRib);

    Rib updateRib(Rib paramRib);

    Rib getByClient(Client paramClient);
}