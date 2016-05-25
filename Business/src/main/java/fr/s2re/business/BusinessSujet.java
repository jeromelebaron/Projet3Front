package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.RubriqueDto;
import fr.s2re.dto.SujetDto;
import fr.s2re.dto.TypeSujetDto;
import fr.s2re.ibusiness.IBusinessSujet;

@Remote(IBusinessSujet.class)
@Stateless
public class BusinessSujet implements IBusinessSujet {
    @Override
    public SujetDto addSujet(SujetDto paramSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public SujetDto updateSujet(SujetDto paramSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public SujetDto closeSujet(SujetDto paramSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public SujetDto getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<SujetDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<SujetDto> getByType(TypeSujetDto paramTypeSujet) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<SujetDto> getByRubrique(RubriqueDto paramRubrique) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<SujetDto> getByPublication(Boolean paramBoolean) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}