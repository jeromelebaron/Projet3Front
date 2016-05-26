
package fr.s2re.stock.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for decrementerStockResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decrementerStockResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nouvelleQuantite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decrementerStockResponse", propOrder = {
    "nouvelleQuantite"
})
public class DecrementerStockResponse {

    protected Integer nouvelleQuantite;

    /**
     * Gets the value of the nouvelleQuantite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNouvelleQuantite() {
        return nouvelleQuantite;
    }

    /**
     * Sets the value of the nouvelleQuantite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNouvelleQuantite(Integer value) {
        this.nouvelleQuantite = value;
    }

}
