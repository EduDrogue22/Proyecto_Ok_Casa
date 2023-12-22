/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.HistorialPagoAUX;
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
import ws.Banco;
import ws.Cliente;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;
import ws.WSPagos;
import ws.WSPagos_Service;
import Clases.Bancos;
import ws.Webpay;

/**
 * /**
 *
 * @author Tiare
 */
public class PagoDAO {

    private Connection conexion;

    public PagoDAO() {

    }

    public boolean agregarPago(String v_banco, String hist_prec) throws SQLException {
        boolean centinela = false;
        String[] arr_h_p = hist_prec.split(",");
        int len = arr_h_p.length;
        for (int i = 0; i < len; i = i + 2) {
            int id_h = Integer.parseInt(arr_h_p[i]);
            int p = Integer.parseInt(arr_h_p[i+1]);
            System.out.println("id_h : "+id_h);
            System.out.println("p : "+p);
            try {
                this.conexion = new Conexion.Conexion().obtenerConexion();
                String llamada = "{ call SP_AGREGAR_PAGO(?,?,?) }";
                CallableStatement cstmt = this.conexion.prepareCall(llamada);
                cstmt.setString(1, v_banco);
                cstmt.setInt(2, p);
                cstmt.setInt(3, id_h);
                if (cstmt.executeUpdate() > 0) {
                    centinela = true;
                    System.out.println("Pago agregado");
                }
            } catch (Exception e) {
                System.out.println("Error al pagar " + e.getMessage());
            } finally {
                this.conexion.close();
            }
        }
        return centinela;
    }

    public int descuento(String v_rut, int v_monto) throws SQLException {
        boolean centinela = false;
        int aux = 0;
        int total_pagar = 0;
        int porcentaje_descuento = 50;
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        List<Cliente> listado = cliente.listar();
        for (Cliente c : listado) {
            if (c.getRut().equals(v_rut) && c.getCredito() == 1) {
                total_pagar = v_monto - (v_monto * porcentaje_descuento / 100);
                return total_pagar;
            } else {
                total_pagar = v_monto;
            }
        }
        return total_pagar;
    }

    public boolean cliente_con_credito(String v_rut) throws SQLException {
        boolean centinela = false;
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        List<Cliente> listado = cliente.listar();
        for (Cliente c : listado) {
            if (c.getRut().equals(v_rut) && c.getCredito() == 1) {
                centinela = true;
                return centinela;
            } else {
                return centinela;
            }
        }
        return centinela;
    }

    public List<HistorialPagoAUX> buscar_historial_rut(String v_rut) throws SQLException {
        List<HistorialPagoAUX> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_BUSCAR_HISTORIAL_RUT(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, v_rut);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                HistorialPagoAUX h = new HistorialPagoAUX();
                h = new HistorialPagoAUX(rs.getString("RUT"), rs.getInt("ID_HISTORIAL"), rs.getString("DESCRIPCION"), rs.getInt("PRECIO"), 0);

                lista.add(h);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public List<HistorialPagoAUX> pagar_historial_rut(String v_rut) throws SQLException {
        List<HistorialPagoAUX> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_LISTAR_HISTORIAL_RUT_PAGO(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, v_rut);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                HistorialPagoAUX h = new HistorialPagoAUX();
                int desc = descuento(v_rut, rs.getInt("PRECIO"));
                h = new HistorialPagoAUX(rs.getString("RUT"), rs.getInt("ID_HISTORIAL"), rs.getString("DESCRIPCION"), desc, rs.getInt("PRECIO"));

                lista.add(h);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    public int procesarPago(int monto, int monto_pagar) {
        WSPagos_Service servicio = new WSPagos_Service();
        WSPagos cliente = servicio.getWSPagosPort();
        return cliente.procesarPago(monto, monto_pagar);
    }

    public List<Bancos> listaBancos() throws SQLException {
        List<Bancos> l = new ArrayList<>();
        WSPagos banco = new WSPagos_Service().getWSPagosPort();
        List<ws.Banco> listado = banco.listaBancos();
        Bancos b = new Bancos();
        for (ws.Banco w_b : listado) {
            int id = w_b.getIdBanco();
            String n = w_b.getNBanco();
            b = new Bancos(id, n);
            l.add(b);
        }
        return l;
    }

    public Webpay informacionWebpay(String v_rut) throws SQLException {
        WSPagos web = new WSPagos_Service().getWSPagosPort();
        Webpay w = web.informacionWebpay(v_rut);
        return w;
    }
    
    public boolean atualizarSaldoWebpay(String v_rut, int monto)throws SQLException{
        WSPagos web = new WSPagos_Service().getWSPagosPort();
        boolean w = web.actualizarSaldo(v_rut, monto);
        return w;
    }
}
