
package fr.s2re.banque.servicebanque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crediter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crediter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramidCompte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paramMontant" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crediter", propOrder = {
    "paramidCompte",
    "paramMontant"
})
public class Crediter {

    protected Integer paramidCompte;
    protected Double paramMontant;

    /**
     * Gets the value of the paramidCompte property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParamidCompte() {
        return paramidCompte;
    }

    /**
     * Sets the value of the paramidCompte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParamidCompte(Integer value) {
        this.paramidCompte = value;
    }

    /**
     * Gets the value of the paramMontant property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParamMontant() {
        return paramMontant;
    }

    /**
     * Sets the value of the paramMontant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParamMontant(Double value) {
        this.paramMontant = value;
    }

}
