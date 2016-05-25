package fr.s2re.iuc;

import java.util.List;

import fr.s2re.dto.ProduitDto;

public interface IUcGerant {
    ProduitDto addProduit(ProduitDto paramProduitDto);

    List<ProduitDto> consulterStock();

    ProduitDto deleteProduitCatalog(ProduitDto paramProduitDto);
}
