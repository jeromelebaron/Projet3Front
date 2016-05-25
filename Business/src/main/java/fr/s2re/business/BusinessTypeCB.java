package fr.s2re.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.TypeCBDto;
import fr.s2re.ibusiness.IBusinessTypeCB;
import fr.s2re.idao.IDaoTypeCB;

@Remote(IBusinessTypeCB.class)
@Stateless
public class BusinessTypeCB implements IBusinessTypeCB {
    @EJB
    private IDaoTypeCB daoTypeCB;

    @Override
    public List<TypeCBDto> getAll() {
        return AssembleurDto.listTypeCbDtoFromListTypeCb(daoTypeCB.getAll());
    }

    @Override
    public TypeCBDto getByLibelle(String paramLibelle) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}