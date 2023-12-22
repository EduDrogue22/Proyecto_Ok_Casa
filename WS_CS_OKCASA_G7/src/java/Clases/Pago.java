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
public class Pago {
    private int id_pago;
    private String nombre_banco;
    private int monto;
    private int id_usuario;    

    public Pago() {
    }

    public Pago(int id_pago, String nombre_banco, int monto, int id_usuario) {
        this.id_pago = id_pago;
        this.nombre_banco = nombre_banco;
        this.monto = monto;
        this.id_usuario = id_usuario;
    }

    public int getId_pago() {
        return id_pago;
    }

    public String getNombre_banco() {
        return nombre_banco;
    }

    public int getMonto() {
        return monto;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }
    
    public void setNombre_banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Pago{" + "id_pago=" + id_pago + ", nombre_banco=" + nombre_banco + ", monto=" + monto + ", id_usuario=" + id_usuario + '}';
    }
    
    
}
