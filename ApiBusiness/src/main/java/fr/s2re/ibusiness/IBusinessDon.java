package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.AssociationDto;
import fr.s2re.dto.DonDto;
import fr.s2re.dto.UtilisateurDto;

public interface IBusinessDon {
    DonDto addDon(DonDto paramDon);

    List<DonDto> getAll();

    List<DonDto> getByAsso(AssociationDto paramAssociation);

    List<DonDto> getByClient(UtilisateurDto paramUtilisateur);
}