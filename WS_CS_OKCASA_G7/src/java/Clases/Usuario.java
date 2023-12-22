/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tiare
 */
public class Usuario {
    private int id_usuario;
    private String rut;
    private String nombre_usuario;
    private String nombre;
    private String contrasenia_usuario;
    private int tipo_usuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, String rut, String nombre_usuario, String nombre, String contrasenia_usuario, int tipo_usuario) {
        this.id_usuario = id_usuario;
        this.rut = rut;
        this.nombre_usuario = nombre_usuario;
        this.nombre = nombre;
        this.contrasenia_usuario = contrasenia_usuario;
        this.tipo_usuario = tipo_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", rut=" + rut + ", nombre_usuario=" + nombre_usuario + ", nombre=" + nombre + ", contrasenia_usuario=" + contrasenia_usuario + ", tipo_usuario=" + tipo_usuario + '}';
    }

    
    
    
}
