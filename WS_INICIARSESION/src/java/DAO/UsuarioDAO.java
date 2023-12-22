/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tiare
 */
public class UsuarioDAO {
    private Connection con;

    public UsuarioDAO() {
    }

    //Método para iniciar sesión
    public int Login(String usuario, String pass) throws SQLException{
        int tipo = 0;
        try {
            this.con = new Conexion.Conexion().obtenerConexion();
            String query = "SELECT tipo_usuario FROM usuario WHERE " 
                    + "nombre_usuario = '"+usuario+"' "
                    + "AND contrasenia_usuario = '"+pass+"' ";
            CallableStatement cstmt = this.con.prepareCall(query);
            
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                tipo = rs.getInt("tipo_usuario");
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        } finally {
            this.con.close();
        }
        return tipo;
        
    }
    public String RutUsuario(String usuario, String pass) throws SQLException{
        String rut_aux = "Sin rut";
        try {
            this.con = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_GET_RUT_USUARIO(?,?,?) }";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
           cstmt.setString(2, usuario);
           cstmt.setString(3, pass);
           cstmt.execute();
           ResultSet rs = (ResultSet) cstmt.getObject(1);
           while(rs.next()){
               rut_aux=rs.getString("RUT");
           }
        } catch (Exception e) {
        }        
        return rut_aux;    
    }
    
}
