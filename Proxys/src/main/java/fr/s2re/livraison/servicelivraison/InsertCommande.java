
package fr.s2re.livraison.servicelivraison;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertCommande complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertCommande">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramCommande" type="{http://servicelivraison.livraison.s2re.fr}commandeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertCommande", propOrder = {
    "paramCommande"
})
public class InsertCommande {

    protected CommandeDto paramCommande;

    /**
     * Gets the value of the paramCommande property.
     * 
     * @return
     *     possible object is
     *     {@link CommandeDto }
     *     
     */
    public CommandeDto getParamCommande() {
        return paramCommande;
    }

    /**
     * Sets the value of the paramCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandeDto }
     *     
     */
    public void setParamCommande(CommandeDto value) {
        this.paramCommande = value;
    }

}
