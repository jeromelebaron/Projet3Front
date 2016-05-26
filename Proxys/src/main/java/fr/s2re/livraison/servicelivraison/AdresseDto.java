
package fr.s2re.livraison.servicelivraison;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresseDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresseDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandes" type="{http://servicelivraison.livraison.s2re.fr}commandeDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lattitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nomRue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLivraisons" type="{http://servicelivraison.livraison.s2re.fr}serviceLivraisonDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ville" type="{http://servicelivraison.livraison.s2re.fr}villeDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresseDto", propOrder = {
    "commandes",
    "id",
    "lattitude",
    "longitude",
    "nomRue",
    "numero",
    "serviceLivraisons",
    "ville"
})
public class AdresseDto implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(nillable = true)
    protected List<CommandeDto> commandes;
    protected Integer id;
    protected Double lattitude;
    protected Double longitude;
    protected String nomRue;
    protected String numero;
    @XmlElement(nillable = true)
    protected List<ServiceLivraisonDto> serviceLivraisons;
    protected VilleDto ville;

    /**
     * Gets the value of the commandes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commandes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommandes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommandeDto }
     * 
     * 
     */
    public List<CommandeDto> getCommandes() {
        if (commandes == null) {
            commandes = new ArrayList<CommandeDto>();
        }
        return this.commandes;
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
     * Gets the value of the lattitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLattitude() {
        return lattitude;
    }

    /**
     * Sets the value of the lattitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLattitude(Double value) {
        this.lattitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the nomRue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomRue() {
        return nomRue;
    }

    /**
     * Sets the value of the nomRue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomRue(String value) {
        this.nomRue = value;
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
     * Gets the value of the serviceLivraisons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLivraisons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLivraisons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLivraisonDto }
     * 
     * 
     */
    public List<ServiceLivraisonDto> getServiceLivraisons() {
        if (serviceLivraisons == null) {
            serviceLivraisons = new ArrayList<ServiceLivraisonDto>();
        }
        return this.serviceLivraisons;
    }

    /**
     * Gets the value of the ville property.
     * 
     * @return
     *     possible object is
     *     {@link VilleDto }
     *     
     */
    public VilleDto getVille() {
        return ville;
    }

    /**
     * Sets the value of the ville property.
     * 
     * @param value
     *     allowed object is
     *     {@link VilleDto }
     *     
     */
    public void setVille(VilleDto value) {
        this.ville = value;
    }

}
