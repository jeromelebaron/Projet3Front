package fr.s2re.uc;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcModerateur;

@Remote(IUcModerateur.class)
@Stateless
public class UcModerateur implements IUcModerateur {
    @Override
    public ProduitDto gererPublicationProduit(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public ProduitDto deleteProduitClientcatalog(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public ProduitDto deleteProduitlisteAlerte(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public ClientDto demandeBlacklisterClient(ClientDto paramClientDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public NoteProduitDto deleteNoteProduit(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public NoteClientDto deleteNoteClient(ClientDto paramNoteClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}
