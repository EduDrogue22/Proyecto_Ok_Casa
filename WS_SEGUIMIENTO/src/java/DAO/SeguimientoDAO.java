package DAO;

import Clases.Seguimiento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author David
 */
public class SeguimientoDAO {

    private Connection conexion;

    public SeguimientoDAO() {
    }

    public List<Seguimiento> listarSeguimiento(String v_rut) throws SQLException {
        List<Seguimiento> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_BUSCAR_SEGUIMIENTO_RUT(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, v_rut);
            cstmt.execute(); //Ejecutamos el procedimiento y llenamos el cursor
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                Seguimiento s = new Seguimiento();
                int id_s = rs.getInt("ID_SEGUIMIENTO");
                String estado_s = rs.getString("ESTADO_SEGUIMIENTO");
                int id_h = rs.getInt("ID_HISTORIAL");
                s = new Seguimiento(id_s, estado_s, id_h);
                lista.add(s);
            }
        } catch (Exception e) {
            System.out.println("Error al listar " + e.getMessage());
        } finally {
            this.conexion.close();
        }
        return lista;
    }

    public List<Seguimiento> seguimientosFinalizados(String v_rut) throws SQLException {
        List<Seguimiento> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_BUSCAR_SEGUIMIENTO_F(?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, v_rut);
            cstmt.execute(); //Ejecutamos el procedimiento y llenamos el cursor
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                Seguimiento s = new Seguimiento();
                int id_s = rs.getInt("ID_SEGUIMIENTO");
                String estado_s = rs.getString("ESTADO_SEGUIMIENTO");
                int id_h = rs.getInt("ID_HISTORIAL");
                s = new Seguimiento(id_s, estado_s, id_h);
                lista.add(s);
            }
        } catch (Exception e) {
            System.out.println("Error al listar " + e.getMessage());
        } finally {
            this.conexion.close();
        }
        return lista;
    }
}
