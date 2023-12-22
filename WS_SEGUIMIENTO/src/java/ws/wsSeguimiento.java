/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import Clases.Seguimiento;
import DAO.SeguimientoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tiare
 */
@WebService(serviceName = "wsSeguimiento")
public class wsSeguimiento {

    /**
     * This is a sample web service operation
     */
    SeguimientoDAO dao = new SeguimientoDAO();
    List<Seguimiento> s = new ArrayList();
            
   
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Listado")
    public List<Seguimiento> Listado(@WebParam(name = "rut") String rut) {
        //TODO write your implementation code here:
        try {
            return dao.listarSeguimiento(rut);
        } catch (SQLException e) {
            return s;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SeguimientosFinalizados")
    public List<Seguimiento> SeguimientosFinalizados(@WebParam(name = "rut") String rut) {
        //TODO write your implementation code here:
        try {
            return dao.seguimientosFinalizados(rut);
        } catch (Exception e) {
            return s;
        }
    }
}
