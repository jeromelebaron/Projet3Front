/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.stock.test;

import org.apache.log4j.Logger;

import fr.s2re.stock.webservice.IStockWebService;
import fr.s2re.stock.webservice.ProduitDto;
import fr.s2re.stock.webservice.WebServiceStock;

public class StockTest {

    private StockTest() {
        // EMPTY
    }

    /**
     * Pour faire du log.
     */
    private final static Logger LOGGER = Logger.getLogger(StockTest.class);

    /**
     * Le main pour faire le test
     * @param args java.
     */
    public static void main(String[] args) {
        LOGGER.debug("Début des tests");

        LOGGER.debug("Test du service de stock");
        WebServiceStock WSStock = new WebServiceStock();
        IStockWebService stockWebService = WSStock.getStockWebServiceImplPort();
        ProduitDto produitDto = stockWebService.getProduitByReference("TB001");
        LOGGER.info(produitDto.getId());
        LOGGER.debug("Fin du test du service de stock");

        LOGGER.debug("Fin des tests");
    }
}
