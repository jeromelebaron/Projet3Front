
package fr.s2re.livraison.servicelivraison;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for horairesDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="horairesDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="debut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jourOuverture" type="{http://servicelivraison.livraison.s2re.fr}jourOuvertureDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horairesDto", propOrder = {
    "debut",
    "fin",
    "id",
    "jourOuverture"
})
public class HorairesDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar debut;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fin;
    protected Integer id;
    protected JourOuvertureDto jourOuverture;

    /**
     * Gets the value of the debut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebut() {
        return debut;
    }

    /**
     * Sets the value of the debut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebut(XMLGregorianCalendar value) {
        this.debut = value;
    }

    /**
     * Gets the value of the fin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFin() {
        return fin;
    }

    /**
     * Sets the value of the fin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFin(XMLGregorianCalendar value) {
        this.fin = value;
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
     * Gets the value of the jourOuverture property.
     * 
     * @return
     *     possible object is
     *     {@link JourOuvertureDto }
     *     
     */
    public JourOuvertureDto getJourOuverture() {
        return jourOuverture;
    }

    /**
     * Sets the value of the jourOuverture property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourOuvertureDto }
     *     
     */
    public void setJourOuverture(JourOuvertureDto value) {
        this.jourOuverture = value;
    }

}
