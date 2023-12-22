/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Clases.Pago;
import Clases.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;
import Clases.Equipo;
import Clases.HistorialInspeccion;
import Clases.Seguimiento;
import ws.WSPagos;
import ws.WSPagos_Service;
import DAO.SeguimientoDAO;
import org.apache.taglibs.standard.tag.common.core.ForEachSupport;
import java.util.Date;
/**
 *
 * @author Tiare
 */
public class HistorialInspeccionDAO {
    private Connection conexion;
    public HistorialInspeccionDAO(){
        
    }
    public List<String> equiposDisponibles() throws SQLException{
    List lista = new ArrayList<>();
    String aux ="";
    try{
        this.conexion = new Conexion.Conexion().obtenerConexion();
        String llamada =  "{ call  SP_BUSCAR_EQUIPO_DISPONIBLE(?)}";
        CallableStatement cstmt = this.conexion.prepareCall(llamada);
        cstmt.registerOutParameter(1, OracleTypes.CURSOR);
        cstmt.execute();
        ResultSet rs = (ResultSet) cstmt.getObject(1);
        while(rs.next()){
            aux= rs.getString("DESCRIPCION");
            lista.add(aux);            
            System.out.println("equi "+aux);
        }
    }catch (Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally {
            this.conexion.close();
        }
        System.out.println("LISTA "+lista);
        return lista;
    }
    public List<String> tipoInspecciones() throws SQLException{
        List lista = new ArrayList<>();
        String aux ="";
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada =  "{ call  SP_LISTAR_INSPECCION(?)}";
            
        } catch (Exception e) {
        }
        return lista;
    }
    
    public boolean agregarHistorialInspeccion(String rut,String descripcion, String fecha, String nombre_equipo, String id_inspeccion_s)throws SQLException{
        boolean centinela = false;
        int id_inspeccion = Integer.parseInt(id_inspeccion_s);
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_AGREGAR_HISTORIAL(?,?,?,?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(1,descripcion);
            cstmt.setString(2,fecha);
            cstmt.setString(3,rut);
            cstmt.setString(4, nombre_equipo);
            cstmt.setInt(5, id_inspeccion);
            if(cstmt.executeUpdate()>0){
                centinela = true;
            }
        } catch (Exception e) {
            System.out.println("Error al agegar historial dao "+e.getMessage());
        }finally{
            this.conexion.close();}
        return centinela;
    }
    
    public List<HistorialInspeccion> listarHistorialFinalizado(String v_rut){
        List<HistorialInspeccion> lista = new ArrayList<>();
        List<Seguimiento> l_s = new ArrayList<>();
        SeguimientoDAO dao_s = new SeguimientoDAO();
        l_s=dao_s.seguimientoFinalizado(v_rut);
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_BUSCAR_IDHISTORIAL(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, v_rut);
            cstmt.execute(); //Ejecutamos el procedimiento y llenamos el cursor
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()){
                HistorialInspeccion h = new HistorialInspeccion();
                int id_h = rs.getInt("id_historial");
                String des = rs.getString("descripcion");
                String fe = rs.getString("fecha_inspeccion");
                int id_u = rs.getInt("id_usuario");
                int id_e = rs.getInt("id_equipo");
                int id_i = rs.getInt("id_inspeccion");
                h = new HistorialInspeccion(id_h,des,fe,id_u,id_e,id_i);
                for(Seguimiento si : l_s){
                    if(h.getId_historial()==si.getId_historial()){
                        lista.add(h);
                    }
                }
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
