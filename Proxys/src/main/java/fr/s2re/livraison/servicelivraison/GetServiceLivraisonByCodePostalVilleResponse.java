
package fr.s2re.livraison.servicelivraison;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLivraisonByCodePostalVilleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLivraisonByCodePostalVilleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listeResultatServiceLivraisoncodePostalVille" type="{http://servicelivraison.livraison.s2re.fr}serviceLivraisonDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLivraisonByCodePostalVilleResponse", propOrder = {
    "listeResultatServiceLivraisoncodePostalVille"
})
public class GetServiceLivraisonByCodePostalVilleResponse {

    protected List<ServiceLivraisonDto> listeResultatServiceLivraisoncodePostalVille;

    /**
     * Gets the value of the listeResultatServiceLivraisoncodePostalVille property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeResultatServiceLivraisoncodePostalVille property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeResultatServiceLivraisoncodePostalVille().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLivraisonDto }
     * 
     * 
     */
    public List<ServiceLivraisonDto> getListeResultatServiceLivraisoncodePostalVille() {
        if (listeResultatServiceLivraisoncodePostalVille == null) {
            listeResultatServiceLivraisoncodePostalVille = new ArrayList<ServiceLivraisonDto>();
        }
        return this.listeResultatServiceLivraisoncodePostalVille;
    }

}
