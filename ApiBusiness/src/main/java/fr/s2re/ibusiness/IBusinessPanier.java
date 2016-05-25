/**
 * Créé le 22 mai 2016 par Jérome LE BARON
 */
package fr.s2re.ibusiness;

import java.util.List;
import java.util.Map;

import fr.s2re.dto.LigneDeCommandeDto;

/**
 * Concerne les règles métiers liées au panier.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IBusinessPanier {

    Map<Integer, Integer> verifierPanier(
            List<LigneDeCommandeDto> paramLesLignesDeCommande);

}
