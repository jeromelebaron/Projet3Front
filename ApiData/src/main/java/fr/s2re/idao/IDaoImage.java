package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Image;
import fr.s2re.entity.Produit;

public interface IDaoImage {
    List<Image> getAll();

    List<Image> getAll(Produit paramProduit);
}
