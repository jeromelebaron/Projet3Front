package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.dto.RetourDto;
import fr.s2re.ibusiness.IBusinessRetour;

@Remote(IBusinessRetour.class)
@Stateless
public class BusinessRetour implements IBusinessRetour {
    @Override
    public RetourDto addRetour(RetourDto paramRetour) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<RetourDto> getByLigneCommande(LigneDeCommandeDto paramLigneDeCmd) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}