package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CartePaiementDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.ibusiness.IBusinessCartePaiement;

@Remote(IBusinessCartePaiement.class)
@Stateless
public class BusinessCartePaiement implements IBusinessCartePaiement {
    @Override
    public CartePaiementDto addCarte(CartePaiementDto paramCartePaiement) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public CartePaiementDto deleteCarte(CartePaiementDto paramCartePaiement) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public CartePaiementDto getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<CartePaiementDto> getByClient(ClientDto paramClient) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}