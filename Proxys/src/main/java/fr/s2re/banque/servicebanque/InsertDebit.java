
package fr.s2re.banque.servicebanque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for insertDebit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertDebit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idOperation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateOperation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="typeOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comptebancaire" type="{http://servicebanque.banque.s2re.fr}compteBancaireDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertDebit", propOrder = {
    "idOperation",
    "dateOperation",
    "montant",
    "typeOperation",
    "comptebancaire"
})
public class InsertDebit {

    protected int idOperation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOperation;
    protected double montant;
    protected String typeOperation;
    protected CompteBancaireDto comptebancaire;

    /**
     * Gets the value of the idOperation property.
     * 
     */
    public int getIdOperation() {
        return idOperation;
    }

    /**
     * Sets the value of the idOperation property.
     * 
     */
    public void setIdOperation(int value) {
        this.idOperation = value;
    }

    /**
     * Gets the value of the dateOperation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOperation() {
        return dateOperation;
    }

    /**
     * Sets the value of the dateOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOperation(XMLGregorianCalendar value) {
        this.dateOperation = value;
    }

    /**
     * Gets the value of the montant property.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Sets the value of the montant property.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

    /**
     * Gets the value of the typeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOperation() {
        return typeOperation;
    }

    /**
     * Sets the value of the typeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOperation(String value) {
        this.typeOperation = value;
    }

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

}
