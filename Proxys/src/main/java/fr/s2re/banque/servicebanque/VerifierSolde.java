
package fr.s2re.banque.servicebanque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verifierSolde complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifierSolde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramNomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramMontantCommande" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="paramcarteBancairee" type="{http://servicebanque.banque.s2re.fr}carteBancaireDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifierSolde", propOrder = {
    "paramNomClient",
    "paramMontantCommande",
    "paramcarteBancairee"
})
public class VerifierSolde {

    protected String paramNomClient;
    protected double paramMontantCommande;
    protected CarteBancaireDto paramcarteBancairee;

    /**
     * Gets the value of the paramNomClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamNomClient() {
        return paramNomClient;
    }

    /**
     * Sets the value of the paramNomClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamNomClient(String value) {
        this.paramNomClient = value;
    }

    /**
     * Gets the value of the paramMontantCommande property.
     * 
     */
    public double getParamMontantCommande() {
        return paramMontantCommande;
    }

    /**
     * Sets the value of the paramMontantCommande property.
     * 
     */
    public void setParamMontantCommande(double value) {
        this.paramMontantCommande = value;
    }

    /**
     * Gets the value of the paramcarteBancairee property.
     * 
     * @return
     *     possible object is
     *     {@link CarteBancaireDto }
     *     
     */
    public CarteBancaireDto getParamcarteBancairee() {
        return paramcarteBancairee;
    }

    /**
     * Sets the value of the paramcarteBancairee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarteBancaireDto }
     *     
     */
    public void setParamcarteBancairee(CarteBancaireDto value) {
        this.paramcarteBancairee = value;
    }

}
