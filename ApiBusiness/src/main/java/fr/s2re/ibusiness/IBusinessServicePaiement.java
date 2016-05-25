package fr.s2re.ibusiness;

import fr.s2re.banque.servicebanque.CarteBancaireDto;

public interface IBusinessServicePaiement {
	
	boolean verifierSolde(String nomClient, double montantCommande, CarteBancaireDto carte);

}
