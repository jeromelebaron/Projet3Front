package fr.s2re.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.NoteClientDto;
import fr.s2re.dto.NoteDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.ibusiness.IBusinessUtilisateur;
import fr.s2re.idao.IDaoUtilisateur;

@Remote(IBusinessUtilisateur.class)
@Stateless
public class BusinessUtilisateur implements IBusinessUtilisateur {
    @EJB
    private IDaoUtilisateur daoUtilisateur;

    @Override
    public UtilisateurDto addUser(UtilisateurDto paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public UtilisateurDto updateUser(UtilisateurDto paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<UtilisateurDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public UtilisateurDto getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public UtilisateurDto getByNom(String paramNom) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public UtilisateurDto getByIdentifiant(String paramMail, String paramMdp) {
        return AssembleurDto.userDtoFromUser(daoUtilisateur.getByIdentifiant(paramMail, paramMdp));
    }

    @Override
    public List<NoteClientDto> getNote(ClientDto paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public ClientDto getVendeurByIdPdt(Integer paramIdProduit) {
        return AssembleurDto.clientDtoFromClient(daoUtilisateur.getVendeurByIdPdt(paramIdProduit));
    }

    @Override
    public List<NoteDto> getNotesByNoteur(ClientDto paramClientDto, ClientDto paramVendeurDto) {
        return AssembleurDto.listNoteDtoFromListNote(daoUtilisateur.getNotesByNoteur(AssembleurDto.clientFromClientDto(paramClientDto),
                AssembleurDto.clientFromClientDto(paramVendeurDto)));
    }
}