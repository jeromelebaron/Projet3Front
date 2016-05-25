package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ProduitCodeReductionDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.ibusiness.IBusinessProduitCodeReduction;

@Remote(IBusinessProduitCodeReduction.class)
@Stateless
public class BusinessProduitCodeReduction implements IBusinessProduitCodeReduction {
    @Override
    public ProduitCodeReductionDto addPdtCodeReduc(ProduitCodeReductionDto paramPdtCodeReduc) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<ProduitCodeReductionDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<ProduitCodeReductionDto> getByProduit(ProduitDto paramProduit) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}