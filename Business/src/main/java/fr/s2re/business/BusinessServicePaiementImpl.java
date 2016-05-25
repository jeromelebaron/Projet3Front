package fr.s2re.business;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.banque.servicebanque.CarteBancaireDto;
import fr.s2re.banque.servicebanque.IServiceBanqueWebService;
import fr.s2re.banque.servicebanque.ServiceBanqueWS;
import fr.s2re.ibusiness.IBusinessLigneDeCommande;
import fr.s2re.ibusiness.IBusinessServicePaiement;

@Remote(IBusinessServicePaiement.class)
@Stateless
public class BusinessServicePaiementImpl implements IBusinessServicePaiement {

	@Override
	public boolean verifierSolde(String nomClient, double montantCommande, CarteBancaireDto carteDto) {
		ServiceBanqueWS serviceBanque = new ServiceBanqueWS();
		IServiceBanqueWebService proxy = serviceBanque.getServiceBanqueWebServiceImpPort();
		boolean disponibiliteSolde = proxy.verifierSolde(nomClient, montantCommande,carteDto);
		return disponibiliteSolde;
	}

}
