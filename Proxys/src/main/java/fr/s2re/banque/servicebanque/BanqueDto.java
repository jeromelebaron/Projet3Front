
package fr.s2re.banque.servicebanque;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for banqueDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="banqueDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseBanque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clients" type="{http://servicebanque.banque.s2re.fr}clientDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idBanque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomBanque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "banqueDto", propOrder = {
    "adresseBanque",
    "clients",
    "idBanque",
    "nomBanque"
})
public class BanqueDto implements Serializable {

    protected String adresseBanque;
    @XmlElement(nillable = true)
    protected List<ClientDto> clients;
    protected int idBanque;
    protected String nomBanque;

    /**
     * Gets the value of the adresseBanque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseBanque() {
        return adresseBanque;
    }

    /**
     * Sets the value of the adresseBanque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseBanque(String value) {
        this.adresseBanque = value;
    }

    /**
     * Gets the value of the clients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientDto }
     * 
     * 
     */
    public List<ClientDto> getClients() {
        if (clients == null) {
            clients = new ArrayList<ClientDto>();
        }
        return this.clients;
    }

    /**
     * Gets the value of the idBanque property.
     * 
     */
    public int getIdBanque() {
        return idBanque;
    }

    /**
     * Sets the value of the idBanque property.
     * 
     */
    public void setIdBanque(int value) {
        this.idBanque = value;
    }

    /**
     * Gets the value of the nomBanque property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomBanque() {
        return nomBanque;
    }

    /**
     * Sets the value of the nomBanque property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomBanque(String value) {
        this.nomBanque = value;
    }

}
