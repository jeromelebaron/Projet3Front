
package fr.s2re.livraison.servicelivraison;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jourSemaineDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jourSemaineDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jourOuvertures" type="{http://servicelivraison.livraison.s2re.fr}jourOuvertureDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jourSemaineDto", propOrder = {
    "id",
    "jourOuvertures",
    "libelle"
})
public class JourSemaineDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    protected Integer id;
    @XmlElement(nillable = true)
    protected List<JourOuvertureDto> jourOuvertures;
    protected String libelle;

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
     * Gets the value of the libelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets the value of the libelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

}
