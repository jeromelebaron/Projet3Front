package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.EtatCommande;
import fr.s2re.idao.IDaoEtatCommande;

@Remote(IDaoEtatCommande.class)
@Stateless
public class DaoEtatCommande implements IDaoEtatCommande {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<EtatCommande> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EtatCommande getById(Integer paramId) {
        return em.find(EtatCommande.class, paramId);
    }

    @Override
    public List<EtatCommande> getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}