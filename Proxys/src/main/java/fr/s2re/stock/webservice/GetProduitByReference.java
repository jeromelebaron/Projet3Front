
package fr.s2re.stock.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProduitByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProduitByReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProduitByReference", propOrder = {
    "paramReference"
})
public class GetProduitByReference {

    protected String paramReference;

    /**
     * Gets the value of the paramReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamReference() {
        return paramReference;
    }

    /**
     * Sets the value of the paramReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamReference(String value) {
        this.paramReference = value;
    }

}
