package br.com.leandrosenazuza;

public interface IConta { //A interface é uma classe abstrata
    void sacar(double valor); //Todo método em interface é público

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
