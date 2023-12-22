/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tiare
 */
public class Conexion {
    private static Connection con;
    private String usuario = "WEBPAY";
    private String pass = "WEBPAY";
    private String url = "jdbc:oracle:thin:"+usuario+"/"+pass+"@localhost:1521:xe";
    public Conexion(){
        try {
                //Cargar la libreria jdbl para oracle e intentar conectarnos
                Class.forName("oracle.jdbc.OracleDriver").newInstance();
                this.con = DriverManager.getConnection(url, usuario, pass);
        } catch (Exception e) {
            System.out.println("Error de conexión "+e.getMessage());
        }
    }
    
    public Connection obtenerConexion(){
        return this.con;
    }
}
