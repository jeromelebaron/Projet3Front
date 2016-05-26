
package fr.s2re.banque.servicebanque;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compteBancaireDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compteBancaireDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cartebancaires" type="{http://servicebanque.banque.s2re.fr}carteBancaireDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="client" type="{http://servicebanque.banque.s2re.fr}clientDto" minOccurs="0"/>
 *         &lt;element name="codeBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCompte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operationbancaires" type="{http://servicebanque.banque.s2re.fr}operationBancaireDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compteBancaireDto", propOrder = {
    "cartebancaires",
    "client",
    "codeBic",
    "codeIban",
    "idCompte",
    "operationbancaires",
    "solde"
})
public class CompteBancaireDto implements Serializable {

    @XmlElement(nillable = true)
    protected List<CarteBancaireDto> cartebancaires;
    protected ClientDto client;
    protected String codeBic;
    protected String codeIban;
    protected int idCompte;
    @XmlElement(nillable = true)
    protected List<OperationBancaireDto> operationbancaires;
    protected double solde;

    /**
     * Gets the value of the cartebancaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartebancaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartebancaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarteBancaireDto }
     * 
     * 
     */
    public List<CarteBancaireDto> getCartebancaires() {
        if (cartebancaires == null) {
            cartebancaires = new ArrayList<CarteBancaireDto>();
        }
        return this.cartebancaires;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDto }
     *     
     */
    public ClientDto getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDto }
     *     
     */
    public void setClient(ClientDto value) {
        this.client = value;
    }

    /**
     * Gets the value of the codeBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeBic() {
        return codeBic;
    }

    /**
     * Sets the value of the codeBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeBic(String value) {
        this.codeBic = value;
    }

    /**
     * Gets the value of the codeIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeIban() {
        return codeIban;
    }

    /**
     * Sets the value of the codeIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeIban(String value) {
        this.codeIban = value;
    }

    /**
     * Gets the value of the idCompte property.
     * 
     */
    public int getIdCompte() {
        return idCompte;
    }

    /**
     * Sets the value of the idCompte property.
     * 
     */
    public void setIdCompte(int value) {
        this.idCompte = value;
    }

    /**
     * Gets the value of the operationbancaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationbancaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationbancaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationBancaireDto }
     * 
     * 
     */
    public List<OperationBancaireDto> getOperationbancaires() {
        if (operationbancaires == null) {
            operationbancaires = new ArrayList<OperationBancaireDto>();
        }
        return this.operationbancaires;
    }

    /**
     * Gets the value of the solde property.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

}
