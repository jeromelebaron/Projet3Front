package fr.s2re.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Client;
import fr.s2re.entity.Rib;
import fr.s2re.idao.IDaoRib;

@Remote(IDaoRib.class)
@Stateless
public class DaoRib implements IDaoRib {
    @Override
    public Rib addRib(Rib paramRib) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Rib updateRib(Rib paramRib) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Rib getByClient(Client paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}