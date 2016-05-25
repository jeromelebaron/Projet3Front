package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.Client;
import fr.s2re.entity.Note;
import fr.s2re.entity.NoteClient;
import fr.s2re.entity.Utilisateur;
import fr.s2re.idao.IDaoUtilisateur;

@Remote(IDaoUtilisateur.class)
@Stateless
public class DaoUtilisateur implements IDaoUtilisateur {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Utilisateur addUser(Utilisateur paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Utilisateur updateUser(Utilisateur paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Utilisateur> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Utilisateur getById(Integer paramId) {
        return em.find(Utilisateur.class, paramId);
    }

    @Override
    public Utilisateur getByNom(String paramNom) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Utilisateur getByIdentifiant(String paramMail, String paramMdp) {
        List<Utilisateur> list = em
                .createQuery("FROM Utilisateur u WHERE u.mail = :paramMail AND u.password = :paramMdp", Utilisateur.class)
                .setParameter("paramMail", paramMail).setParameter("paramMdp", paramMdp).getResultList();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<NoteClient> getNote(Client paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public Client getVendeurByIdPdt(Integer paramIdProduit) {
        List<Client> clients = em.createQuery("Select p.vendeur From Produit p where p.id = :paramId", Client.class)
                .setParameter("paramId", paramIdProduit).getResultList();
        if (clients.size() == 1) {
            return clients.get(0);
        }
        return null;
    }

    @Override
    public List<Note> getNotesByNoteur(Client paramClient, Client paramVendeur) {
        List<Note> list = em.createQuery("From Note n where n.noteur.id = :paramIdClient and n.vendeur.id = :paramIdVendeur", Note.class)
                .setParameter("paramIdClient", paramClient.getId()).getResultList();
        return list;
    }
}