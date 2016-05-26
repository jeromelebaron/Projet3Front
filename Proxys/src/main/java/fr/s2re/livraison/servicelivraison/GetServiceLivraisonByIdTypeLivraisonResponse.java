
package fr.s2re.livraison.servicelivraison;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLivraisonByIdTypeLivraisonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLivraisonByIdTypeLivraisonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listeResultatServiceLivraisonByIdTypeLivraison" type="{http://servicelivraison.livraison.s2re.fr}serviceLivraisonDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLivraisonByIdTypeLivraisonResponse", propOrder = {
    "listeResultatServiceLivraisonByIdTypeLivraison"
})
public class GetServiceLivraisonByIdTypeLivraisonResponse {

    protected List<ServiceLivraisonDto> listeResultatServiceLivraisonByIdTypeLivraison;

    /**
     * Gets the value of the listeResultatServiceLivraisonByIdTypeLivraison property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeResultatServiceLivraisonByIdTypeLivraison property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeResultatServiceLivraisonByIdTypeLivraison().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLivraisonDto }
     * 
     * 
     */
    public List<ServiceLivraisonDto> getListeResultatServiceLivraisonByIdTypeLivraison() {
        if (listeResultatServiceLivraisonByIdTypeLivraison == null) {
            listeResultatServiceLivraisonByIdTypeLivraison = new ArrayList<ServiceLivraisonDto>();
        }
        return this.listeResultatServiceLivraisonByIdTypeLivraison;
    }

}
