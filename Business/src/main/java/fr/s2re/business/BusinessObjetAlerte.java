package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ObjetAlerteDto;
import fr.s2re.ibusiness.IBusinessObjetAlerte;

@Remote(IBusinessObjetAlerte.class)
@Stateless
public class BusinessObjetAlerte implements IBusinessObjetAlerte {
    @Override
    public List<ObjetAlerteDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public ObjetAlerteDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}