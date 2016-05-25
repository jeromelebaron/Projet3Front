package fr.s2re.uc;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.banque.servicebanque.CarteBancaireDto;
import fr.s2re.dto.CartePaiementDto;
import fr.s2re.ibusiness.IBusinessServicePaiement;
import fr.s2re.iuc.IUcTransactionBancaire;

@Remote(IUcTransactionBancaire.class)
@Stateless
public class UcTransactionBancaire implements IUcTransactionBancaire {

	@EJB
	IBusinessServicePaiement servicePaiement;
    // Appel du webservice de paiement

    @Override
    public boolean validerPaiement(CartePaiementDto paramCartePaiementDto,
            double paramMontantTransaction) {
        return true;
    }

	@Override
	public boolean verifierSolde(String nomClient, double montantCommande, CarteBancaireDto carteDto) {
		return servicePaiement.verifierSolde(nomClient, montantCommande, carteDto);
	}

}
