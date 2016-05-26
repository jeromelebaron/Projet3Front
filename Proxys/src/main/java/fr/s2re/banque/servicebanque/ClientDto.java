
package fr.s2re.banque.servicebanque;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banque" type="{http://servicebanque.banque.s2re.fr}banqueDto" minOccurs="0"/>
 *         &lt;element name="comptebancaires" type="{http://servicebanque.banque.s2re.fr}compteBancaireDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientDto", propOrder = {
    "adresseClient",
    "banque",
    "comptebancaires",
    "idClient",
    "nomClient",
    "prenomClient"
})
public class ClientDto implements Serializable {

    protected String adresseClient;
    protected BanqueDto banque;
    @XmlElement(nillable = true)
    protected List<CompteBancaireDto> comptebancaires;
    protected int idClient;
    protected String nomClient;
    protected String prenomClient;

    /**
     * Gets the value of the adresseClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseClient() {
        return adresseClient;
    }

    /**
     * Sets the value of the adresseClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseClient(String value) {
        this.adresseClient = value;
    }

    /**
     * Gets the value of the banque property.
     * 
     * @return
     *     possible object is
     *     {@link BanqueDto }
     *     
     */
    public BanqueDto getBanque() {
        return banque;
    }

    /**
     * Sets the value of the banque property.
     * 
     * @param value
     *     allowed object is
     *     {@link BanqueDto }
     *     
     */
    public void setBanque(BanqueDto value) {
        this.banque = value;
    }

    /**
     * Gets the value of the comptebancaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comptebancaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComptebancaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompteBancaireDto }
     * 
     * 
     */
    public List<CompteBancaireDto> getComptebancaires() {
        if (comptebancaires == null) {
            comptebancaires = new ArrayList<CompteBancaireDto>();
        }
        return this.comptebancaires;
    }

    /**
     * Gets the value of the idClient property.
     * 
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * Sets the value of the idClient property.
     * 
     */
    public void setIdClient(int value) {
        this.idClient = value;
    }

    /**
     * Gets the value of the nomClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     * Sets the value of the nomClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClient(String value) {
        this.nomClient = value;
    }

    /**
     * Gets the value of the prenomClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomClient() {
        return prenomClient;
    }

    /**
     * Sets the value of the prenomClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomClient(String value) {
        this.prenomClient = value;
    }

}
