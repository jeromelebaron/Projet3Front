package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.VilleDto;

public interface IBusinessVille {
    List<VilleDto> getAll();

    List<VilleDto> getByCp(String paramCp);

    VilleDto getByNom(String paramNom);

    VilleDto getById(int paramId);

    VilleDto getByCpNom(String paramCp, String paramNom);
}