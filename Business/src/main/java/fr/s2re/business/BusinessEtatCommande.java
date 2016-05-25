package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.EtatCommandeDto;
import fr.s2re.ibusiness.IBusinessEtatCommande;

@Remote(IBusinessEtatCommande.class)
@Stateless
public class BusinessEtatCommande implements IBusinessEtatCommande {
    @Override
    public List<EtatCommandeDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EtatCommandeDto getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<EtatCommandeDto> getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}