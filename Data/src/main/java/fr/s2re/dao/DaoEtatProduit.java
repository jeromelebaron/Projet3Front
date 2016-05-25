package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.EtatProduit;
import fr.s2re.idao.IDaoEtatProduit;

@Remote(IDaoEtatProduit.class)
@Stateless
public class DaoEtatProduit implements IDaoEtatProduit {
    @Override
    public List<EtatProduit> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EtatProduit getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EtatProduit getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}