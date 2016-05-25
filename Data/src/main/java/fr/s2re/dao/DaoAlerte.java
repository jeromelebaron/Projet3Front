package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Alerte;
import fr.s2re.entity.Utilisateur;
import fr.s2re.idao.IDaoAlerte;

@Remote(IDaoAlerte.class)
@Stateless
public class DaoAlerte implements IDaoAlerte {
    @Override
    public Alerte addAlerte(Alerte paramAlerte) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Alerte updateAlerte(Alerte paramAlerte) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Alerte> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Alerte getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Alerte> getByObjet(Object paramObject) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Alerte> getByEmetteur(Utilisateur paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Alerte> getByObject(Object paramObj) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}