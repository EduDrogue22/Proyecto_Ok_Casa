
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcesarPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcesarPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="total_pagar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pago" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcesarPago", propOrder = {
    "totalPagar",
    "pago"
})
public class ProcesarPago {

    @XmlElement(name = "total_pagar")
    protected int totalPagar;
    protected int pago;

    /**
     * Obtiene el valor de la propiedad totalPagar.
     * 
     */
    public int getTotalPagar() {
        return totalPagar;
    }

    /**
     * Define el valor de la propiedad totalPagar.
     * 
     */
    public void setTotalPagar(int value) {
        this.totalPagar = value;
    }

    /**
     * Obtiene el valor de la propiedad pago.
     * 
     */
    public int getPago() {
        return pago;
    }

    /**
     * Define el valor de la propiedad pago.
     * 
     */
    public void setPago(int value) {
        this.pago = value;
    }

}
