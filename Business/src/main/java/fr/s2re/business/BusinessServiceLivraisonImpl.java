/**
 * Créé le 23 mai 2016 par Jérome LE BARON
 */
package fr.s2re.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.ibusiness.IBusinessServiceLivraison;
import fr.s2re.livraison.servicelivraison.ILivraisonWebService;
import fr.s2re.livraison.servicelivraison.ServiceLivraisonDto;
import fr.s2re.livraison.servicelivraison.ServiceLivraisonWS;

/**
 * Les implémentations concernant les règles de gestion du service de livraison.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IBusinessServiceLivraison.class)
@Stateless
public class BusinessServiceLivraisonImpl implements IBusinessServiceLivraison {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByIdVille(final String paramCodePostal) {
        ServiceLivraisonWS serviceLivraisonWS = new ServiceLivraisonWS();
        ILivraisonWebService proxy = serviceLivraisonWS.getServiceLivraisonWebServiceImplPort();
        return proxy.getServiceLivraisonByCodePostalVille(paramCodePostal);
    }

}
