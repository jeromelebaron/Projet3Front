package fr.s2re.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import fr.s2re.entity.Adresse;
import fr.s2re.entity.Utilisateur;
import fr.s2re.idao.IDaoAdresse;

@Remote(IDaoAdresse.class)
@Stateless
public class DaoAdresse implements IDaoAdresse {
    private static Logger log = Logger.getLogger(DaoAdresse.class);
    @PersistenceContext
    private EntityManager em;

    @Override
    public Adresse addAdresse(Adresse paramAdresse) {
        log.info(paramAdresse.toString());
        em.persist(paramAdresse);
        em.flush();
        return paramAdresse;
    }

    @Override
    public Adresse updateAdresse(Adresse paramAdresse) {
        return em.merge(paramAdresse);
    }

    @Override
    public Adresse getById(Integer paramId) {
        return em.find(Adresse.class, paramId);
    }

    @Override
    public List<Adresse> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Adresse> getByUser(Utilisateur paramUtilisateur) {
        return em.createQuery("FROM Adresse a WHERE a.client.id = :idClient AND a.publie = true", Adresse.class)
                .setParameter("idClient", paramUtilisateur.getId()).getResultList();
    }

    @Override
    public Adresse getByCoordonnees(BigDecimal paramLongitude, BigDecimal paramLatitude) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}