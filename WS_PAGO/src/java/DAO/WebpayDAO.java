/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Webpay;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Tiare
 */
public class WebpayDAO {

    private Connection conexion;

    public WebpayDAO() {
    }

    public Webpay informacionWebpay(String v_rut) throws SQLException {
        Webpay wp = new Webpay();
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_BUSCAR_WEBPAY_RUT(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, v_rut);
            cstmt.execute(); //Ejecutamos el procedimiento y llenamos el cursor
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                int id_cliente = rs.getInt("id_cliente");
                String rut = rs.getString("rut");
                int saldo = rs.getInt("saldo");
                String n_banco = rs.getString("n_banco");
                wp = new Webpay(id_cliente, rut, saldo, n_banco);
            }
        } catch (Exception e) {
            System.out.println("Error al listar " + e.getMessage());
        } finally {
            this.conexion.close();
        }
        return wp;
    }
    
    public boolean actualizarSaldo(String v_rut, int monto_pago) throws SQLException {
        boolean centinela = false;
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_ACTUALIZAR_SALDO(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setInt(1, monto_pago);
            cstmt.setString(2, v_rut);
            if (cstmt.executeUpdate() > 0) {
                centinela = true;
                System.out.println("Pago agregado");
            }

        } catch (Exception e) {
            System.out.println("Error al pagar " + e.getMessage());
        } finally {
            this.conexion.close();
        }
        return centinela;

    }
}
