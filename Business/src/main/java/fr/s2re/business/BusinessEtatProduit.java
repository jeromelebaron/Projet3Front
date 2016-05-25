package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.EtatProduitDto;
import fr.s2re.ibusiness.IBusinessEtatProduit;

@Remote(IBusinessEtatProduit.class)
@Stateless
public class BusinessEtatProduit implements IBusinessEtatProduit {
    @Override
    public List<EtatProduitDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EtatProduitDto getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public EtatProduitDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}