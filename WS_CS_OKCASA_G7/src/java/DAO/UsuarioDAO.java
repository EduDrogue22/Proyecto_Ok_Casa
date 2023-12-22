/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Clases.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author Tiare
 */
public class UsuarioDAO {
    private Connection conexion;
    public UsuarioDAO(){
        
    }
    
    public boolean agregarUsuario(Usuario usuario) throws SQLException{
        boolean centinela = false;
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_AGREGAR_USUARIO(?,?,?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(1, usuario.getRut());
            cstmt.setString(2, usuario.getNombre());
            cstmt.setString(3, usuario.getNombre_usuario());
            cstmt.setString(4, usuario.getContrasenia_usuario());
            if(cstmt.executeUpdate()>0){
                centinela = true;
            }
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }finally{
            this.conexion.close();
        }
        return centinela;
    }
    
    
   
}
