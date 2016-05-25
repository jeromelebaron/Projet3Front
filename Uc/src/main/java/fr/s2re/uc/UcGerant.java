package fr.s2re.uc;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcGerant;

@Remote(IUcGerant.class)
@Stateless
public class UcGerant implements IUcGerant {
    @Override
    public ProduitDto addProduit(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<ProduitDto> consulterStock() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public ProduitDto deleteProduitCatalog(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}
