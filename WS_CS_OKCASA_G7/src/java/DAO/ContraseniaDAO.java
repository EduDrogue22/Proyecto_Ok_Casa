/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ws.WSLOGIN;
import ws.WSLOGIN_Service;

/**
 *
 * @author Tiare
 */
public class ContraseniaDAO {
    private Connection conexion;
    public ContraseniaDAO(){
    }
    public boolean cambiarContrasenia(String v_usuario, String v_contrasenia) throws SQLException{
        boolean centinela = false;
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_EDITAR_CONTRASENA(?,?) }";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(1, v_usuario);
            cstmt.setString(2, v_contrasenia);
            if(cstmt.executeUpdate()>0){
                centinela = true;
                System.out.println("Contrasenia cambiada");
            }
        } catch (Exception e) {
            System.out.println("Contrasenia NO cambiada "+e.getMessage());
        }finally{
            this.conexion.close();
        }
        return centinela;
    }
}
