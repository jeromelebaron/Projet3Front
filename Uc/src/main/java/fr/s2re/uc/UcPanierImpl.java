/**
 * Créé le 22 mai 2016 par Jérome LE BARON
 */
package fr.s2re.uc;

import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.ibusiness.IBusinessPanier;
import fr.s2re.iuc.IUcPanier;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IUcPanier.class)
@Stateless
public class UcPanierImpl implements IUcPanier {

    @EJB
    private IBusinessPanier businessPanier;

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<Integer, Integer> validerPanier(
            List<LigneDeCommandeDto> paramListeLigneCommande) {
        return businessPanier.verifierPanier(paramListeLigneCommande);
    }

    /**
     * Accesseur en lecture du champ <code>businessPanier</code>.
     * @return le champ <code>businessPanier</code>.
     */
    public IBusinessPanier getBusinessPanier() {
        return businessPanier;
    }

    /**
     * Accesseur en écriture du champ <code>businessPanier</code>.
     * @param paramBusinessPanier la valeur à écrire dans <code>businessPanier</code>.
     */
    public void setBusinessPanier(IBusinessPanier paramBusinessPanier) {
        businessPanier = paramBusinessPanier;
    }

}
