/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import DAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Bastian Ahumada
 */
@WebService(serviceName = "WSLOGIN")
public class WSLOGIN {
    UsuarioDAO dao = new UsuarioDAO();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Login")
    public int Login(@WebParam(name = "usuario") String usuario,
            @WebParam(name = "pass") String pass) {
        try {
            return dao.Login(usuario, pass);
        } catch (SQLException ex) {
            Logger.getLogger(WSLOGIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RutUsuario")
    public String RutUsuario(@WebParam(name = "usuario") String usuario, @WebParam(name = "pass") String pass) {
        try {
            return dao.RutUsuario(usuario, pass);
        } catch (Exception e) {
        }
        return null;
    }


}
