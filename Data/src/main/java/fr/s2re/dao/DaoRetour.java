package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.LigneDeCommande;
import fr.s2re.entity.Retour;
import fr.s2re.idao.IDaoRetour;

@Remote(IDaoRetour.class)
@Stateless
public class DaoRetour implements IDaoRetour {
    @Override
    public Retour addRetour(Retour paramRetour) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Retour> getByLigneCommande(LigneDeCommande paramLigneDeCmd) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}