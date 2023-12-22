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
public class Equipo {
    private int id_equipo;
    private String descripcion;
    private int id_inspeccion;

    public Equipo() {
    }

    public Equipo(int id_equipo, String descripcion, int id_inspeccion) {
        this.id_equipo = id_equipo;
        this.descripcion = descripcion;
        this.id_inspeccion = id_inspeccion;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId_inspeccion() {
        return id_inspeccion;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId_inspeccion(int id_inspeccion) {
        this.id_inspeccion = id_inspeccion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id_equipo=" + id_equipo + ", descripcion=" + descripcion + ", id_inspeccion=" + id_inspeccion + '}';
    }
    
    
}
