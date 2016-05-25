package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.Categorie;
import fr.s2re.entity.Produit;
import fr.s2re.idao.IDaoCategorie;

@Remote(IDaoCategorie.class)
@Stateless
public class DaoCategorie implements IDaoCategorie {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Categorie> getAll() {
        return em.createQuery("From Categorie c", Categorie.class).getResultList();
    }

    @Override
    public List<Categorie> getSousCategorie(Categorie paramCategorie) {
        return em.createQuery("From Categorie c where c.categorieParent.id = :paramId", Categorie.class)
                .setParameter("paramId", paramCategorie.getId()).getResultList();
    }

    @Override
    public Categorie getById(int paramId) {
        return em.find(Categorie.class, paramId);
    }

    @Override
    public Categorie getCatParent(Categorie paramCategorie) {
        List<Categorie> list = em.createQuery("Select c.categorieParent From Categorie c where c.id = :paramId", Categorie.class)
                .setParameter("paramId", paramCategorie.getId()).getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Categorie> getCategories(Categorie paramCategorie) {
        return em.createQuery("From Categorie c where c.categorieParent.id = :paramId", Categorie.class)
                .setParameter("paramId", paramCategorie.getId()).getResultList();
    }

    @Override
    public List<Produit> getProduits(Categorie paramCategorie) {
        return em.createQuery("From Produit p where p.categorie.id = :paramId", Produit.class)
                .setParameter("paramId", paramCategorie.getId()).getResultList();
    }

    @Override
    public List<Categorie> getAllParents() {
        return em.createQuery("FROM Categorie c WHERE c.categorieParent = null", Categorie.class).getResultList();
    }
}