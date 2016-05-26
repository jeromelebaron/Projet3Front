
package fr.s2re.stock.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for decrementerStock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decrementerStock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qteStock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="qteCommande" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decrementerStock", propOrder = {
    "qteStock",
    "qteCommande"
})
public class DecrementerStock {

    protected int qteStock;
    protected int qteCommande;

    /**
     * Gets the value of the qteStock property.
     * 
     */
    public int getQteStock() {
        return qteStock;
    }

    /**
     * Sets the value of the qteStock property.
     * 
     */
    public void setQteStock(int value) {
        this.qteStock = value;
    }

    /**
     * Gets the value of the qteCommande property.
     * 
     */
    public int getQteCommande() {
        return qteCommande;
    }

    /**
     * Sets the value of the qteCommande property.
     * 
     */
    public void setQteCommande(int value) {
        this.qteCommande = value;
    }

}
