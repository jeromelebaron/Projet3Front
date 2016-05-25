package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.AlerteProduit;
import fr.s2re.entity.Categorie;
import fr.s2re.entity.Client;
import fr.s2re.entity.Commande;
import fr.s2re.entity.Couleur;
import fr.s2re.entity.Image;
import fr.s2re.entity.Marque;
import fr.s2re.entity.NoteProduit;
import fr.s2re.entity.Produit;
import fr.s2re.idao.IDaoProduit;

@Remote(IDaoProduit.class)
@Stateless
public class DaoProduit implements IDaoProduit {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Produit> getAll() {
        return em.createQuery("From Produit p", Produit.class).getResultList();
    }

    @Override
    public Produit addProduit(Produit paramProduit) {
        em.persist(paramProduit);
        em.flush();
        return paramProduit;
    }

    @Override
    public Produit update(Produit paramProduit) {
        em.merge(paramProduit);
        return paramProduit;
    }

    @Override
    public List<Produit> getByClient(Client paramClient) {
        return em.createQuery("From Produit p where p.vendeur.id=:paramId", Produit.class).setParameter("paramId", paramClient.getId())
                .getResultList();
    }

    @Override
    public List<Produit> getProduitEnVente(Client paramClient) {
        String query = "From Produit p where p.vendeur.id=:paramId  and p.quantite >0 ";
        return em.createQuery(query, Produit.class).setParameter("paramId", paramClient.getId()).getResultList();
    }

    @Override
    public List<Commande> getHistoriqueVente(Client paramClient) {
        String query = "Select c FROM LigneDeCommande l , Commande c, Produit p WHERE c.id=l.commande.id AND l.produit.vendeur.id=:paramId and c.etat.id=3 GROUP BY c.id";
        // "FROM LigneDeCommande l WHERE l.produit.vendeur.id=:paramId";
        return em.createQuery(query, Commande.class).setParameter("paramId", paramClient.getId()).getResultList();
    }

    @Override
    public List<Commande> getVentesEnPreparation(Client paramClient) {
        String query = "Select c FROM LigneDeCommande l , Commande c, Produit p WHERE c.id=l.commande.id AND l.produit.vendeur.id=:paramId and c.etat.id=2 GROUP BY c.id";
        // "FROM LigneDeCommande l WHERE l.produit.vendeur.id=:paramId";
        return em.createQuery(query, Commande.class).setParameter("paramId", paramClient.getId()).getResultList();
    }

    @Override
    public List<Produit> getByCategorie(Categorie paramCategorie) {
        List<Produit> list = em.createQuery("From Produit p where p.categorie.id = :paramId  AND p.quantite > 0", Produit.class)
                .setParameter("paramId", paramCategorie.getId()).setParameter("paramId", paramCategorie.getId()).getResultList();
        return list;
    }

    @Override
    public List<Produit> getByAlerte(AlerteProduit paramAlerte) {
        return null;
    }

    @Override
    public List<Produit> getByMarque(Marque paramMarque) {
        return em.createQuery("From Produit p where p.marque.id = :paramId AND p.quantite > 0", Produit.class)
                .setParameter("paramId", paramMarque.getId()).getResultList();
    }

    @Override
    public List<Produit> getByLibelle(String paramLibelle) {
        List<Produit> list = em.createQuery("From Produit p where p.libelle like :paramLibelle AND p.quantite > 0", Produit.class)
                .setParameter("paramLibelle", "%" + paramLibelle + "%").getResultList();
        return list;
    }

    @Override
    public List<AlerteProduit> getAlerte(Produit paramProduit) {
        return em.createQuery("Select a From AlerteProduit a where a.produit.id = :paramId", AlerteProduit.class)
                .setParameter("paramId", paramProduit.getId()).getResultList();
    }

    @Override
    public List<NoteProduit> getNote(Produit paramProduit) {
        return em.createQuery("Select n From NoteProduit n where n.produit.id = :paramId", NoteProduit.class)
                .setParameter("paramId", paramProduit.getId()).getResultList();
    }

    @Override
    public Produit getProduit(Produit paramProduit) {
        return em.find(Produit.class, paramProduit.getId());
    }

    @Override
    public List<Produit> getByCouleur(Couleur paramCouleur) {
        return em.createQuery("From Produit p where p.couleur.id = :paramId AND p.quantite > 0", Produit.class)
                .setParameter("paramId", paramCouleur.getId()).getResultList();
    }

    @Override
    public List<Image> getImage(Produit paramProduit) {

        return em.createQuery("Select i From Image i where i.produit.id = :paramId", Image.class)
                .setParameter("paramId", paramProduit.getId()).getResultList();
    }

    @Override
    public void delete(Produit paramProduit) {
        if (paramProduit.getQuantite() > 0) {
            Produit p = em.find(Produit.class, paramProduit.getId());
            paramProduit.setQuantite(p.getQuantite() - 1);
            em.merge(paramProduit);
        }

    }

    @Override
    public Produit getById(int paramId) {
        return em.find(Produit.class, paramId);
    }
}