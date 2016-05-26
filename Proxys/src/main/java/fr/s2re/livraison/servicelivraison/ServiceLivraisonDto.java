
package fr.s2re.livraison.servicelivraison;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceLivraisonDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceLivraisonDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseLocalisation" type="{http://servicelivraison.livraison.s2re.fr}adresseDto" minOccurs="0"/>
 *         &lt;element name="commandes" type="{http://servicelivraison.livraison.s2re.fr}commandeDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jourOuvertures" type="{http://servicelivraison.livraison.s2re.fr}jourOuvertureDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeLivraison" type="{http://servicelivraison.livraison.s2re.fr}typeLivraisonDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceLivraisonDto", propOrder = {
    "adresseLocalisation",
    "commandes",
    "id",
    "jourOuvertures",
    "nom",
    "typeLivraison"
})
@XmlRootElement
public class ServiceLivraisonDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    protected AdresseDto adresseLocalisation;
    @XmlElement(nillable = true)
    protected List<CommandeDto> commandes;
    protected Integer id;
    @XmlElement(nillable = true)
    protected List<JourOuvertureDto> jourOuvertures;
    protected String nom;
    protected TypeLivraisonDto typeLivraison;

    /**
     * Gets the value of the adresseLocalisation property.
     * 
     * @return
     *     possible object is
     *     {@link AdresseDto }
     *     
     */
    public AdresseDto getAdresseLocalisation() {
        return adresseLocalisation;
    }

    /**
     * Sets the value of the adresseLocalisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseDto }
     *     
     */
    public void setAdresseLocalisation(AdresseDto value) {
        this.adresseLocalisation = value;
    }

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
     * Gets the value of the jourOuvertures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jourOuvertures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourOuvertures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourOuvertureDto }
     * 
     * 
     */
    public List<JourOuvertureDto> getJourOuvertures() {
        if (jourOuvertures == null) {
            jourOuvertures = new ArrayList<JourOuvertureDto>();
        }
        return this.jourOuvertures;
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

    /**
     * Gets the value of the typeLivraison property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLivraisonDto }
     *     
     */
    public TypeLivraisonDto getTypeLivraison() {
        return typeLivraison;
    }

    /**
     * Sets the value of the typeLivraison property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLivraisonDto }
     *     
     */
    public void setTypeLivraison(TypeLivraisonDto value) {
        this.typeLivraison = value;
    }

}
