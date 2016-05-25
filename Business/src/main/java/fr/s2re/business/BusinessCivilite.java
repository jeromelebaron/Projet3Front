package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CiviliteDto;
import fr.s2re.ibusiness.IBusinessCivilite;

@Remote(IBusinessCivilite.class)
@Stateless
public class BusinessCivilite implements IBusinessCivilite {
    @Override
    public List<CiviliteDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public CiviliteDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}