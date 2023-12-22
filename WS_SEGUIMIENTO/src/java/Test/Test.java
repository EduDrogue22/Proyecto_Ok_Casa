/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Clases.Seguimiento;
import DAO.SeguimientoDAO;
import java.util.List;

/**
 *
 * @author david
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            List<Seguimiento> l=  new SeguimientoDAO().seguimientosFinalizados("11111-1");
            System.out.println(l);
        } catch (Exception e) {
        }
        // TODO code application logic here
        //List<Seguimiento> l=  (List<Seguimiento>) new SeguimientoDAO().listarSeguimiento("11111-1");
        //System.out.println(l);
    }
    
}
