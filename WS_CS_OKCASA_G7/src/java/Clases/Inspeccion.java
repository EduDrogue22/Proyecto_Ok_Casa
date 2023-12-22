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
public class Inspeccion {
    private int id_inspeccion;
    private String nombre_inspeccion;
    private int precio;

    public Inspeccion() {
    }

    public Inspeccion(int id_inspeccion, String nombre_inspeccion, int precio) {
        this.id_inspeccion = id_inspeccion;
        this.nombre_inspeccion = nombre_inspeccion;
        this.precio = precio;
    }

    public int getId_inspeccion() {
        return id_inspeccion;
    }

    public void setId_inspeccion(int id_inspeccion) {
        this.id_inspeccion = id_inspeccion;
    }

    public String getNombre_inspeccion() {
        return nombre_inspeccion;
    }

    public void setNombre_inspeccion(String nombre_inspeccion) {
        this.nombre_inspeccion = nombre_inspeccion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inspeccion{" + "id_inspeccion=" + id_inspeccion + ", nombre_inspeccion=" + nombre_inspeccion + ", precio=" + precio + '}';
    }
    
}
