/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Inspeccion;
import java.sql.Connection;
import Clases.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author Tiare
 */
public class InspeccionDAO {
    private Connection conexion;
    public InspeccionDAO(){}
    
    public List<Inspeccion> listarInpecciones()throws SQLException{
        List<Inspeccion> lista = new ArrayList<>();
        int id_i = 0,p =0;
        String nom= "";
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_LISTAR_INSPECCION(?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Ejecutamos el procedimiento y llenamos el cursor
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while(rs.next()){
                Inspeccion i = new Inspeccion();
                id_i=rs.getInt("ID_INSPECCION");
                nom=rs.getString("NOMBRE_INSPECCION");
                p=rs.getInt("PRECIO");
                i= new Inspeccion(id_i, nom, p);
                lista.add(i);
            }

        } catch (Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally {
            this.conexion.close();
        }
        return lista;
    }
}
