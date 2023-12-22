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
public class Cliente {
    private int id_cliente;
    private String rut;
    private String nombre;
    private int credito;

    public Cliente() {
    }

    public Cliente(int id_cliente, String rut, String nombre, int credito) {
        this.id_cliente = id_cliente;
        this.rut = rut;
        this.nombre = nombre;
        this.credito = credito;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", rut=" + rut + ", nombre=" + nombre + ", credito=" + credito + '}';
    }
    
}
