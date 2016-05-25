package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.CartePaiementDto;
import fr.s2re.dto.ClientDto;

public interface IBusinessCartePaiement {
    CartePaiementDto addCarte(CartePaiementDto paramCartePaiement);

    CartePaiementDto deleteCarte(CartePaiementDto paramCartePaiement);

    CartePaiementDto getById(Integer paramId);

    List<CartePaiementDto> getByClient(ClientDto paramClient);
}