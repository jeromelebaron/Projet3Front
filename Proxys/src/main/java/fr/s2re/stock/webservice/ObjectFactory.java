
package fr.s2re.stock.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.s2re.stock.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProduitByReferenceResponse_QNAME = new QName("http://webservice.stock.s2re.fr", "getProduitByReferenceResponse");
    private final static QName _ProduitDto_QNAME = new QName("http://webservice.stock.s2re.fr", "produitDto");
    private final static QName _DecrementerStock_QNAME = new QName("http://webservice.stock.s2re.fr", "decrementerStock");
    private final static QName _GetProduitByReference_QNAME = new QName("http://webservice.stock.s2re.fr", "getProduitByReference");
    private final static QName _DecrementerStockResponse_QNAME = new QName("http://webservice.stock.s2re.fr", "decrementerStockResponse");
    private final static QName _UpdateProduit_QNAME = new QName("http://webservice.stock.s2re.fr", "updateProduit");
    private final static QName _UpdateProduitResponse_QNAME = new QName("http://webservice.stock.s2re.fr", "updateProduitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.s2re.stock.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DecrementerStockResponse }
     * 
     */
    public DecrementerStockResponse createDecrementerStockResponse() {
        return new DecrementerStockResponse();
    }

    /**
     * Create an instance of {@link UpdateProduit }
     * 
     */
    public UpdateProduit createUpdateProduit() {
        return new UpdateProduit();
    }

    /**
     * Create an instance of {@link UpdateProduitResponse }
     * 
     */
    public UpdateProduitResponse createUpdateProduitResponse() {
        return new UpdateProduitResponse();
    }

    /**
     * Create an instance of {@link GetProduitByReferenceResponse }
     * 
     */
    public GetProduitByReferenceResponse createGetProduitByReferenceResponse() {
        return new GetProduitByReferenceResponse();
    }

    /**
     * Create an instance of {@link ProduitDto }
     * 
     */
    public ProduitDto createProduitDto() {
        return new ProduitDto();
    }

    /**
     * Create an instance of {@link GetProduitByReference }
     * 
     */
    public GetProduitByReference createGetProduitByReference() {
        return new GetProduitByReference();
    }

    /**
     * Create an instance of {@link DecrementerStock }
     * 
     */
    public DecrementerStock createDecrementerStock() {
        return new DecrementerStock();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitByReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stock.s2re.fr", name = "getProduitByReferenceResponse")
    public JAXBElement<GetProduitByReferenceResponse> createGetProduitByReferenceResponse(GetProduitByReferenceResponse value) {
        return new JAXBElement<GetProduitByReferenceResponse>(_GetProduitByReferenceResponse_QNAME, GetProduitByReferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduitDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stock.s2re.fr", name = "produitDto")
    public JAXBElement<ProduitDto> createProduitDto(ProduitDto value) {
        return new JAXBElement<ProduitDto>(_ProduitDto_QNAME, ProduitDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecrementerStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stock.s2re.fr", name = "decrementerStock")
    public JAXBElement<DecrementerStock> createDecrementerStock(DecrementerStock value) {
        return new JAXBElement<DecrementerStock>(_DecrementerStock_QNAME, DecrementerStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduitByReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stock.s2re.fr", name = "getProduitByReference")
    public JAXBElement<GetProduitByReference> createGetProduitByReference(GetProduitByReference value) {
        return new JAXBElement<GetProduitByReference>(_GetProduitByReference_QNAME, GetProduitByReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecrementerStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stock.s2re.fr", name = "decrementerStockResponse")
    public JAXBElement<DecrementerStockResponse> createDecrementerStockResponse(DecrementerStockResponse value) {
        return new JAXBElement<DecrementerStockResponse>(_DecrementerStockResponse_QNAME, DecrementerStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stock.s2re.fr", name = "updateProduit")
    public JAXBElement<UpdateProduit> createUpdateProduit(UpdateProduit value) {
        return new JAXBElement<UpdateProduit>(_UpdateProduit_QNAME, UpdateProduit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.stock.s2re.fr", name = "updateProduitResponse")
    public JAXBElement<UpdateProduitResponse> createUpdateProduitResponse(UpdateProduitResponse value) {
        return new JAXBElement<UpdateProduitResponse>(_UpdateProduitResponse_QNAME, UpdateProduitResponse.class, null, value);
    }

}
