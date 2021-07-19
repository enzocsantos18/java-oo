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
        if (verificaSaldo(valor)) return false;

        this.saldo -= valor;
        return true;
    }

    public boolean transfere(double valor, Conta destino){
        if (verificaSaldo(valor)) return false;

        this.saldo -= valor;
        destino.deposita(valor);

        return true;
    }

    private boolean verificaSaldo(double valor) {
        return this.saldo < valor;
    }
}
