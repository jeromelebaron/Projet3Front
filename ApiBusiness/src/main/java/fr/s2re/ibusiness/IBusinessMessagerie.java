package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.MessagerieDto;

public interface IBusinessMessagerie {
    List<MessagerieDto> getByClient(ClientDto client);

    List<MessagerieDto> getByVendeur(ClientDto vendeur);
}