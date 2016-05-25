package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.TypeRetourDto;
import fr.s2re.ibusiness.IBusinessTypeRetour;

@Remote(IBusinessTypeRetour.class)
@Stateless
public class BusinessTypeRetour implements IBusinessTypeRetour {
    @Override
    public List<TypeRetourDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public TypeRetourDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}