/**
 * Créé le 23 mai 2016 par Jérome LE BARON
 */
package fr.s2re.uc;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.CommandeDto;
import fr.s2re.ibusiness.IBusinessServiceLivraison;
import fr.s2re.iuc.IUcCommande;
import fr.s2re.livraison.servicelivraison.ServiceLivraisonDto;

/**
 * Les implémentations des use case liés à la {@link CommandeDto}.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IUcCommande.class)
@Stateless
public class UcCommande implements IUcCommande {

    @EJB
    private IBusinessServiceLivraison businessServiceLivraison;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ServiceLivraisonDto> getServiceLivraisonByCodePostalVille(final String paramCodePostal) {
        return businessServiceLivraison.getServiceLivraisonByIdVille(paramCodePostal);
    }

    /**
     * Accesseur en lecture du champ <code>businessServiceLivraison</code>.
     * @return le champ <code>businessServiceLivraison</code>.
     */
    public IBusinessServiceLivraison getBusinessServiceLivraison() {
        return businessServiceLivraison;
    }

    /**
     * Accesseur en écriture du champ <code>businessServiceLivraison</code>.
     * @param paramBusinessServiceLivraison la valeur à écrire dans
     *            <code>businessServiceLivraison</code>.
     */
    public void setBusinessServiceLivraison(IBusinessServiceLivraison paramBusinessServiceLivraison) {
        businessServiceLivraison = paramBusinessServiceLivraison;
    }

}
