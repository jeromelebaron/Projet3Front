package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Client;
import fr.s2re.entity.Envie;
import fr.s2re.idao.IDaoEnvie;

@Remote(IDaoEnvie.class)
@Stateless
public class DaoEnvie implements IDaoEnvie {
    @Override
    public Envie addEnvie(Envie paramEnvie) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Envie updateEnvie(Envie paramEnvie) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Envie deleteEnvie(Envie paramEnvie) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Envie> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Envie> getByClient(Client paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}