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
public class HistorialPagoAUX {
    private String rut;
    private int id_historial;
    private String descripcion;
    private int monto_post_descuento;
    private int monto_paga;

    public HistorialPagoAUX() {
    }

    public HistorialPagoAUX(String rut, int id_historial, String descripcion, int monto_post_descuento, int monto_paga) {
        this.rut = rut;
        this.id_historial = id_historial;
        this.descripcion = descripcion;
        this.monto_post_descuento = monto_post_descuento;
        this.monto_paga = monto_paga;
    }

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMonto_post_descuento() {
        return monto_post_descuento;
    }

    public void setMonto_post_descuento(int monto_post_descuento) {
        this.monto_post_descuento = monto_post_descuento;
    }

    public int getMonto_paga() {
        return monto_paga;
    }

    public void setMonto_paga(int monto_paga) {
        this.monto_paga = monto_paga;
    }

    @Override
    public String toString() {
        return "HistorialPagoAUX{" + "rut=" + rut + ", id_historial=" + id_historial + ", descripcion=" + descripcion + ", monto_post_descuento=" + monto_post_descuento + ", monto_paga=" + monto_paga + '}';
    }
    
    
  
}
