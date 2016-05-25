package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Client;
import fr.s2re.entity.Note;
import fr.s2re.entity.NoteClient;
import fr.s2re.entity.Utilisateur;

public interface IDaoUtilisateur {
    Utilisateur addUser(Utilisateur paramUtilisateur);

    Utilisateur updateUser(Utilisateur paramUtilisateur);

    List<Utilisateur> getAll();

    Utilisateur getById(Integer paramId);

    Utilisateur getByNom(String paramNom);

    Utilisateur getByIdentifiant(String paramMail, String paramMdp);

    List<NoteClient> getNote(Client paramClient);

    Client getVendeurByIdPdt(Integer paramIdProduit);

    List<Note> getNotesByNoteur(Client paramClient, Client paramVendeur);
}