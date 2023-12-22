/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Seguimiento;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import oracle.net.aso.l;
import ws.WsSeguimiento_Service;
import ws.WsSeguimiento;

/**
 *
 * @author Tiare
 */
public class SeguimientoDAO {
    private Connection conexion;
    public SeguimientoDAO(){
    }
    
    public List<Seguimiento> listarSeguimiento(String v_rut){
        List<Seguimiento> l = new ArrayList<>();
        WsSeguimiento_Service servicio = new WsSeguimiento_Service();
        WsSeguimiento s = servicio.getWsSeguimientoPort();
        List<ws.Seguimiento> listado = s.listado(v_rut);
        Seguimiento se = new Seguimiento();
        for(ws.Seguimiento w_s : listado ){
            se= new Seguimiento(w_s.getIdSeguimiento(), w_s.getEstadoSeguimiento(), w_s.getIdHistorial());
            l.add(se);            
        }
        return l;
    }
    
     public List<Seguimiento> seguimientoFinalizado(String v_rut){
        List<Seguimiento> l = new ArrayList<>();
        WsSeguimiento_Service servicio = new WsSeguimiento_Service();
        WsSeguimiento s = servicio.getWsSeguimientoPort();
        List<ws.Seguimiento> listado = s.seguimientosFinalizados(v_rut);
        Seguimiento se = new Seguimiento();
        for(ws.Seguimiento w_s : listado ){
            se= new Seguimiento(w_s.getIdSeguimiento(), w_s.getEstadoSeguimiento(), w_s.getIdHistorial());
            
            l.add(se);            
        }
        return l;
    }
            
            
}
