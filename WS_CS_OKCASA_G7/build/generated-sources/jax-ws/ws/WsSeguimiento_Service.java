
package ws;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsSeguimiento", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:32924/WS_SEGUIMIENTO/wsSeguimiento?WSDL")
public class WsSeguimiento_Service
    extends Service
{

    private final static URL WSSEGUIMIENTO_WSDL_LOCATION;
    private final static WebServiceException WSSEGUIMIENTO_EXCEPTION;
    private final static QName WSSEGUIMIENTO_QNAME = new QName("http://ws/", "wsSeguimiento");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:32924/WS_SEGUIMIENTO/wsSeguimiento?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSEGUIMIENTO_WSDL_LOCATION = url;
        WSSEGUIMIENTO_EXCEPTION = e;
    }

    public WsSeguimiento_Service() {
        super(__getWsdlLocation(), WSSEGUIMIENTO_QNAME);
    }

    public WsSeguimiento_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSEGUIMIENTO_QNAME, features);
    }

    public WsSeguimiento_Service(URL wsdlLocation) {
        super(wsdlLocation, WSSEGUIMIENTO_QNAME);
    }

    public WsSeguimiento_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSEGUIMIENTO_QNAME, features);
    }

    public WsSeguimiento_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsSeguimiento_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsSeguimiento
     */
    @WebEndpoint(name = "wsSeguimientoPort")
    public WsSeguimiento getWsSeguimientoPort() {
        return super.getPort(new QName("http://ws/", "wsSeguimientoPort"), WsSeguimiento.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsSeguimiento
     */
    @WebEndpoint(name = "wsSeguimientoPort")
    public WsSeguimiento getWsSeguimientoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "wsSeguimientoPort"), WsSeguimiento.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSEGUIMIENTO_EXCEPTION!= null) {
            throw WSSEGUIMIENTO_EXCEPTION;
        }
        return WSSEGUIMIENTO_WSDL_LOCATION;
    }

}
