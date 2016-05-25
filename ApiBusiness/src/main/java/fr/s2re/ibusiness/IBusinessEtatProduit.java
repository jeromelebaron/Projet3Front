package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.EtatProduitDto;

public interface IBusinessEtatProduit {
    List<EtatProduitDto> getAll();

    EtatProduitDto getById(Integer paramId);

    EtatProduitDto getByLibelle(String paramLibelle);
}