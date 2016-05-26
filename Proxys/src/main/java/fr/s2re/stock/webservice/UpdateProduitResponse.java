
package fr.s2re.stock.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateProduitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateProduitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produitUpdate" type="{http://webservice.stock.s2re.fr}produitDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProduitResponse", propOrder = {
    "produitUpdate"
})
public class UpdateProduitResponse {

    protected ProduitDto produitUpdate;

    /**
     * Gets the value of the produitUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link ProduitDto }
     *     
     */
    public ProduitDto getProduitUpdate() {
        return produitUpdate;
    }

    /**
     * Sets the value of the produitUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduitDto }
     *     
     */
    public void setProduitUpdate(ProduitDto value) {
        this.produitUpdate = value;
    }

}
