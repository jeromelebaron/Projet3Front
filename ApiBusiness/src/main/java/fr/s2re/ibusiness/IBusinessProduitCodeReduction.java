package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.ProduitCodeReductionDto;
import fr.s2re.dto.ProduitDto;

public interface IBusinessProduitCodeReduction {
    ProduitCodeReductionDto addPdtCodeReduc(ProduitCodeReductionDto paramPdtCodeReduc);

    List<ProduitCodeReductionDto> getAll();

    List<ProduitCodeReductionDto> getByProduit(ProduitDto paramProduit);
}