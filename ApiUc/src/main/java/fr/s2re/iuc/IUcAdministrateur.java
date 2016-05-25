package fr.s2re.iuc;

import fr.s2re.dto.ModerateurDto;

public interface IUcAdministrateur {
    ModerateurDto addModerateur(ModerateurDto paramModerateurDto);

    void deleteModerateur(ModerateurDto paramModerateurDto);
}
