package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Client;
import fr.s2re.entity.Messagerie;

public interface IDaoMessagerie {
    List<Messagerie> getByClient(Client client);

    List<Messagerie> getByVendeur(Client vendeur);
}