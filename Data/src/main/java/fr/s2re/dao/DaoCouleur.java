package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Couleur;
import fr.s2re.idao.IDaoCouleur;

@Remote(IDaoCouleur.class)
@Stateless
public class DaoCouleur implements IDaoCouleur {
    @Override
    public List<Couleur> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Couleur getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}