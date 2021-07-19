package br.com.java.oo;

import br.com.java.oo.model.Conta;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);

        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);

        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta;
        segundaConta.deposita(50);

        System.out.println("A primeira conta tem de saldo: " + primeiraConta.getSaldo());
        System.out.println("A segunda conta tem de saldo: " + segundaConta.getSaldo());

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}