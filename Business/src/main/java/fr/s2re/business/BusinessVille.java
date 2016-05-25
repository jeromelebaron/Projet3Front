package fr.s2re.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.assembleur.AssembleurDto;
import fr.s2re.dto.VilleDto;
import fr.s2re.ibusiness.IBusinessVille;
import fr.s2re.idao.IDaoVille;

@Remote(IBusinessVille.class)
@Stateless
public class BusinessVille implements IBusinessVille {
    @EJB
    private IDaoVille daoVille;

    @Override
    public List<VilleDto> getAll() {
        return AssembleurDto.listVilleDtoFromListVille(daoVille.getAll());
    }

    @Override
    public List<VilleDto> getByCp(String paramCp) {
        return AssembleurDto.listVilleDtoFromListVille(daoVille.getByCp(paramCp));
    }

    @Override
    public VilleDto getByCpNom(String paramCp, String paramNom) {
        return AssembleurDto.villeDtoFromVille(daoVille.getByCpNom(paramCp, paramNom));
    }

    @Override
    public VilleDto getByNom(String paramNom) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public VilleDto getById(int paramId) {
        return AssembleurDto.villeDtoFromVille(daoVille.getById(paramId));
    }
}