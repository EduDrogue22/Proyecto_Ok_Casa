
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para seguimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="seguimiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estado_seguimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_historial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_seguimiento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seguimiento", propOrder = {
    "estadoSeguimiento",
    "idHistorial",
    "idSeguimiento"
})
public class Seguimiento {

    @XmlElement(name = "estado_seguimiento")
    protected String estadoSeguimiento;
    @XmlElement(name = "id_historial")
    protected int idHistorial;
    @XmlElement(name = "id_seguimiento")
    protected int idSeguimiento;

    /**
     * Obtiene el valor de la propiedad estadoSeguimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoSeguimiento() {
        return estadoSeguimiento;
    }

    /**
     * Define el valor de la propiedad estadoSeguimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoSeguimiento(String value) {
        this.estadoSeguimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idHistorial.
     * 
     */
    public int getIdHistorial() {
        return idHistorial;
    }

    /**
     * Define el valor de la propiedad idHistorial.
     * 
     */
    public void setIdHistorial(int value) {
        this.idHistorial = value;
    }

    /**
     * Obtiene el valor de la propiedad idSeguimiento.
     * 
     */
    public int getIdSeguimiento() {
        return idSeguimiento;
    }

    /**
     * Define el valor de la propiedad idSeguimiento.
     * 
     */
    public void setIdSeguimiento(int value) {
        this.idSeguimiento = value;
    }

}
