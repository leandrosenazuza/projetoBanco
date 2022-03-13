package br.com.leandrosenazuza;

//Objetivo do Projeto
//Adicionar mais classes e atributos

//Incluir Lombok

public class Main {

    public static void main(String[] args) {


        //teste de gitttttttttttttttttt
        Cliente leandro = new Cliente();
        leandro.setNome("Leandro");

	    Conta contaCorrente = new ContaCorrente(leandro);
        contaCorrente.depositar(100);
        Conta contaPoupanca = new ContaPoupanca(leandro);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirInfosComuns();
    }
}
