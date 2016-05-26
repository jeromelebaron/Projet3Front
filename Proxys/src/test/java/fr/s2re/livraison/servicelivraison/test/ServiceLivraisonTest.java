/**
 * Créé le 19 mai 2016 par Jérome LE BARON
 */
package fr.s2re.livraison.servicelivraison.test;

import java.util.List;

import org.apache.log4j.Logger;

import fr.s2re.livraison.servicelivraison.HorairesDto;
import fr.s2re.livraison.servicelivraison.ILivraisonWebService;
import fr.s2re.livraison.servicelivraison.JourOuvertureDto;
import fr.s2re.livraison.servicelivraison.ServiceLivraisonDto;
import fr.s2re.livraison.servicelivraison.ServiceLivraisonWS;

/**
 * Pour tester les webservices.
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class ServiceLivraisonTest {

    private ServiceLivraisonTest() {
        // EMPTY
    }

    private final static Logger LOGGER = Logger.getLogger(ServiceLivraisonTest.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        LOGGER.debug("Début des tests");

        LOGGER.debug("Test du service de livraison par ville");
        ServiceLivraisonWS serviceLivraisonWS = new ServiceLivraisonWS();
        ILivraisonWebService serviceLivraisonWebService = serviceLivraisonWS
                .getServiceLivraisonWebServiceImplPort();
        List<ServiceLivraisonDto> serviceTrouveByVille = serviceLivraisonWebService
                .getServiceLivraisonByCodePostalVille("75015");
        for (ServiceLivraisonDto localServiceLivraisonDto : serviceTrouveByVille) {
            LOGGER.info(localServiceLivraisonDto.getId());
            List<JourOuvertureDto> lesJourOuvertureDto = localServiceLivraisonDto
                    .getJourOuvertures();
            LOGGER.info(lesJourOuvertureDto.size());
            for (JourOuvertureDto localJourOuvertureDto : lesJourOuvertureDto) {
                LOGGER.info(localJourOuvertureDto.getJourSemaine().getLibelle());
                List<HorairesDto> lesHorairesDto = localJourOuvertureDto.getHoraires();
                for (HorairesDto localHorairesDto : lesHorairesDto) {
                    LOGGER.info("Horaire de " + localJourOuvertureDto.getJourSemaine().getLibelle()
                            + " : " + localHorairesDto.getDebut().getHour() + "h"
                            + localHorairesDto.getFin() + "m");
                }
            }
        }
        LOGGER.debug("Fin du test des services de livraison par ville");

        LOGGER.debug("Test des services de livraison par type service");
        List<ServiceLivraisonDto> serviceTrouveByTypeService = serviceLivraisonWebService
                .getServiceLivraisonByIdTypeLivraison(1);
        LOGGER.info(serviceTrouveByTypeService.size());
        LOGGER.debug("Fin du test des services de livraison par type service");

        LOGGER.debug("Fin des tests");
        
    }

}
