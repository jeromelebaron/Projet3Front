
package fr.s2re.banque.servicebanque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCLientByNom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCLientByNom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCLientByNom", propOrder = {
    "paramNom"
})
public class GetCLientByNom {

    protected String paramNom;

    /**
     * Gets the value of the paramNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamNom() {
        return paramNom;
    }

    /**
     * Sets the value of the paramNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamNom(String value) {
        this.paramNom = value;
    }

}
