package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Commande;
import fr.s2re.entity.LigneDeCommande;

public interface IDaoLigneDeCommande {
    LigneDeCommande addLigneDeCmd(LigneDeCommande paramLigneDeCmd);

    LigneDeCommande getById(Integer paramId);

    List<LigneDeCommande> getByCommande(Commande paramCommande);
}