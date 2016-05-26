
package fr.s2re.livraison.servicelivraison;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServiceLivraisonByCodePostalVille complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceLivraisonByCodePostalVille">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramCpVille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceLivraisonByCodePostalVille", propOrder = {
    "paramCpVille"
})
public class GetServiceLivraisonByCodePostalVille {

    protected String paramCpVille;

    /**
     * Gets the value of the paramCpVille property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamCpVille() {
        return paramCpVille;
    }

    /**
     * Sets the value of the paramCpVille property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamCpVille(String value) {
        this.paramCpVille = value;
    }

}
