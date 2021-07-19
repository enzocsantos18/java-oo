package br.com.java.oo;

import br.com.java.oo.model.Cliente;
import br.com.java.oo.model.Conta;

import java.util.StringTokenizer;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumero(1337);

        Cliente enzo = new Cliente();
        enzo.setCpf("123456789");
        enzo.setNome("Enzo de Carvalho Santos");
        enzo.setProfissao("Programador");


        conta.setTitular(enzo);
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());

    }
}
