
package fr.s2re.livraison.servicelivraison;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for villeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="villeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresses" type="{http://servicelivraison.livraison.s2re.fr}adresseDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departement" type="{http://servicelivraison.livraison.s2re.fr}departementDto" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "villeDto", propOrder = {
    "adresses",
    "codePostal",
    "departement",
    "id",
    "nom"
})
public class VilleDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(nillable = true)
    protected List<AdresseDto> adresses;
    protected String codePostal;
    protected DepartementDto departement;
    protected Integer id;
    protected String nom;

    /**
     * Gets the value of the adresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresseDto }
     * 
     * 
     */
    public List<AdresseDto> getAdresses() {
        if (adresses == null) {
            adresses = new ArrayList<AdresseDto>();
        }
        return this.adresses;
    }

    /**
     * Gets the value of the codePostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Sets the value of the codePostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePostal(String value) {
        this.codePostal = value;
    }

    /**
     * Gets the value of the departement property.
     * 
     * @return
     *     possible object is
     *     {@link DepartementDto }
     *     
     */
    public DepartementDto getDepartement() {
        return departement;
    }

    /**
     * Sets the value of the departement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartementDto }
     *     
     */
    public void setDepartement(DepartementDto value) {
        this.departement = value;
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
     * Gets the value of the nom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

}
