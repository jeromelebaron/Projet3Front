package fr.s2re.business;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.ClientDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.ibusiness.IBusinessAdresse;
import fr.s2re.idao.IDaoAdresse;

@Remote(IBusinessAdresse.class)
@Stateless
public class BusinessAdresse implements IBusinessAdresse {
    private static Logger log = Logger.getLogger(BusinessAdresse.class);
    @EJB
    private IDaoAdresse daoAdresse;

    @Override
    public AdresseDto addAdresse(AdresseDto paramAdresse) {
        return AssembleurDto.adresseDtoFromAdresse(daoAdresse.addAdresse(AssembleurDto.adresseFromAdresseDto(paramAdresse)));
    }

    @Override
    public AdresseDto updateAdresse(AdresseDto paramAdresse) {
        return AssembleurDto.adresseDtoFromAdresse(daoAdresse.updateAdresse(AssembleurDto.adresseFromAdresseDto(paramAdresse)));
    }

    @Override
    public AdresseDto getById(Integer paramId) {
        return AssembleurDto.adresseDtoFromAdresse(daoAdresse.getById(paramId));
    }

    @Override
    public List<AdresseDto> getAll() {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AdresseDto> getByUser(UtilisateurDto paramUtilisateur) {
        return AssembleurDto
                .listAdresseDtoFromListAdresse(daoAdresse.getByUser(AssembleurDto.clientFromClientDto((ClientDto) paramUtilisateur)));
    }

    @Override
    public AdresseDto getByCoordonnees(BigDecimal paramLongitude, BigDecimal paramLatitude) {
        throw new UnsupportedOperationException("Non implémenté");
    }
}