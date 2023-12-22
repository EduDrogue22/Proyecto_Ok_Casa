
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

    private final static QName _ActualizarSaldo_QNAME = new QName("http://ws/", "ActualizarSaldo");
    private final static QName _ActualizarSaldoResponse_QNAME = new QName("http://ws/", "ActualizarSaldoResponse");
    private final static QName _InformacionWebpay_QNAME = new QName("http://ws/", "InformacionWebpay");
    private final static QName _InformacionWebpayResponse_QNAME = new QName("http://ws/", "InformacionWebpayResponse");
    private final static QName _ListaBancos_QNAME = new QName("http://ws/", "ListaBancos");
    private final static QName _ListaBancosResponse_QNAME = new QName("http://ws/", "ListaBancosResponse");
    private final static QName _ProcesarPago_QNAME = new QName("http://ws/", "ProcesarPago");
    private final static QName _ProcesarPagoResponse_QNAME = new QName("http://ws/", "ProcesarPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarSaldo }
     * 
     */
    public ActualizarSaldo createActualizarSaldo() {
        return new ActualizarSaldo();
    }

    /**
     * Create an instance of {@link ActualizarSaldoResponse }
     * 
     */
    public ActualizarSaldoResponse createActualizarSaldoResponse() {
        return new ActualizarSaldoResponse();
    }

    /**
     * Create an instance of {@link InformacionWebpay }
     * 
     */
    public InformacionWebpay createInformacionWebpay() {
        return new InformacionWebpay();
    }

    /**
     * Create an instance of {@link InformacionWebpayResponse }
     * 
     */
    public InformacionWebpayResponse createInformacionWebpayResponse() {
        return new InformacionWebpayResponse();
    }

    /**
     * Create an instance of {@link ListaBancos }
     * 
     */
    public ListaBancos createListaBancos() {
        return new ListaBancos();
    }

    /**
     * Create an instance of {@link ListaBancosResponse }
     * 
     */
    public ListaBancosResponse createListaBancosResponse() {
        return new ListaBancosResponse();
    }

    /**
     * Create an instance of {@link ProcesarPago }
     * 
     */
    public ProcesarPago createProcesarPago() {
        return new ProcesarPago();
    }

    /**
     * Create an instance of {@link ProcesarPagoResponse }
     * 
     */
    public ProcesarPagoResponse createProcesarPagoResponse() {
        return new ProcesarPagoResponse();
    }

    /**
     * Create an instance of {@link Webpay }
     * 
     */
    public Webpay createWebpay() {
        return new Webpay();
    }

    /**
     * Create an instance of {@link Banco }
     * 
     */
    public Banco createBanco() {
        return new Banco();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ActualizarSaldo")
    public JAXBElement<ActualizarSaldo> createActualizarSaldo(ActualizarSaldo value) {
        return new JAXBElement<ActualizarSaldo>(_ActualizarSaldo_QNAME, ActualizarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ActualizarSaldoResponse")
    public JAXBElement<ActualizarSaldoResponse> createActualizarSaldoResponse(ActualizarSaldoResponse value) {
        return new JAXBElement<ActualizarSaldoResponse>(_ActualizarSaldoResponse_QNAME, ActualizarSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionWebpay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformacionWebpay }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "InformacionWebpay")
    public JAXBElement<InformacionWebpay> createInformacionWebpay(InformacionWebpay value) {
        return new JAXBElement<InformacionWebpay>(_InformacionWebpay_QNAME, InformacionWebpay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionWebpayResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformacionWebpayResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "InformacionWebpayResponse")
    public JAXBElement<InformacionWebpayResponse> createInformacionWebpayResponse(InformacionWebpayResponse value) {
        return new JAXBElement<InformacionWebpayResponse>(_InformacionWebpayResponse_QNAME, InformacionWebpayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaBancos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaBancos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ListaBancos")
    public JAXBElement<ListaBancos> createListaBancos(ListaBancos value) {
        return new JAXBElement<ListaBancos>(_ListaBancos_QNAME, ListaBancos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaBancosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaBancosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ListaBancosResponse")
    public JAXBElement<ListaBancosResponse> createListaBancosResponse(ListaBancosResponse value) {
        return new JAXBElement<ListaBancosResponse>(_ListaBancosResponse_QNAME, ListaBancosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ProcesarPago")
    public JAXBElement<ProcesarPago> createProcesarPago(ProcesarPago value) {
        return new JAXBElement<ProcesarPago>(_ProcesarPago_QNAME, ProcesarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcesarPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ProcesarPagoResponse")
    public JAXBElement<ProcesarPagoResponse> createProcesarPagoResponse(ProcesarPagoResponse value) {
        return new JAXBElement<ProcesarPagoResponse>(_ProcesarPagoResponse_QNAME, ProcesarPagoResponse.class, null, value);
    }

}
