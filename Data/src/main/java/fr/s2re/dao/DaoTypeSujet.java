package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.TypeSujet;
import fr.s2re.idao.IDaoTypeSujet;

@Remote(IDaoTypeSujet.class)
@Stateless
public class DaoTypeSujet implements IDaoTypeSujet {
    @Override
    public List<TypeSujet> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public TypeSujet getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}