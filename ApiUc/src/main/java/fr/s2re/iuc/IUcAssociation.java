package fr.s2re.iuc;

import java.util.List;

import fr.s2re.dto.AssociationDto;
import fr.s2re.dto.EnvieDto;

public interface IUcAssociation {
    List<EnvieDto> consulterSaListeDeSouhaits(AssociationDto paramAssociationDto);
}
