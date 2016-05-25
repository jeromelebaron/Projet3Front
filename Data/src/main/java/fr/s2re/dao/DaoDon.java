package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Association;
import fr.s2re.entity.Don;
import fr.s2re.entity.Utilisateur;
import fr.s2re.idao.IDaoDon;

@Remote(IDaoDon.class)
@Stateless
public class DaoDon implements IDaoDon {
    @Override
    public Don addDon(Don paramDon) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Don> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Don> getByAsso(Association paramAssociation) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Don> getByClient(Utilisateur paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}