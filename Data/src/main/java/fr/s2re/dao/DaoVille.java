package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.Ville;
import fr.s2re.idao.IDaoVille;

@Remote(IDaoVille.class)
@Stateless
public class DaoVille implements IDaoVille {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Ville> getAll() {
        return em.createQuery("FROM Ville v", Ville.class).setMaxResults(100).getResultList();
    }

    @Override
    public List<Ville> getByCp(String paramCp) {
        return em.createQuery("From Ville v where v.cp like :paramCp", Ville.class).setParameter("paramCp", "%" + paramCp + "%")
                .getResultList();
    }

    @Override
    public Ville getByNom(String paramNom) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Ville getById(int paramId) {
        return em.find(Ville.class, paramId);
    }

    @Override
    public Ville getByCpNom(String paramCp, String paramNom) {
        List<Ville> list = em.createQuery("From Ville v where v.cp like :paramCp and v.nom like :paramNom", Ville.class)
                .setParameter("paramCp", paramCp).setParameter("paramNom", paramNom).getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }
}