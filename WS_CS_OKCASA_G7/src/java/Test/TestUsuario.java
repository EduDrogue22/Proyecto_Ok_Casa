/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Clases.HistorialInspeccion;
import Clases.Usuario;
import DAO.ContraseniaDAO;
import DAO.EstadoDAO;
import DAO.HistorialInspeccionDAO;
import DAO.PagoDAO;
import DAO.UsuarioDAO;
import java.util.List;
import ws.WSLOGIN;
import ws.WSLOGIN_Service;
import ws.WsSeguimiento_Service;
import ws.WsSeguimiento;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Tiare
 */
public class TestUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //WsSeguimiento_Service servicio = new WsSeguimiento_Service();
        //WsSeguimiento s = servicio.getWsSeguimientoPort();
        //System.out.println("Listad de seguimiento " + s.listado("11111-1"));
        //WSLOGIN_Service servicio = new WSLOGIN_Service();
        //WSLOGIN cliente = servicio.getWSLOGINPort();
        //System.out.println("cliente :"+cliente.contraseniaUsuario("Nombre_3", "contra_3"));
        PagoDAO dao = new PagoDAO();
        try {
            System.out.println("banco "+ dao.listaBancos());
        } catch (Exception e) {
            System.out.println("exception");
        }
        /*try {
            Usuario newus = new Usuario(0,"99999-9","nombre_9","usuario_9","contra_9",0);
            if(new UsuarioDAO().agregarUsuario(newus)){
                System.out.println("Usuario Modificado");
            } else {
                System.out.println("Usuario No modificado");
            }
        
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());

        }
        // TODO code application logic here
        try {
            List<HistorialInspeccion> l = new HistorialInspeccionDAO().listarHistorialFinalizado("11111-1");
            System.out.println("Listado Test Finalizado\n"+l);
        } catch (Exception e) {
        }*/
        
    }
    
}

/*WSOperaciones_Servicep servicio 
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        System.out.println("CLIENTES : "+cliente.listar());
        List<Cliente> listado = cliente.listar();
        for(Cliente c : listado){
            System.out.println(c.getIdCliente()+" "+c.getRut()+" "+c.getNombre()+" "+c.getCredito());*/