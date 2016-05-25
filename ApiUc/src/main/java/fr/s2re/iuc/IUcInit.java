package fr.s2re.iuc;

import java.util.List;

import fr.s2re.dto.CategorieDto;

public interface IUcInit {
    List<CategorieDto> getAllCategorie();

    List<CategorieDto> getSousCategorie(CategorieDto paramCategorie);

    List<CategorieDto> getCatRacine();
}
