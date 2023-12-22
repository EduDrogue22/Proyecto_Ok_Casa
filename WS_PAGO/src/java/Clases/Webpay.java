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
public class Webpay {
    private int id_cliente;
    private String rut;
    private int saldo;
    private String n_banco;

    public Webpay() {
    }

    public Webpay(int id_cliente, String rut, int saldo, String n_banco) {
        this.id_cliente = id_cliente;
        this.rut = rut;
        this.saldo = saldo;
        this.n_banco = n_banco;
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getN_banco() {
        return n_banco;
    }

    public void setN_banco(String n_banco) {
        this.n_banco = n_banco;
    }

    @Override
    public String toString() {
        return "Webpay{" + "id_cliente=" + id_cliente + ", rut=" + rut + ", saldo=" + saldo + ", n_banco=" + n_banco + '}';
    }
    
}
