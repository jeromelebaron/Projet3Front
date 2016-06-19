package fr.s2re.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import fr.s2re.bigdata.backend.mongo.dao.impl.DaoFournisseur;
import fr.s2re.bigdata.backend.mongo.idao.IDaoFournisseur;
import fr.s2re.bigdata.backend.wrapper.FournisseurWrapper;


@ManagedBean
public class MeilleurFournisseur {
	
	private List<FournisseurWrapper> fournisseurs;
	
	private IDaoFournisseur daoFournisseur = new DaoFournisseur();
	
	 @PostConstruct
	    public void init() {
	       fournisseurs = daoFournisseur.getBestFournisseur(5);
	    }

	public List<FournisseurWrapper> getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(List<FournisseurWrapper> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}
	 
	
	 
}
