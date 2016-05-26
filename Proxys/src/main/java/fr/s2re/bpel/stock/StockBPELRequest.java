
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
 *         &lt;element name="referenceProduit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantiteProduit" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "referenceProduit",
    "quantiteProduit"
})
@XmlRootElement(name = "StockBPELRequest")
public class StockBPELRequest {

    @XmlElement(required = true)
    protected String referenceProduit;
    protected int quantiteProduit;

    /**
     * Gets the value of the referenceProduit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceProduit() {
        return referenceProduit;
    }

    /**
     * Sets the value of the referenceProduit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceProduit(String value) {
        this.referenceProduit = value;
    }

    /**
     * Gets the value of the quantiteProduit property.
     * 
     */
    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    /**
     * Sets the value of the quantiteProduit property.
     * 
     */
    public void setQuantiteProduit(int value) {
        this.quantiteProduit = value;
    }

}
