package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.AssociationDto;
import fr.s2re.dto.DonDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.ibusiness.IBusinessDon;

@Remote(IBusinessDon.class)
@Stateless
public class BusinessDon implements IBusinessDon {
    @Override
    public DonDto addDon(DonDto paramDon) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<DonDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<DonDto> getByAsso(AssociationDto paramAssociation) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<DonDto> getByClient(UtilisateurDto paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}