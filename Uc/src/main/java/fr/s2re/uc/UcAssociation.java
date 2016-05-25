package fr.s2re.uc;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.AssociationDto;
import fr.s2re.dto.EnvieDto;
import fr.s2re.iuc.IUcAssociation;

@Remote(IUcAssociation.class)
@Stateless
public class UcAssociation implements IUcAssociation {
    @Override
    public List<EnvieDto> consulterSaListeDeSouhaits(AssociationDto paramAssociationDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}
