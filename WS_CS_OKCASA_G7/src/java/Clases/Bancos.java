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
public class Bancos {
    private int id_banco;
    private String n_banco;

    public Bancos() {
    }

    public Bancos(int id_banco, String n_banco) {
        this.id_banco = id_banco;
        this.n_banco = n_banco;
    }

    public int getId_bancos() {
        return id_banco;
    }

    public void setId_bancos(int id_banco) {
        this.id_banco = id_banco;
    }

    public String getN_bancos() {
        return n_banco;
    }

    public void setN_bancos(String n_banco) {
        this.n_banco = n_banco;
    }

    @Override
    public String toString() {
        return "Bancos{" + "id_banco=" + id_banco + ", n_banco=" + n_banco + '}';
    }
    

}
