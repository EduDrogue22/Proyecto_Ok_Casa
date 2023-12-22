
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Login_QNAME = new QName("http://ws/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "LoginResponse");
    private final static QName _RutUsuario_QNAME = new QName("http://ws/", "RutUsuario");
    private final static QName _RutUsuarioResponse_QNAME = new QName("http://ws/", "RutUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link RutUsuario }
     * 
     */
    public RutUsuario createRutUsuario() {
        return new RutUsuario();
    }

    /**
     * Create an instance of {@link RutUsuarioResponse }
     * 
     */
    public RutUsuarioResponse createRutUsuarioResponse() {
        return new RutUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RutUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RutUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "RutUsuario")
    public JAXBElement<RutUsuario> createRutUsuario(RutUsuario value) {
        return new JAXBElement<RutUsuario>(_RutUsuario_QNAME, RutUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RutUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RutUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "RutUsuarioResponse")
    public JAXBElement<RutUsuarioResponse> createRutUsuarioResponse(RutUsuarioResponse value) {
        return new JAXBElement<RutUsuarioResponse>(_RutUsuarioResponse_QNAME, RutUsuarioResponse.class, null, value);
    }

}
