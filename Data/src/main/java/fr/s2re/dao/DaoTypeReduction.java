package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.TypeReduction;
import fr.s2re.idao.IDaoTypeReduction;

@Remote(IDaoTypeReduction.class)
@Stateless
public class DaoTypeReduction implements IDaoTypeReduction {
    @Override
    public List<TypeReduction> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public TypeReduction getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}