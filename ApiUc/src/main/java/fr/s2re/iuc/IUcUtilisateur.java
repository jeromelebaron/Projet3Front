package fr.s2re.iuc;

import java.util.List;

import fr.s2re.dto.AdresseDto;
import fr.s2re.dto.AlerteCommentaireDto;
import fr.s2re.dto.AlerteProduitDto;
import fr.s2re.dto.CategorieDto;
import fr.s2re.dto.CouleurDto;
import fr.s2re.dto.MarqueDto;
import fr.s2re.dto.NoteProduitDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.dto.UtilisateurDto;
import fr.s2re.dto.VilleDto;

public interface IUcUtilisateur {
    // connection
    UtilisateurDto seConnecter(String paramMail, String paramMdp);

    // Recherche Produit
    List<CategorieDto> getCatgByCatg(CategorieDto paraCategorieDto);

    List<CategorieDto> getAllCatg();

    List<ProduitDto> getAllProduit();// pour le back sinon au niveau client on recup par catégorie ??

    List<ProduitDto> getProduitByCatg(int paramCategorieDto);

    List<ProduitDto> getProduitByMarque(MarqueDto paramMarque);

    List<ProduitDto> getProduitByCouleur(CouleurDto paramCouleur);

    List<ProduitDto> getProduitByLibelle(String paramLibelle);

    ProduitDto getById(int paramId);

    // afficher detail produit
    ProduitDto afficherDetails(ProduitDto paramProduitDto);

    // gerer Panier
    ProduitDto ajouterProduitPanier(ProduitDto paramProduitDto);

    ProduitDto retirerProduitPanier(ProduitDto paramProduitDto);

    List<ProduitDto> consulterPanier(ProduitDto paramProduitDto);

    // Alertes
    List<AlerteProduitDto> alerteSurProduit(ProduitDto paramProduitDto);

    List<AlerteCommentaireDto> alerteSurCommentaire(NoteProduitDto paramNoteProduitDto);

    // Villes + autres infos ??
    List<VilleDto> retournerVilles();

    VilleDto retournerVilleParId(int paramIdVille);

    // Adresse
    AdresseDto retournerAdresseParId(int paramId);
}
