package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.AlerteCommentaire;
import fr.s2re.entity.Client;
import fr.s2re.entity.Note;
import fr.s2re.entity.NoteClient;
import fr.s2re.entity.NoteProduit;
import fr.s2re.entity.Produit;

public interface IDaoNote {
    Note addNote(Note paramNote);

    Note updateNote(Note paramNote);

    List<Note> getByClient(Client paramClient);

    List<Note> getByAlerte(AlerteCommentaire paramAlerte);

    List<NoteProduit> getByProduit(Produit paramProduit);

    List<NoteClient> getByVendeur(Client paramVendeur);

    List<AlerteCommentaire> getAlerte(Note paramNote);
}