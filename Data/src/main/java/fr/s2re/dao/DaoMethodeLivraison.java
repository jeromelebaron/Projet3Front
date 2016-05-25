package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.MethodeLivraison;
import fr.s2re.idao.IDaoMethodeLivraison;

@Remote(IDaoMethodeLivraison.class)
@Stateless
public class DaoMethodeLivraison implements IDaoMethodeLivraison {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<MethodeLivraison> getAll() {
        return em.createQuery("FROM MethodeLivraison m WHERE m.publie = true", MethodeLivraison.class).getResultList();
    }

    @Override
    public MethodeLivraison getByLibelle(String paramLibelle) {
        return em.createQuery("FROM MethodeLivraison m WHERE m.libelle LIKE :paramLibelle", MethodeLivraison.class)
                .setParameter("paramLibelle", paramLibelle).getSingleResult();
    }
}