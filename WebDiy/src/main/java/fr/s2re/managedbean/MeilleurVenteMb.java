package fr.s2re.managedbean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import fr.s2re.bigdata.backend.mongo.dao.impl.DaoProduit;
import fr.s2re.bigdata.backend.mongo.idao.IDaoProduit;
import fr.s2re.bigdata.backend.wrapper.ProduitWrapper;
import fr.s2re.dto.ImageDto;
import fr.s2re.dto.ProduitDto;
import fr.s2re.iuc.IUcCommande;
import fr.s2re.iuc.IUcPanier;
import fr.s2re.iuc.IUcUtilisateur;
import fr.s2re.uc.UcPanierImpl;
import fr.s2re.uc.UcUtilisateur;

@ManagedBean
public class MeilleurVenteMb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProduitWrapper> produits;
	private List<ProduitDto> produitsDto = new ArrayList<>();
	private ProduitDto produit;



	@EJB
	private IUcUtilisateur ucUtilisateur;


	private IDaoProduit daoProduit = new DaoProduit();

	@PostConstruct
	public void init() {
		produits = daoProduit.getMeilleuresVentes(5);
		for(int i=1; i<6 ;i++){
			produit = recupProduit(i);
			produitsDto.add(produit);
			produitsDto.size();
			
		}
        
	}

	private ProduitDto recupProduit(int param){
		produit = new ProduitDto();
		produit = ucUtilisateur.getById(param);
		return produit;
	}

	public List<ProduitWrapper> getProduits() {
		return produits;
	}

	public void setProduits(List<ProduitWrapper> produits) {
		this.produits = produits;
	}

	
	public ProduitDto getProduit() {
		return produit;
	}

	public void setProduit(ProduitDto produit) {
		this.produit = produit;
	}

	public List<ProduitDto> getProduitsDto() {
		return produitsDto;
	}

	public void setProduitsDto(List<ProduitDto> produitsDto) {
		this.produitsDto = produitsDto;
	}





}
