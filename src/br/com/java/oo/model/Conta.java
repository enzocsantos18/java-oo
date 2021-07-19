package br.com.java.oo.model;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

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
