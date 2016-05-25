package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.TypeSujetDto;
import fr.s2re.ibusiness.IBusinessTypeSujet;

@Remote(IBusinessTypeSujet.class)
@Stateless
public class BusinessTypeSujet implements IBusinessTypeSujet {
    @Override
    public List<TypeSujetDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public TypeSujetDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}