package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Rubrique;
import fr.s2re.entity.Sujet;
import fr.s2re.entity.TypeSujet;
import fr.s2re.idao.IDaoSujet;

@Remote(IDaoSujet.class)
@Stateless
public class DaoSujet implements IDaoSujet {
    @Override
    public Sujet addSujet(Sujet paramSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Sujet updateSujet(Sujet paramSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Sujet closeSujet(Sujet paramSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Sujet getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Sujet> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Sujet> getByType(TypeSujet paramTypeSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Sujet> getByRubrique(Rubrique paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Sujet> getByPublication(Boolean paramBoolean) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}