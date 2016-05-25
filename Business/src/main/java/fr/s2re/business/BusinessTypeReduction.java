package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.TypeReductionDto;
import fr.s2re.ibusiness.IBusinessTypeReduction;

@Remote(IBusinessTypeReduction.class)
@Stateless
public class BusinessTypeReduction implements IBusinessTypeReduction {
    @Override
    public List<TypeReductionDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public TypeReductionDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}