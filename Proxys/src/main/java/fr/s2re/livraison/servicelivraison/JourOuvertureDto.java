
package fr.s2re.livraison.servicelivraison;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jourOuvertureDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jourOuvertureDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="horaires" type="{http://servicelivraison.livraison.s2re.fr}horairesDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jourSemaine" type="{http://servicelivraison.livraison.s2re.fr}jourSemaineDto" minOccurs="0"/>
 *         &lt;element name="serviceLivraison" type="{http://servicelivraison.livraison.s2re.fr}serviceLivraisonDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jourOuvertureDto", propOrder = {
    "horaires",
    "id",
    "jourSemaine",
    "serviceLivraison"
})
public class JourOuvertureDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(nillable = true)
    protected List<HorairesDto> horaires;
    protected Integer id;
    protected JourSemaineDto jourSemaine;
    protected ServiceLivraisonDto serviceLivraison;

    /**
     * Gets the value of the horaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoraires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorairesDto }
     * 
     * 
     */
    public List<HorairesDto> getHoraires() {
        if (horaires == null) {
            horaires = new ArrayList<HorairesDto>();
        }
        return this.horaires;
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
     * Gets the value of the jourSemaine property.
     * 
     * @return
     *     possible object is
     *     {@link JourSemaineDto }
     *     
     */
    public JourSemaineDto getJourSemaine() {
        return jourSemaine;
    }

    /**
     * Sets the value of the jourSemaine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourSemaineDto }
     *     
     */
    public void setJourSemaine(JourSemaineDto value) {
        this.jourSemaine = value;
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

}
