package fr.s2re.ibusiness;

import java.util.List;

import fr.s2re.dto.ImageDto;
import fr.s2re.dto.ProduitDto;

public interface IBusinessImage {
    List<ImageDto> getAll();

    List<ImageDto> getAll(ProduitDto paramProduit);
}
