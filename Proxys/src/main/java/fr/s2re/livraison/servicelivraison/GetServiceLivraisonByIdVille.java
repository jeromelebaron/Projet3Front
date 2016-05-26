
package fr.s2re.livraison.servicelivraison;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLivraisonByIdVille complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLivraisonByIdVille">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramIdVille" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLivraisonByIdVille", propOrder = {
    "paramIdVille"
})
public class GetServiceLivraisonByIdVille {

    protected Integer paramIdVille;

    /**
     * Gets the value of the paramIdVille property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParamIdVille() {
        return paramIdVille;
    }

    /**
     * Sets the value of the paramIdVille property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParamIdVille(Integer value) {
        this.paramIdVille = value;
    }

}
