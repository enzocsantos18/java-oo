package br.com.java.oo;

import br.com.java.oo.model.Cliente;
import br.com.java.oo.model.Conta;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta(1234,123,new Cliente());
        double saldoAtual = conta.deposita(100);
        System.out.println("O saldo atual é de: " + saldoAtual);

        boolean saca = conta.saca(150);
        if (saca){
            System.out.println("O saldo atual é de: " + conta.getSaldo());
        }else {
            System.out.println("Não foi possível sacar");
        }

        Conta conta2 = new Conta(1234,123,new Cliente());
        conta2.deposita(1000);

        boolean transfere = conta2.transfere(500, conta);

        if (!transfere) {
            System.out.println("Não foi possível tranferir");
        }


        System.out.println("Saldo da conta 1: " + conta.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());

    }
}
