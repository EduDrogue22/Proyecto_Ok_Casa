/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Clases.Cliente;
import DAO.ClienteDAO;
/**
 *
 * @author Tiare
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    /**
     * Web service operaciones BANCO ESTADO
     */
    ClienteDAO dao = new ClienteDAO();
    @WebMethod(operationName = "Listar")
    public List<Cliente> Listado() {
    try {
        return dao.listarClientes();
    } catch (SQLException ex) {
        //Logger.getLogger(WSListado.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
    
    
}
