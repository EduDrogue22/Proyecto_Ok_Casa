/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Bastian Ahumada
 */
public class Seguimiento {
    private int id_seguimiento;
    private String estado_seguimiento;
    private int id_historial;

    public Seguimiento() {
    }

    public Seguimiento(int id_seguimiento, String estado_seguimiento, int id_historial) {
        this.id_seguimiento = id_seguimiento;
        this.estado_seguimiento = estado_seguimiento;
        this.id_historial = id_historial;
    }

    public int getId_seguimiento() {
        return id_seguimiento;
    }

    public void setId_seguimiento(int id_seguimiento) {
        this.id_seguimiento = id_seguimiento;
    }

    public String getEstado_seguimiento() {
        return estado_seguimiento;
    }

    public void setEstado_seguimiento(String estado_seguimiento) {
        this.estado_seguimiento = estado_seguimiento;
    }

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    @Override
    public String toString() {
        return "Seguimiento{" + "id_seguimiento=" + id_seguimiento + ", estado_seguimiento=" + estado_seguimiento + ", id_historial=" + id_historial + '}';
    }
    
    
    
    
}
