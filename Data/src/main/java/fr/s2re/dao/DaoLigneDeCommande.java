package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.Commande;
import fr.s2re.entity.LigneDeCommande;
import fr.s2re.idao.IDaoLigneDeCommande;

@Remote(IDaoLigneDeCommande.class)
@Stateless
public class DaoLigneDeCommande implements IDaoLigneDeCommande {
    @PersistenceContext
    private EntityManager em;

    @Override
    public LigneDeCommande addLigneDeCmd(LigneDeCommande paramLigneDeCmd) {
        em.persist(paramLigneDeCmd);
        em.flush();
        return paramLigneDeCmd;
    }

    @Override
    public LigneDeCommande getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<LigneDeCommande> getByCommande(Commande paramCommande) {
        return em.createQuery("FROM LigneDeCommande ldc WHERE ldc.commande.id = :idCommande", LigneDeCommande.class)
                .setParameter("idCommande", paramCommande.getId()).getResultList();
    }
}