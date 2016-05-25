package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.Produit;
import fr.s2re.entity.ProduitCodeReduction;

public interface IDaoProduitCodeReduction {
    ProduitCodeReduction addPdtCodeReduc(ProduitCodeReduction paramPdtCodeReduc);

    List<ProduitCodeReduction> getAll();

    List<ProduitCodeReduction> getByProduit(Produit paramProduit);
}