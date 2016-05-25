package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.AlerteCommentaireDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;

public interface IBusinessNote {
    NoteDto addNote(NoteDto paramNote);

    NoteDto updateNote(NoteDto paramNote);

    List<NoteDto> getByClient(ClientDto paramClient);

    List<NoteDto> getByAlerte(AlerteCommentaireDto paramAlerte);

    List<NoteProduitDto> getByProduit(ProduitDto paramProduit);

    List<NoteClientDto> getByVendeur(ClientDto paramVendeur);

    List<AlerteCommentaireDto> getAlerte(NoteDto paramNote);
}