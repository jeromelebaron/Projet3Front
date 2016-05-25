package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.entity.CartePaiement;
import fr.s2re.entity.Client;
import fr.s2re.idao.IDaoCartePaiement;

@Remote(IDaoCartePaiement.class)
@Stateless
public class DaoCartePaiement implements IDaoCartePaiement {
    @Override
    public CartePaiement addCarte(CartePaiement paramCartePaiement) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public CartePaiement deleteCarte(CartePaiement paramCartePaiement) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public CartePaiement getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<CartePaiement> getByClient(Client paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}