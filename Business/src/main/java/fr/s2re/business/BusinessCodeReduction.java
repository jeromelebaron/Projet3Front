package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CodeReductionDto;
import fr.s2re.dto.TypeReductionDto;
import fr.s2re.ibusiness.IBusinessCodeReduction;

@Remote(IBusinessCodeReduction.class)
@Stateless
public class BusinessCodeReduction implements IBusinessCodeReduction {
    @Override
    public List<CodeReductionDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<CodeReductionDto> getByType(TypeReductionDto paramTypeReduc) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public CodeReductionDto add(CodeReductionDto paramCodeReduction) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}