package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.Client;
import fr.s2re.entity.Messagerie;
import fr.s2re.idao.IDaoMessagerie;

@Remote(IDaoMessagerie.class)
@Stateless
public class DaoMessagerie implements IDaoMessagerie {
    @Override
    public List<Messagerie> getByClient(Client paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Messagerie> getByVendeur(Client paramVendeur) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}