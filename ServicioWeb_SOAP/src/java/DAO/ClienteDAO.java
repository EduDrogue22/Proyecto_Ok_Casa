/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Cliente;
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
public class ClienteDAO {
    private Connection conexion;
    public ClienteDAO(){
    }
    public List<Cliente> listarClientes() throws SQLException{
        List<Cliente> lista = new ArrayList<>();
        try{
            this.conexion = new Connexion.Conexion().obtenerConexion();
            String llamada = "{ call SP_LISTAR_CLIENTES(?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute(); //Ejecutamos el procedimiento y llenamos el cursor
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while(rs.next()){
                Cliente c = new Cliente();
                int id_c=rs.getInt("ID_CLIENTE");
                String rut =rs.getString("RUT");
                String nom =rs.getString("NOMBRE_CLIENTE");
                int cred = rs.getInt("CREDITO_HIP");
                lista.add( new Cliente(id_c,rut,nom,cred));
            }
        }catch(Exception e) {
            System.out.println("Error al listar "+e.getMessage());
        } finally {
            this.conexion.close();
        }
        
        
        return lista;
    }    
}
