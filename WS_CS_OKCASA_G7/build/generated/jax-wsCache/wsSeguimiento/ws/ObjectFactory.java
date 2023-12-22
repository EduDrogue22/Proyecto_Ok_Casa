
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

    private final static QName _Listado_QNAME = new QName("http://ws/", "Listado");
    private final static QName _ListadoResponse_QNAME = new QName("http://ws/", "ListadoResponse");
    private final static QName _SeguimientosFinalizados_QNAME = new QName("http://ws/", "SeguimientosFinalizados");
    private final static QName _SeguimientosFinalizadosResponse_QNAME = new QName("http://ws/", "SeguimientosFinalizadosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Listado }
     * 
     */
    public Listado createListado() {
        return new Listado();
    }

    /**
     * Create an instance of {@link ListadoResponse }
     * 
     */
    public ListadoResponse createListadoResponse() {
        return new ListadoResponse();
    }

    /**
     * Create an instance of {@link SeguimientosFinalizados }
     * 
     */
    public SeguimientosFinalizados createSeguimientosFinalizados() {
        return new SeguimientosFinalizados();
    }

    /**
     * Create an instance of {@link SeguimientosFinalizadosResponse }
     * 
     */
    public SeguimientosFinalizadosResponse createSeguimientosFinalizadosResponse() {
        return new SeguimientosFinalizadosResponse();
    }

    /**
     * Create an instance of {@link Seguimiento }
     * 
     */
    public Seguimiento createSeguimiento() {
        return new Seguimiento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listado }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Listado")
    public JAXBElement<Listado> createListado(Listado value) {
        return new JAXBElement<Listado>(_Listado_QNAME, Listado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ListadoResponse")
    public JAXBElement<ListadoResponse> createListadoResponse(ListadoResponse value) {
        return new JAXBElement<ListadoResponse>(_ListadoResponse_QNAME, ListadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguimientosFinalizados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguimientosFinalizados }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "SeguimientosFinalizados")
    public JAXBElement<SeguimientosFinalizados> createSeguimientosFinalizados(SeguimientosFinalizados value) {
        return new JAXBElement<SeguimientosFinalizados>(_SeguimientosFinalizados_QNAME, SeguimientosFinalizados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeguimientosFinalizadosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeguimientosFinalizadosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "SeguimientosFinalizadosResponse")
    public JAXBElement<SeguimientosFinalizadosResponse> createSeguimientosFinalizadosResponse(SeguimientosFinalizadosResponse value) {
        return new JAXBElement<SeguimientosFinalizadosResponse>(_SeguimientosFinalizadosResponse_QNAME, SeguimientosFinalizadosResponse.class, null, value);
    }

}
