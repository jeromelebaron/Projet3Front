/**
 * Créé le 22 mai 2016 par Jérome LE BARON
 */
package fr.s2re.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.xml.ws.BindingProvider;

import fr.s2re.bpel.stock.StockBPEL;
import fr.s2re.bpel.stock.StockBPELPortType;
import fr.s2re.bpel.stock.StockBPELRequest;
import fr.s2re.bpel.stock.StockBPELResponse;
import fr.s2re.dto.LigneDeCommandeDto;
import fr.s2re.ibusiness.IBusinessPanier;

/**
 * Implémentation concernant le business du panier.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
@Remote(IBusinessPanier.class)
@Stateless
public class BusinessPanierImpl implements IBusinessPanier {

    /**
     * Pour récupérer l'interface du BPEL;
     */
    private StockBPEL stockBPEL = new StockBPEL();
    /**
     * Le proxy du BPEL.
     */
    private StockBPELPortType proxy = stockBPEL.getStockBPELPort();

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<Integer, Integer> verifierPanier(List<LigneDeCommandeDto> paramLesLignesDeCommande) {
        BindingProvider bp = (BindingProvider) proxy;
        // Si le service généré par Tomcat ne fonctionne plus
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                "http://192.168.100.172:8080/ode/processes/StockBPEL?wsdl");
        Map<Integer, Integer> mapProduitStockInsuffisant = new HashMap<>();
        for (LigneDeCommandeDto localLigneDeCommandeDto : paramLesLignesDeCommande) {
            final StockBPELRequest payload = new StockBPELRequest();
            payload.setReferenceProduit(localLigneDeCommandeDto.getProduit().getReference());
            payload.setQuantiteProduit(localLigneDeCommandeDto.getQuantite());
            final StockBPELResponse stockBPELResponse = proxy.process(payload);
            if ("StockInsuffisant".equals(stockBPELResponse.getMessageSortie())) {
                mapProduitStockInsuffisant.put(localLigneDeCommandeDto.getProduit().getId(),
                        stockBPELResponse.getQuantiteProduitSortie());
            }
        }
        return mapProduitStockInsuffisant;
    }

}
