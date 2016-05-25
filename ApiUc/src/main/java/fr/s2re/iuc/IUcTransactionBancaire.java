package fr.s2re.iuc;

import fr.s2re.banque.servicebanque.CarteBancaireDto;
import fr.s2re.dto.CartePaiementDto;
import fr.s2re.dto.CommandeDto;

/**
 * Pour tous les use case concernant les transactions bancaires.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IUcTransactionBancaire {

    /**
     * Pour valider le paiement de la {@link CommandeDto}.
     * @param paramCartePaiementDto la {@link CartePaiementDto} pour le paiement.
     * @param paramMontantTransaction le montant de la transaction.
     * @return <code>true</code> si la commande est validée <code>false</code> sinon.
     */
    boolean validerPaiement(CartePaiementDto paramCartePaiementDto, double paramMontantTransaction);
    /**
     * pour verifier le solde dans le compte bancaire du client avant de payer
     * @param nomClient
     * @param montantCommande
     * @return
     */
    boolean verifierSolde(String nomClient, double montantCommande, CarteBancaireDto carteDto);
}
