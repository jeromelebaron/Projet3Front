
package fr.s2re.banque.servicebanque;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for carteBancaireDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carteBancaireDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comptebancaire" type="{http://servicebanque.banque.s2re.fr}compteBancaireDto" minOccurs="0"/>
 *         &lt;element name="cryptogramme" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateExpiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idCarte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroCarte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carteBancaireDto", propOrder = {
    "comptebancaire",
    "cryptogramme",
    "dateExpiration",
    "idCarte",
    "numeroCarte"
})
public class CarteBancaireDto implements Serializable {

    protected CompteBancaireDto comptebancaire;
    protected int cryptogramme;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateExpiration;
    protected int idCarte;
    protected String numeroCarte;

    /**
     * Gets the value of the comptebancaire property.
     * 
     * @return
     *     possible object is
     *     {@link CompteBancaireDto }
     *     
     */
    public CompteBancaireDto getComptebancaire() {
        return comptebancaire;
    }

    /**
     * Sets the value of the comptebancaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompteBancaireDto }
     *     
     */
    public void setComptebancaire(CompteBancaireDto value) {
        this.comptebancaire = value;
    }

    /**
     * Gets the value of the cryptogramme property.
     * 
     */
    public int getCryptogramme() {
        return cryptogramme;
    }

    /**
     * Sets the value of the cryptogramme property.
     * 
     */
    public void setCryptogramme(int value) {
        this.cryptogramme = value;
    }

    /**
     * Gets the value of the dateExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateExpiration() {
        return dateExpiration;
    }

    /**
     * Sets the value of the dateExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateExpiration(XMLGregorianCalendar value) {
        this.dateExpiration = value;
    }

    /**
     * Gets the value of the idCarte property.
     * 
     */
    public int getIdCarte() {
        return idCarte;
    }

    /**
     * Sets the value of the idCarte property.
     * 
     */
    public void setIdCarte(int value) {
        this.idCarte = value;
    }

    /**
     * Gets the value of the numeroCarte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarte() {
        return numeroCarte;
    }

    /**
     * Sets the value of the numeroCarte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarte(String value) {
        this.numeroCarte = value;
    }

	public CarteBancaireDto() {
		super();
	}

	public CarteBancaireDto(int cryptogramme, String numeroCarte) {
		super();
		this.cryptogramme = cryptogramme;
		this.numeroCarte = numeroCarte;
	}

}
