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
public class HistorialInspeccion {
    private int id_historial;
    private String descripcion;
    private String fecha_inspeccion;
    private int id_usuario;
    private int id_equipo;
    private int id_inspeccion;

    public HistorialInspeccion() {
    }

    public HistorialInspeccion(int id_historial, String descripcion, String fecha_inspeccion, int id_usuario, int id_equipo, int id_inspeccion) {
        this.id_historial = id_historial;
        this.descripcion = descripcion;
        this.fecha_inspeccion = fecha_inspeccion;
        this.id_usuario = id_usuario;
        this.id_equipo = id_equipo;
        this.id_inspeccion = id_inspeccion;
    }

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_inspeccion() {
        return fecha_inspeccion;
    }

    public void setFecha_inspeccion(String fecha_inspeccion) {
        this.fecha_inspeccion = fecha_inspeccion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_inspeccion() {
        return id_inspeccion;
    }

    public void setId_inspeccion(int id_inspeccion) {
        this.id_inspeccion = id_inspeccion;
    }

    @Override
    public String toString() {
        return "HistorialInspeccion{" + "id_historial=" + id_historial + ", descripcion=" + descripcion + ", fecha_inspeccion=" + fecha_inspeccion + ", id_usuario=" + id_usuario + ", id_equipo=" + id_equipo + ", id_inspeccion=" + id_inspeccion + '}';
    }

    
    
}
