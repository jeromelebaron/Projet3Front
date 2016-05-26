
package fr.s2re.livraison.servicelivraison;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLivraisonByIdVilleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLivraisonByIdVilleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listeResultatServiceLivraisonByIdVille" type="{http://servicelivraison.livraison.s2re.fr}serviceLivraisonDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLivraisonByIdVilleResponse", propOrder = {
    "listeResultatServiceLivraisonByIdVille"
})
public class GetServiceLivraisonByIdVilleResponse {

    protected List<ServiceLivraisonDto> listeResultatServiceLivraisonByIdVille;

    /**
     * Gets the value of the listeResultatServiceLivraisonByIdVille property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeResultatServiceLivraisonByIdVille property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeResultatServiceLivraisonByIdVille().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLivraisonDto }
     * 
     * 
     */
    public List<ServiceLivraisonDto> getListeResultatServiceLivraisonByIdVille() {
        if (listeResultatServiceLivraisonByIdVille == null) {
            listeResultatServiceLivraisonByIdVille = new ArrayList<ServiceLivraisonDto>();
        }
        return this.listeResultatServiceLivraisonByIdVille;
    }

}
