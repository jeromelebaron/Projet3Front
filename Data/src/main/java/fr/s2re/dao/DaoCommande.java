package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.Client;
import fr.s2re.entity.Commande;
import fr.s2re.entity.LigneDeCommande;
import fr.s2re.idao.IDaoCommande;

@Remote(IDaoCommande.class)
@Stateless
public class DaoCommande implements IDaoCommande {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Commande addCommande(Commande paramCommande) {
        em.persist(paramCommande);
        em.flush();
        return paramCommande;
    }

    @Override
    // return commandes MAIS PAS sous commande attention !
    public List<Commande> getByClient(Client paramClient) {
        return em.createQuery("FROM Commande c WHERE c.client.id = :idClient AND c.commandeParente.id = null", Commande.class)
                .setParameter("idClient", paramClient.getId()).getResultList();
    }

    @Override
    public Commande getByNumero(String paramNumero) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<LigneDeCommande> getLigneDeCommande(Commande paramCommande) {
        return em.createQuery("From LigneDeCommande l where l.commande.id = :paramId", LigneDeCommande.class)
                .setParameter("paramId", paramCommande.getId()).getResultList();
    }

    @Override
    public List<Commande> getSousCommande(Commande paramCommande) {
        List<Commande> list = em
                .createQuery("FROM Commande c WHERE c.commandeParente.id = :idCommandeParente AND c.client.id = :idClient", Commande.class)
                .setParameter("idClient", paramCommande.getClient().getId()).setParameter("idCommandeParente", paramCommande.getId())
                .getResultList();
        if (!list.isEmpty()) {
        }
        return list;
    }

    @Override
    public Commande getById(Integer paramId) {
        return em.find(Commande.class, paramId);
    }

    @Override
    public List<Commande> getCommandeDesVendeur(Client c) {
        List<Commande> liste = em.createQuery(
                "Select c FROM LigneDeCommande l , Commande c, Produit p WHERE c.id=l.commande.id AND l.produit.vendeur.id=:paramId and c.etat.id=2 GROUP BY c.id",
                Commande.class).setParameter("paramId", c.getId()).getResultList();
        if (!liste.isEmpty()) {
        }
        return liste;

    }

    @Override
    public Commande modifierCommande(Commande cmd) {
        return em.merge(cmd);
    }

    @Override
    public Commande modifierEtat(Commande cmdFromCmdDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

}