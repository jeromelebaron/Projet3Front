package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.MessagerieDto;
import fr.s2re.ibusiness.IBusinessMessagerie;

@Remote(IBusinessMessagerie.class)
@Stateless
public class BusinessMessagerie implements IBusinessMessagerie {
    @Override
    public List<MessagerieDto> getByClient(ClientDto paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<MessagerieDto> getByVendeur(ClientDto paramVendeur) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}