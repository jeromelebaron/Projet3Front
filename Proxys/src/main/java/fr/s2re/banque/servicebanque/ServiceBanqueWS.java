
package fr.s2re.banque.servicebanque;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceBanqueWS", targetNamespace = "http://servicebanque.banque.s2re.fr", wsdlLocation = "http://192.168.100.165:8080/Banque-WebService-0.0.1-SNAPSHOT/ServiceBanqueWS/ServiceBanqueWebServiceImp?wsdl")
public class ServiceBanqueWS
    extends Service
{

    private final static URL SERVICEBANQUEWS_WSDL_LOCATION;
    private final static WebServiceException SERVICEBANQUEWS_EXCEPTION;
    private final static QName SERVICEBANQUEWS_QNAME = new QName("http://servicebanque.banque.s2re.fr", "ServiceBanqueWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.100.165:8080/Banque-WebService-0.0.1-SNAPSHOT/ServiceBanqueWS/ServiceBanqueWebServiceImp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEBANQUEWS_WSDL_LOCATION = url;
        SERVICEBANQUEWS_EXCEPTION = e;
    }

    public ServiceBanqueWS() {
        super(__getWsdlLocation(), SERVICEBANQUEWS_QNAME);
    }

    public ServiceBanqueWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEBANQUEWS_QNAME, features);
    }

    public ServiceBanqueWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICEBANQUEWS_QNAME);
    }

    public ServiceBanqueWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEBANQUEWS_QNAME, features);
    }

    public ServiceBanqueWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceBanqueWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IServiceBanqueWebService
     */
    @WebEndpoint(name = "ServiceBanqueWebServiceImpPort")
    public IServiceBanqueWebService getServiceBanqueWebServiceImpPort() {
        return super.getPort(new QName("http://servicebanque.banque.s2re.fr", "ServiceBanqueWebServiceImpPort"), IServiceBanqueWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServiceBanqueWebService
     */
    @WebEndpoint(name = "ServiceBanqueWebServiceImpPort")
    public IServiceBanqueWebService getServiceBanqueWebServiceImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicebanque.banque.s2re.fr", "ServiceBanqueWebServiceImpPort"), IServiceBanqueWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEBANQUEWS_EXCEPTION!= null) {
            throw SERVICEBANQUEWS_EXCEPTION;
        }
        return SERVICEBANQUEWS_WSDL_LOCATION;
    }

}
