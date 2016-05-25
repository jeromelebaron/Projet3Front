package fr.s2re.idao;

import java.util.List;

import fr.s2re.entity.AlerteProduit;
import fr.s2re.entity.Categorie;
import fr.s2re.entity.Client;
import fr.s2re.entity.Commande;
import fr.s2re.entity.Couleur;
import fr.s2re.entity.Image;
import fr.s2re.entity.Marque;
import fr.s2re.entity.NoteProduit;
import fr.s2re.entity.Produit;

public interface IDaoProduit {
    List<Produit> getAll();

    Produit addProduit(Produit paramProduit);

    Produit update(Produit paramProduit);

    void delete(Produit paramProduit);

    Produit getProduit(Produit paramProduit);

    Produit getById(int paramId);

    List<Produit> getByClient(Client paramClient);

    List<Produit> getByCategorie(Categorie paramCategorie);

    List<Produit> getByAlerte(AlerteProduit paramAlerte);

    List<Produit> getByMarque(Marque paramMarque);

    List<Produit> getByLibelle(String paramLibelle);

    List<Produit> getByCouleur(Couleur paramCouleur);

    List<AlerteProduit> getAlerte(Produit paramProduit);

    List<NoteProduit> getNote(Produit paramProduit);

    List<Image> getImage(Produit paramProduit);

    List<Produit> getProduitEnVente(Client paramClient);

    List<Commande> getHistoriqueVente(Client paramClient);

    List<Commande> getVentesEnPreparation(Client paramClient);
}