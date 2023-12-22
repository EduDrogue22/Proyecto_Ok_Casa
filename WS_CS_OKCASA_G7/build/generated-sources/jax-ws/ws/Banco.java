
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para banco complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="banco"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_banco" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="n_banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "banco", propOrder = {
    "idBanco",
    "nBanco"
})
public class Banco {

    @XmlElement(name = "id_banco")
    protected int idBanco;
    @XmlElement(name = "n_banco")
    protected String nBanco;

    /**
     * Obtiene el valor de la propiedad idBanco.
     * 
     */
    public int getIdBanco() {
        return idBanco;
    }

    /**
     * Define el valor de la propiedad idBanco.
     * 
     */
    public void setIdBanco(int value) {
        this.idBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad nBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBanco() {
        return nBanco;
    }

    /**
     * Define el valor de la propiedad nBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBanco(String value) {
        this.nBanco = value;
    }

}
