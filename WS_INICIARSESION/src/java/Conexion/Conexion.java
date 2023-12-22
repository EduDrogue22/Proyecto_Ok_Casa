
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    //Crear la variable que abrira la conexión
    private static Connection con;
    ////Credenciales
    private String usuario = "OKCASA";
    private String pass = "OKCASA1";
    private String url = "jdbc:oracle:thin:"+usuario+"/"+pass+"@localhost:1521:xe";

    public Conexion() {
        try {
            //Cargar la libreria Ojdbc para conectar ORACLE
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.con = DriverManager.getConnection(url,usuario,pass);
        } catch (Exception e) {
            System.out.println("Error de conexión "+e.getMessage());
        }
    }
    
    public Connection obtenerConexion(){
        return this.con;
    }
    
}
