
package fr.s2re.uc;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

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
import fr.s2re.ibusiness.IBusinessAdresse;
import fr.s2re.ibusiness.IBusinessCategorie;
import fr.s2re.ibusiness.IBusinessProduit;
import fr.s2re.ibusiness.IBusinessUtilisateur;
import fr.s2re.ibusiness.IBusinessVille;
import fr.s2re.iuc.IUcUtilisateur;

@Remote(IUcUtilisateur.class)
@Stateless
public class UcUtilisateur implements IUcUtilisateur {
    private static Logger log = Logger.getLogger(UcUtilisateur.class);

    @EJB
    private IBusinessUtilisateur bUtilisateur;

    @EJB
    private IBusinessProduit bProduit;

    @EJB
    private IBusinessCategorie bCategorie;

    @EJB
    private IBusinessVille bVille;

    @EJB
    private IBusinessAdresse bAdresse;

    @Override
    public UtilisateurDto seConnecter(String paramMail, String paramMdp) {
        return bUtilisateur.getByIdentifiant(paramMail, paramMdp);
    }

    @Override
    public List<CategorieDto> getCatgByCatg(CategorieDto paramParaCategorieDto) {
        return bCategorie.getSousCategorie(paramParaCategorieDto);
    }

    @Override
    public List<CategorieDto> getAllCatg() {
        return bCategorie.getAll();
    }

    @Override
    public List<ProduitDto> getProduitByCatg(int paramIdCategorieDto) {
        List<ProduitDto> list = new ArrayList<>();
        CategorieDto categorieDto = bCategorie.getById(paramIdCategorieDto);
        list = bProduit.getByCategorie(categorieDto);
        getDansCatEnfants(list, categorieDto);
        for (ProduitDto p : list) {
            p.setNotes(bProduit.getNote(p));
            p.setImages(bProduit.getImage(p));
            // list.add(p);
        }
        return list;
    }

    private void getDansCatEnfants(List<ProduitDto> list, CategorieDto categorieDto) {
        categorieDto.setCategories(bCategorie.getSousCategorie(categorieDto));
        if (categorieDto.getCategories().size() != 0 || categorieDto.getCategories() != null) {
            for (CategorieDto c : categorieDto.getCategories()) {
                list.addAll(bProduit.getByCategorie(c));
                getDansCatEnfants(list, c);
            }
        }
    }

    @Override
    public List<ProduitDto> getProduitByMarque(MarqueDto paramMarque) {
        return bProduit.getByMarque(paramMarque);
       
    }

    @Override
    public List<ProduitDto> getProduitByCouleur(CouleurDto paramCouleur) {
        return bProduit.getByCouleur(paramCouleur);
    }

    @Override
    public ProduitDto afficherDetails(ProduitDto paramProduitDto) {
        paramProduitDto = bProduit.getProduitDto(paramProduitDto);
        paramProduitDto.setNotes(bProduit.getNote(paramProduitDto));
        paramProduitDto.setImages(bProduit.getImage(paramProduitDto));

        return paramProduitDto;

    }

    @Override
    public ProduitDto ajouterProduitPanier(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public ProduitDto retirerProduitPanier(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<ProduitDto> consulterPanier(ProduitDto paramProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<AlerteProduitDto> alerteSurProduit(ProduitDto paramProduitDto) {
        return bProduit.getAlerte(paramProduitDto);
    }

    @Override
    public List<AlerteCommentaireDto> alerteSurCommentaire(NoteProduitDto paramNoteProduitDto) {
        throw new UnsupportedOperationException("Non implémenté");
    }

    @Override
    public List<ProduitDto> getProduitByLibelle(String paramLibelle) {
        List<ProduitDto> list = new ArrayList<>();
        for (ProduitDto p : bProduit.getByLibelle(paramLibelle)) {
            p.setNotes(bProduit.getNote(p));
            p.setImages(bProduit.getImage(p));
            list.add(p);
        }
        return list;
    }

    @Override
    public List<ProduitDto> getAllProduit() {
        List<ProduitDto> list = new ArrayList<>();
        for (ProduitDto p : bProduit.getAll()) {
            p.setNotes(bProduit.getNote(p));
            p.setImages(bProduit.getImage(p));
            list.add(p);
        }
        return list;
    }

    @Override
    public ProduitDto getById(int paramId) {
        ProduitDto produitDto = bProduit.getPdtById(paramId);
        produitDto.setNotes(bProduit.getNote(produitDto));
        produitDto.setImages(bProduit.getImage(produitDto));
        return produitDto;
    }

    @Override
    public List<VilleDto> retournerVilles() {
        return bVille.getAll();
    }

    @Override
    public VilleDto retournerVilleParId(int paramIdVille) {
        return bVille.getById(paramIdVille);
    }

    @Override
    public AdresseDto retournerAdresseParId(int paramId) {
        return bAdresse.getById(paramId);
    }

	@Override
	public ProduitDto getProduitById(int id) {
		return bProduit.getPdtById(id);
	}
}
