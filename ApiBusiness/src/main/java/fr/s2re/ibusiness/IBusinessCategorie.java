package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.CategorieDto;
import fr.s2re.dto.ProduitDto;

public interface IBusinessCategorie {
    List<CategorieDto> getAll();

    List<CategorieDto> getSousCategorie(CategorieDto paramCategorie);

    CategorieDto getById(int paramId);

    CategorieDto getCatParent(CategorieDto paramCategorie);

    List<CategorieDto> getCategories(CategorieDto paramCategorie);

    List<ProduitDto> getProduits(CategorieDto paramCategorie);

    List<CategorieDto> getAllParents();
}