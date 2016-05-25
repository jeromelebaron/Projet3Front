package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Rubrique;
import fr.s2re.idao.IDaoRubrique;

@Remote(IDaoRubrique.class)
@Stateless
public class DaoRubrique implements IDaoRubrique {
    @Override
    public Rubrique addRubrique(Rubrique paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Rubrique updateRubrique(Rubrique paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Rubrique> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Rubrique> getSousRubrique(Rubrique paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Rubrique getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}