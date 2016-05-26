
package fr.s2re.bpel.stock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageSortie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantiteProduitSortie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageSortie",
    "quantiteProduitSortie"
})
@XmlRootElement(name = "StockBPELResponse")
public class StockBPELResponse {

    @XmlElement(required = true)
    protected String messageSortie;
    protected int quantiteProduitSortie;

    /**
     * Gets the value of the messageSortie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSortie() {
        return messageSortie;
    }

    /**
     * Sets the value of the messageSortie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSortie(String value) {
        this.messageSortie = value;
    }

    /**
     * Gets the value of the quantiteProduitSortie property.
     * 
     */
    public int getQuantiteProduitSortie() {
        return quantiteProduitSortie;
    }

    /**
     * Sets the value of the quantiteProduitSortie property.
     * 
     */
    public void setQuantiteProduitSortie(int value) {
        this.quantiteProduitSortie = value;
    }

}
