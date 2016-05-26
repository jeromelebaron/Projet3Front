
package fr.s2re.stock.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProduitByReferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProduitByReferenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produitByReference" type="{http://webservice.stock.s2re.fr}produitDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProduitByReferenceResponse", propOrder = {
    "produitByReference"
})
public class GetProduitByReferenceResponse {

    protected ProduitDto produitByReference;

    /**
     * Gets the value of the produitByReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProduitDto }
     *     
     */
    public ProduitDto getProduitByReference() {
        return produitByReference;
    }

    /**
     * Sets the value of the produitByReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduitDto }
     *     
     */
    public void setProduitByReference(ProduitDto value) {
        this.produitByReference = value;
    }

}
