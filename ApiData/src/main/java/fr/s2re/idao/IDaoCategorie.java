package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Categorie;
import fr.s2re.entity.Produit;

public interface IDaoCategorie {
    List<Categorie> getAll();

    List<Categorie> getSousCategorie(Categorie paramCategorie);

    Categorie getById(int paramId);

    Categorie getCatParent(Categorie paramCategorie);

    List<Categorie> getCategories(Categorie paramCategorie);

    List<Produit> getProduits(Categorie paramCategorie);

    List<Categorie> getAllParents();
}