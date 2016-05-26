
package fr.s2re.stock.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateProduit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateProduit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramProduit" type="{http://webservice.stock.s2re.fr}produitDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProduit", propOrder = {
    "paramProduit"
})
public class UpdateProduit {

    protected ProduitDto paramProduit;

    /**
     * Gets the value of the paramProduit property.
     * 
     * @return
     *     possible object is
     *     {@link ProduitDto }
     *     
     */
    public ProduitDto getParamProduit() {
        return paramProduit;
    }

    /**
     * Sets the value of the paramProduit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduitDto }
     *     
     */
    public void setParamProduit(ProduitDto value) {
        this.paramProduit = value;
    }

}
