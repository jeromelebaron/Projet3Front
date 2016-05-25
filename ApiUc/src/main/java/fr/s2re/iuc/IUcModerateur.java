package fr.s2re.iuc;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;

public interface IUcModerateur {
    // Autoriser ou refuser publication produit
    ProduitDto gererPublicationProduit(ProduitDto paramProduitDto);

    ProduitDto deleteProduitClientcatalog(ProduitDto paramProduitDto);

    ProduitDto deleteProduitlisteAlerte(ProduitDto paramProduitDto);

    ClientDto demandeBlacklisterClient(ClientDto paramClientDto);

    NoteProduitDto deleteNoteProduit(ProduitDto paramProduitDto);

    NoteClientDto deleteNoteClient(ClientDto paramNoteClient);
}
