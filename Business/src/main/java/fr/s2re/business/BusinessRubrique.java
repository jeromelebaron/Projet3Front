package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.RubriqueDto;
import fr.s2re.ibusiness.IBusinessRubrique;

@Remote(IBusinessRubrique.class)
@Stateless
public class BusinessRubrique implements IBusinessRubrique {
    @Override
    public RubriqueDto addRubrique(RubriqueDto paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public RubriqueDto updateRubrique(RubriqueDto paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<RubriqueDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<RubriqueDto> getSousRubrique(RubriqueDto paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public RubriqueDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}