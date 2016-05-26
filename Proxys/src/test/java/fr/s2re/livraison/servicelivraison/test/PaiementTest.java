package fr.s2re.livraison.servicelivraison.test;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import fr.s2re.banque.servicebanque.CarteBancaireDto;
import fr.s2re.banque.servicebanque.ClientDto;
import fr.s2re.banque.servicebanque.CompteBancaireDto;
import fr.s2re.banque.servicebanque.IServiceBanqueWebService;
import fr.s2re.banque.servicebanque.OperationBancaireDto;
import fr.s2re.banque.servicebanque.ServiceBanqueWS;

public class PaiementTest {
   private PaiementTest() {
	
   }
   private final static Logger LOGGER = Logger.getLogger(ServiceLivraisonTest.class);
	public static void main(String[] args) {
		  LOGGER.debug("Début des tests");
		 ServiceBanqueWS serviceBanque = new ServiceBanqueWS();
		 IServiceBanqueWebService serviceBanqueWS = serviceBanque.getServiceBanqueWebServiceImpPort();
		 
		 ClientDto client = serviceBanqueWS.getCLientByNom("Le Baron");
		 LOGGER.info(client.getNomClient());
		 LOGGER.info(client.getComptebancaires());
		List<CompteBancaireDto> comptes =  client.getComptebancaires();
		 LOGGER.debug("recuperation du compte client");
		 LOGGER.info(comptes.get(0));
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = null;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 LOGGER.debug("Ajout credit");
		OperationBancaireDto operation = serviceBanqueWS.insertDebit(0, date2, 500, "Debit", comptes.get(0));
		LOGGER.info(operation);
		 CarteBancaireDto carte = new CarteBancaireDto(126,"0123456789012345");
		boolean resultat = serviceBanqueWS.verifierSolde("Le Baron",100, carte);
		LOGGER.info(resultat);

	}

}
