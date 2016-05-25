package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Client;
import fr.s2re.entity.Commande;
import fr.s2re.entity.LigneDeCommande;

public interface IDaoCommande {
    Commande addCommande(Commande paramCommande);

    List<Commande> getByClient(Client paramClient);

    Commande getByNumero(String paramNumero);

    Commande getById(Integer paramId);

    List<LigneDeCommande> getLigneDeCommande(Commande paramCommande);

    List<Commande> getSousCommande(Commande paramCommande);

    List<Commande> getCommandeDesVendeur(Client c);

    Commande modifierEtat(Commande cmdFromCmdDto);

    Commande modifierCommande(Commande cmd);

}