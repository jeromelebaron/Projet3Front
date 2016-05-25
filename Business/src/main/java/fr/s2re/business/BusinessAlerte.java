package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.AlerteDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.ibusiness.IBusinessAlerte;

@Remote(IBusinessAlerte.class)
@Stateless
public class BusinessAlerte implements IBusinessAlerte {
    @Override
    public AlerteDto addAlerte(AlerteDto paramAlerte) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public AlerteDto updateAlerte(AlerteDto paramAlerte) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AlerteDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public AlerteDto getById(Integer paramId) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AlerteDto> getByObjet(Object paramObject) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AlerteDto> getByEmetteur(UtilisateurDto paramUtilisateur) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AlerteDto> getByObject(Object paramObj) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}