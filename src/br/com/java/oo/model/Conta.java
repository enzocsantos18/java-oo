package br.com.java.oo.model;

public class Conta {

    private double saldo = 0;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero, Cliente titular){

        if (agencia <= 0 || numero <= 0 || titular == null ){
            throw new IllegalArgumentException("O número deve ser maior que zero.");
        }


        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

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
        if (agencia <= 0){
            throw new IllegalArgumentException("O número deve ser maior que zero.");
        }
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            throw new IllegalArgumentException("O número deve ser maior que zero.");
        }
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
