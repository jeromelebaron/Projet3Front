package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.TypeCB;
import fr.s2re.idao.IDaoTypeCB;

@Remote(IDaoTypeCB.class)
@Stateless
public class DaoTypeCB implements IDaoTypeCB {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<TypeCB> getAll() {
        return em.createQuery("FROM TypeCB t", TypeCB.class).getResultList();
    }

    @Override
    public TypeCB getByLibelle(String paramLibelle) {
        return em.createQuery("FROM TypeCB t WHERE t.libelle LIKE :paramLibelle", TypeCB.class).setParameter("paramLibelle", paramLibelle)
                .getSingleResult();
    }
}