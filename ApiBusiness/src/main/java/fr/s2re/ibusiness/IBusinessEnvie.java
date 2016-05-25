package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.ClientDto;
import fr.s2re.dto.EnvieDto;

public interface IBusinessEnvie {
    EnvieDto addEnvie(EnvieDto paramEnvie);

    EnvieDto updateEnvie(EnvieDto paramEnvie);

    EnvieDto deleteEnvie(EnvieDto paramEnvie);

    List<EnvieDto> getAll();

    List<EnvieDto> getByClient(ClientDto paramClient);
}