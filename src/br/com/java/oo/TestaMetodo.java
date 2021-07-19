package br.com.java.oo;

import br.com.java.oo.model.Conta;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        double saldoAtual = conta.deposita(100);
        System.out.println("O saldo atual é de: " + saldoAtual);

        boolean saca = conta.saca(150);
        if (saca){
            System.out.println("O saldo atual é de: " + conta.saldo);
        }else {
            System.out.println("Não foi possível sacar");
        }

        Conta conta2 = new Conta();
        conta2.deposita(1000);

        boolean transfere = conta2.transfere(500, conta);

        if (!transfere) {
            System.out.println("Não foi possível tranferir");
        }


        System.out.println("Saldo da conta 1: " + conta.saldo);
        System.out.println("Saldo da conta 2: " + conta2.saldo);

    }
}
