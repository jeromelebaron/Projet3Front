
package fr.s2re.livraison.servicelivraison;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for commandeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commandeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseLivraison" type="{http://servicelivraison.livraison.s2re.fr}adresseDto" minOccurs="0"/>
 *         &lt;element name="dateLivraison" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datePriseEnCharge" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="delaiRecuperationCommande" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLivraison" type="{http://servicelivraison.livraison.s2re.fr}serviceLivraisonDto" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commandeDto", propOrder = {
    "adresseLivraison",
    "dateLivraison",
    "datePriseEnCharge",
    "delaiRecuperationCommande",
    "id",
    "numero",
    "serviceLivraison",
    "volume"
})
public class CommandeDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    protected AdresseDto adresseLivraison;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLivraison;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePriseEnCharge;
    protected Integer delaiRecuperationCommande;
    protected Integer id;
    protected String numero;
    protected ServiceLivraisonDto serviceLivraison;
    protected Double volume;

    /**
     * Gets the value of the adresseLivraison property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseDto }
     *     
     */
    public AdresseDto getAdresseLivraison() {
        return adresseLivraison;
    }

    /**
     * Sets the value of the adresseLivraison property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseDto }
     *     
     */
    public void setAdresseLivraison(AdresseDto value) {
        this.adresseLivraison = value;
    }

    /**
     * Gets the value of the dateLivraison property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLivraison() {
        return dateLivraison;
    }

    /**
     * Sets the value of the dateLivraison property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLivraison(XMLGregorianCalendar value) {
        this.dateLivraison = value;
    }

    /**
     * Gets the value of the datePriseEnCharge property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePriseEnCharge() {
        return datePriseEnCharge;
    }

    /**
     * Sets the value of the datePriseEnCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePriseEnCharge(XMLGregorianCalendar value) {
        this.datePriseEnCharge = value;
    }

    /**
     * Gets the value of the delaiRecuperationCommande property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelaiRecuperationCommande() {
        return delaiRecuperationCommande;
    }

    /**
     * Sets the value of the delaiRecuperationCommande property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelaiRecuperationCommande(Integer value) {
        this.delaiRecuperationCommande = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the serviceLivraison property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLivraisonDto }
     *     
     */
    public ServiceLivraisonDto getServiceLivraison() {
        return serviceLivraison;
    }

    /**
     * Sets the value of the serviceLivraison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLivraisonDto }
     *     
     */
    public void setServiceLivraison(ServiceLivraisonDto value) {
        this.serviceLivraison = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVolume(Double value) {
        this.volume = value;
    }

}
