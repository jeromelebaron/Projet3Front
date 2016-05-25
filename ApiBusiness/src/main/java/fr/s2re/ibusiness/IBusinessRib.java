package fr.s2re.ibusiness;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.RibDto;

public interface IBusinessRib {
    RibDto addRib(RibDto paramRib);

    RibDto updateRib(RibDto paramRib);

    RibDto getByClient(ClientDto paramClient);
}