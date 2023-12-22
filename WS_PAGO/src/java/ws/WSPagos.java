/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import Clases.Banco;
import Clases.Webpay;
import DAO.BancoDAO;
import DAO.WebpayDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tiare
 */
@WebService(serviceName = "WSPagos")
public class WSPagos {
    BancoDAO dao_b = new BancoDAO();
    WebpayDAO dao_w = new WebpayDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProcesarPago")
    public int ProcesarPago(@WebParam(name = "total_pagar") int total_pagar, @WebParam(name = "pago") int pago) {
        if(pago>=total_pagar){
            return pago-total_pagar;
        }
        else{
            return -1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListaBancos")
    public List<Banco> ListaBancos() {
        try {
            return dao_b.listarBancos();
        } catch (Exception e) {
        }
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InformacionWebpay")
    public Webpay InformacionWebpay(@WebParam(name = "rut") String rut) {
        try {
            return dao_w.informacionWebpay(rut);
        } catch (Exception e) {
        }
        //TODO write your implementation code here:
        return null;
    }

    @WebMethod(operationName = "ActualizarSaldo")
    public boolean ActualizarSaldo(@WebParam(name = "rut") String rut, @WebParam(name = "monto") int monto) {
        //TODO write your implementation code here:
        try {
            return dao_w.actualizarSaldo(rut, monto);
        } catch (Exception e) {
        }
        return false;
    }

}
