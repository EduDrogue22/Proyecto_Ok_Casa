/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Clases.HistorialPagoAUX;
import Clases.Pago;
import DAO.ContraseniaDAO;
import DAO.PagoDAO;
import java.util.ArrayList;
import java.util.List;
import ws.WSPagos;
import ws.WSPagos_Service;
import ws.Webpay;
        
/**
 *
 * @author Tiare
 */
public class TestPago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String v_rut_a = "Nombre_7";
        String v_banco_a = "contra_7";
        ArrayList l = new ArrayList(); 
        ArrayList l_a = new ArrayList();
        String lista_h_p = "11,10000,12,20000";
        String[] arr_h_p = lista_h_p.split(",");
        System.out.println("len "+ arr_h_p.length);
        System.out.println("arr_hp "+Integer.parseInt(arr_h_p[0]));
        int[] arr1 = {1,10000};
        int[] arr2 = {2,20000};
        int[][] arr = {arr1,arr2};
        System.out.println("arr "+arr[0][1]+" "+arr[1][1]);
        
        
        // TODO code application logic here
        try {
            boolean i = new PagoDAO().agregarPago("Banco main", lista_h_p);
            System.out.println("Boolean main "+ i);
            //boolean i = new ContraseniaDAO().cambiarContrasenia(v_rut_a, v_banco_a);
           /*
            //int v_monto_a = new PagoDAO().descuento("11111-1", 500);
            boolean pago_i = new PagoDAO().agregarPago("11111-1", "BANCO TEST", "a");
            if(v_monto_a!=0){
                System.out.println("AQUI ESTAMOS"); 
                System.out.println("TOTAL A PAGAR ES DE "+v_monto_a);
            }
            if(new PagoDAO().agregarPago("22222-2","Banco de prueba",10)){
                System.out.println("AQUI ESTAMOS");
            }
            
            //List<HistorialPagoAUX> l= new PagoDAO().pagar_historial_rut("11111-1");
            //System.out.println(l);
            //WSPagos_Service servicio= new WSPagos_Service();
            //WSPagos cliente = servicio.getWSPagosPort();
            //System.out.println("PROCESO PAGO "+ cliente.procesarPago(9000, 10000));
            PagoDAO dao = new PagoDAO();
            Webpay w = dao.informacionWebpay("11111-");
            System.out.println("rut "+w.getRut()+" banco "+w.getNBanco()+" saldo "+w.getSaldo());
             */
        } catch (Exception e) {
            System.out.println("exception");
        }
            
            
    }
    
}
