
package fr.s2re.livraison.servicelivraison;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertCommandeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertCommandeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandeInseree" type="{http://servicelivraison.livraison.s2re.fr}commandeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertCommandeResponse", propOrder = {
    "commandeInseree"
})
public class InsertCommandeResponse {

    protected CommandeDto commandeInseree;

    /**
     * Gets the value of the commandeInseree property.
     * 
     * @return
     *     possible object is
     *     {@link CommandeDto }
     *     
     */
    public CommandeDto getCommandeInseree() {
        return commandeInseree;
    }

    /**
     * Sets the value of the commandeInseree property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandeDto }
     *     
     */
    public void setCommandeInseree(CommandeDto value) {
        this.commandeInseree = value;
    }

}
