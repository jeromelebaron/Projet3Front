
package fr.s2re.banque.servicebanque;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.s2re.banque.servicebanque package. 
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

    private final static QName _VerifierSoldeResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "verifierSoldeResponse");
    private final static QName _GetCarteByClientResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCarteByClientResponse");
    private final static QName _CarteBancaireDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "carteBancaireDto");
    private final static QName _InsertCreditResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "insertCreditResponse");
    private final static QName _GetCLientByNomResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCLientByNomResponse");
    private final static QName _GetCLientByNom_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCLientByNom");
    private final static QName _CompteBancaireDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "compteBancaireDto");
    private final static QName _VerifierSolde_QNAME = new QName("http://servicebanque.banque.s2re.fr", "verifierSolde");
    private final static QName _OperationBancaireDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "operationBancaireDto");
    private final static QName _GetCarteByClient_QNAME = new QName("http://servicebanque.banque.s2re.fr", "getCarteByClient");
    private final static QName _InsertDebit_QNAME = new QName("http://servicebanque.banque.s2re.fr", "insertDebit");
    private final static QName _InsertCredit_QNAME = new QName("http://servicebanque.banque.s2re.fr", "insertCredit");
    private final static QName _InsertDebitResponse_QNAME = new QName("http://servicebanque.banque.s2re.fr", "insertDebitResponse");
    private final static QName _ClientDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "clientDto");
    private final static QName _BanqueDto_QNAME = new QName("http://servicebanque.banque.s2re.fr", "banqueDto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.s2re.banque.servicebanque
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertDebitResponse }
     * 
     */
    public InsertDebitResponse createInsertDebitResponse() {
        return new InsertDebitResponse();
    }

    /**
     * Create an instance of {@link InsertCredit }
     * 
     */
    public InsertCredit createInsertCredit() {
        return new InsertCredit();
    }

    /**
     * Create an instance of {@link InsertDebit }
     * 
     */
    public InsertDebit createInsertDebit() {
        return new InsertDebit();
    }

    /**
     * Create an instance of {@link BanqueDto }
     * 
     */
    public BanqueDto createBanqueDto() {
        return new BanqueDto();
    }

    /**
     * Create an instance of {@link ClientDto }
     * 
     */
    public ClientDto createClientDto() {
        return new ClientDto();
    }

    /**
     * Create an instance of {@link GetCLientByNomResponse }
     * 
     */
    public GetCLientByNomResponse createGetCLientByNomResponse() {
        return new GetCLientByNomResponse();
    }

    /**
     * Create an instance of {@link CarteBancaireDto }
     * 
     */
    public CarteBancaireDto createCarteBancaireDto() {
        return new CarteBancaireDto();
    }

    /**
     * Create an instance of {@link InsertCreditResponse }
     * 
     */
    public InsertCreditResponse createInsertCreditResponse() {
        return new InsertCreditResponse();
    }

    /**
     * Create an instance of {@link GetCarteByClientResponse }
     * 
     */
    public GetCarteByClientResponse createGetCarteByClientResponse() {
        return new GetCarteByClientResponse();
    }

    /**
     * Create an instance of {@link VerifierSoldeResponse }
     * 
     */
    public VerifierSoldeResponse createVerifierSoldeResponse() {
        return new VerifierSoldeResponse();
    }

    /**
     * Create an instance of {@link GetCarteByClient }
     * 
     */
    public GetCarteByClient createGetCarteByClient() {
        return new GetCarteByClient();
    }

    /**
     * Create an instance of {@link OperationBancaireDto }
     * 
     */
    public OperationBancaireDto createOperationBancaireDto() {
        return new OperationBancaireDto();
    }

    /**
     * Create an instance of {@link VerifierSolde }
     * 
     */
    public VerifierSolde createVerifierSolde() {
        return new VerifierSolde();
    }

    /**
     * Create an instance of {@link CompteBancaireDto }
     * 
     */
    public CompteBancaireDto createCompteBancaireDto() {
        return new CompteBancaireDto();
    }

    /**
     * Create an instance of {@link GetCLientByNom }
     * 
     */
    public GetCLientByNom createGetCLientByNom() {
        return new GetCLientByNom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifierSoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "verifierSoldeResponse")
    public JAXBElement<VerifierSoldeResponse> createVerifierSoldeResponse(VerifierSoldeResponse value) {
        return new JAXBElement<VerifierSoldeResponse>(_VerifierSoldeResponse_QNAME, VerifierSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarteByClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCarteByClientResponse")
    public JAXBElement<GetCarteByClientResponse> createGetCarteByClientResponse(GetCarteByClientResponse value) {
        return new JAXBElement<GetCarteByClientResponse>(_GetCarteByClientResponse_QNAME, GetCarteByClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarteBancaireDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "carteBancaireDto")
    public JAXBElement<CarteBancaireDto> createCarteBancaireDto(CarteBancaireDto value) {
        return new JAXBElement<CarteBancaireDto>(_CarteBancaireDto_QNAME, CarteBancaireDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCreditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "insertCreditResponse")
    public JAXBElement<InsertCreditResponse> createInsertCreditResponse(InsertCreditResponse value) {
        return new JAXBElement<InsertCreditResponse>(_InsertCreditResponse_QNAME, InsertCreditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCLientByNomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCLientByNomResponse")
    public JAXBElement<GetCLientByNomResponse> createGetCLientByNomResponse(GetCLientByNomResponse value) {
        return new JAXBElement<GetCLientByNomResponse>(_GetCLientByNomResponse_QNAME, GetCLientByNomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCLientByNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCLientByNom")
    public JAXBElement<GetCLientByNom> createGetCLientByNom(GetCLientByNom value) {
        return new JAXBElement<GetCLientByNom>(_GetCLientByNom_QNAME, GetCLientByNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteBancaireDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "compteBancaireDto")
    public JAXBElement<CompteBancaireDto> createCompteBancaireDto(CompteBancaireDto value) {
        return new JAXBElement<CompteBancaireDto>(_CompteBancaireDto_QNAME, CompteBancaireDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifierSolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "verifierSolde")
    public JAXBElement<VerifierSolde> createVerifierSolde(VerifierSolde value) {
        return new JAXBElement<VerifierSolde>(_VerifierSolde_QNAME, VerifierSolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationBancaireDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "operationBancaireDto")
    public JAXBElement<OperationBancaireDto> createOperationBancaireDto(OperationBancaireDto value) {
        return new JAXBElement<OperationBancaireDto>(_OperationBancaireDto_QNAME, OperationBancaireDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarteByClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "getCarteByClient")
    public JAXBElement<GetCarteByClient> createGetCarteByClient(GetCarteByClient value) {
        return new JAXBElement<GetCarteByClient>(_GetCarteByClient_QNAME, GetCarteByClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDebit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "insertDebit")
    public JAXBElement<InsertDebit> createInsertDebit(InsertDebit value) {
        return new JAXBElement<InsertDebit>(_InsertDebit_QNAME, InsertDebit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCredit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "insertCredit")
    public JAXBElement<InsertCredit> createInsertCredit(InsertCredit value) {
        return new JAXBElement<InsertCredit>(_InsertCredit_QNAME, InsertCredit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDebitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "insertDebitResponse")
    public JAXBElement<InsertDebitResponse> createInsertDebitResponse(InsertDebitResponse value) {
        return new JAXBElement<InsertDebitResponse>(_InsertDebitResponse_QNAME, InsertDebitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "clientDto")
    public JAXBElement<ClientDto> createClientDto(ClientDto value) {
        return new JAXBElement<ClientDto>(_ClientDto_QNAME, ClientDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BanqueDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicebanque.banque.s2re.fr", name = "banqueDto")
    public JAXBElement<BanqueDto> createBanqueDto(BanqueDto value) {
        return new JAXBElement<BanqueDto>(_BanqueDto_QNAME, BanqueDto.class, null, value);
    }

}
