/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.UsuarioDAO;

public class TestLogin {

    
    public static void main(String[] args) {
        try {
            if(new UsuarioDAO().RutUsuario("Nombre_3","contra_3")!=null){
                System.out.println("rut : "+new UsuarioDAO().RutUsuario("Nombre_3","contra_3"));
            } else {
                System.out.println("Credenciales incorrectas");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
