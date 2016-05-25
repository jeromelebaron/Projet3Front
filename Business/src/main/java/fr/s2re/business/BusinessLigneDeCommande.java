package fr.s2re.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.CommandeDto;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.entity.LigneDeCommande;
import fr.s2re.ibusiness.IBusinessLigneDeCommande;
import fr.s2re.idao.IDaoLigneDeCommande;

@Remote(IBusinessLigneDeCommande.class)
@Stateless
public class BusinessLigneDeCommande implements IBusinessLigneDeCommande {
    @EJB
    private IDaoLigneDeCommande daoLigneDeCommande;

    @Override
    public LigneDeCommandeDto addLigneDeCmd(LigneDeCommandeDto paramLigneDeCmd) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public LigneDeCommandeDto getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<LigneDeCommandeDto> getByCommande(CommandeDto paramCommande) {
        List<LigneDeCommande> list = daoLigneDeCommande.getByCommande(AssembleurDto.cmdFromCmdDto(paramCommande));
        return AssembleurDto.listLigneCmdDtoFromListLigneCmd(list);
    }
}