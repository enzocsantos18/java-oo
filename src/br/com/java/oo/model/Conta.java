package br.com.java.oo.model;

public class Conta {

    public double saldo;
    public int agencia;
    public int numero;
    public String titular;

    public double deposita(double valor){
        this.saldo += valor;

        return this.saldo;
    }

    public boolean saca(double valor){
        if (this.saldo < valor){
            return false;
        }

        this.saldo -= valor;
        return true;
    }

}
