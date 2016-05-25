package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Civilite;
import fr.s2re.idao.IDaoCivilite;

@Remote(IDaoCivilite.class)
@Stateless
public class DaoCivilite implements IDaoCivilite {
    @Override
    public List<Civilite> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Civilite getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}