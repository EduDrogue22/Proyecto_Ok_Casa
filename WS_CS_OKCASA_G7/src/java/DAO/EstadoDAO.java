/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ws.WsSeguimiento;
import ws.WsSeguimiento_Service;

/**
 *
 * @author Bastian Ahumada
 */
public class EstadoDAO {

    private Connection conexion;

    public EstadoDAO() {
    }

    public boolean cambiarEstado(int v_id, String v_estado_seguimiento) throws SQLException {
        boolean centinela = false;
        System.out.println("v_estado_seguimiento "+v_estado_seguimiento);
        if (v_estado_seguimiento.equals("P") || v_estado_seguimiento.equals("R") || v_estado_seguimiento.equals("F")) {
            System.out.println("centinae en if "+ centinela);
            try {
                this.conexion = new Conexion.Conexion().obtenerConexion();
                String llamada = "{ call SP_Cambiar_ESTADO(?,?) }";
                CallableStatement cstmt = this.conexion.prepareCall(llamada);
                cstmt.setInt(1, v_id);
                cstmt.setString(2, v_estado_seguimiento);
                if (cstmt.executeUpdate() > 0) {
                    centinela = true;
                    System.out.println("Contrasenia cambiada");
                }
            } catch (Exception e) {
                System.out.println("Contrasenia NO cambiada " + e.getMessage());
            } finally {
                this.conexion.close();
            }
        }
        return centinela;
    }
}
