package fr.s2re.business;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.RibDto;
import fr.s2re.ibusiness.IBusinessRib;

@Remote(IBusinessRib.class)
@Stateless
public class BusinessRib implements IBusinessRib {
    @Override
    public RibDto addRib(RibDto paramRib) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public RibDto updateRib(RibDto paramRib) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public RibDto getByClient(ClientDto paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}