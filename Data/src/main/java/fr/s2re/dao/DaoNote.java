package fr.s2re.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.s2re.entity.AlerteCommentaire;
import fr.s2re.entity.Client;
import fr.s2re.entity.Note;
import fr.s2re.entity.NoteClient;
import fr.s2re.entity.NoteProduit;
import fr.s2re.entity.Produit;
import fr.s2re.idao.IDaoNote;

@Remote(IDaoNote.class)
@Stateless
public class DaoNote implements IDaoNote {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Note addNote(Note paramNote) {
        em.persist(paramNote);
        em.flush();
        return paramNote;
    }

    @Override
    public Note updateNote(Note paramNote) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Note> getByClient(Client paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<Note> getByAlerte(AlerteCommentaire paramAlerte) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<NoteProduit> getByProduit(Produit paramProduit) {
        return em.createQuery("Select n From NoteProduit n where n.produit.id = :paramId", NoteProduit.class)
                .setParameter("paramId", paramProduit.getId()).getResultList();
    }

    @Override
    public List<NoteClient> getByVendeur(Client paramVendeur) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AlerteCommentaire> getAlerte(Note paramNote) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}