package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.UtilisateurDto;

public interface IBusinessUtilisateur {
    UtilisateurDto addUser(UtilisateurDto paramUtilisateur);

    UtilisateurDto updateUser(UtilisateurDto paramUtilisateur);

    List<UtilisateurDto> getAll();

    UtilisateurDto getById(Integer paramId);

    UtilisateurDto getByNom(String paramNom);

    UtilisateurDto getByIdentifiant(String paramMail, String paramMdp);

    List<NoteClientDto> getNote(ClientDto paramClient);

    ClientDto getVendeurByIdPdt(Integer paramIdProduit);

    List<NoteDto> getNotesByNoteur(ClientDto paramClientDto, ClientDto paramVendeur);
}