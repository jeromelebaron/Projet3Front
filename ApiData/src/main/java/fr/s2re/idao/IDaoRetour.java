package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.LigneDeCommande;
import fr.s2re.entity.Retour;

public interface IDaoRetour {
    Retour addRetour(Retour paramRetour);

    List<Retour> getByLigneCommande(LigneDeCommande paramLigneDeCmd);
}