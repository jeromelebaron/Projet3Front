/**
 * Créé le 23 mai 2016 par Jérome LE BARON
 */
package fr.s2re.iuc;

import java.util.List;

import fr.s2re.dto.VilleDto;
import fr.s2re.livraison.servicelivraison.ServiceLivraisonDto;

/**
 * Regroupe les use case liés à la commande.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public interface IUcCommande {

    /**
     * Pour récupérer tous les services de livraisons par {@link VilleDto}.
     * @param paramCodePostal le code postal de la {@link VilleDto}.
     * @return une liste de {@link ServiceLivraisonDto}.
     */
    List<ServiceLivraisonDto> getServiceLivraisonByCodePostalVille(String paramCodePostal);

}
