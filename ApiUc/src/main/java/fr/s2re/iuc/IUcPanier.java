/**
 * Créé le 22 mai 2016 par Jérome LE BARON
 */
package fr.s2re.iuc;

import java.util.List;
import java.util.Map;

import fr.s2re.dto.LigneDeCommandeDto;

/**
 * Concerne les uses case liés au panier.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IUcPanier {

    /**
     * Pour valider le panier.
     * @param paramListeLigneCommande la liste des {@link LigneDeCommandeDto} du panier.
     * @return une Map avec en clé la ligne de commande et en valeur la quantité restante dans le
     *         stock.
     */
    Map<Integer, Integer> validerPanier(List<LigneDeCommandeDto> paramListeLigneCommande);

}
