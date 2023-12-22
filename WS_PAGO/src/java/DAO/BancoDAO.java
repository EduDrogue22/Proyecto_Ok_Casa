/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Banco;
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
public class BancoDAO {

    private Connection conexion;

    public BancoDAO() {
    }

    public List<Banco> listarBancos() throws SQLException {
        List<Banco> lista = new ArrayList<>();
        try {
            this.conexion = new Conexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_BANCOS(?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Ejecutamos el procedimiento y llenamos el cursor
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while(rs.next()){
                int id_b=rs.getInt("ID_BANCO");
                String n_banco =rs.getString("N_BANCO");
                lista.add(new Banco(id_b,n_banco));
            }
        } catch(Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally {
            this.conexion.close();
        }
        return lista;
    }
}
