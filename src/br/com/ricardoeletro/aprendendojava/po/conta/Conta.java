package br.com.ricardoeletro.aprendendojava.po.conta;
//receita do bolo

public class Conta {

    int numero;
    String titula;
    double saldo;

    void saca(double quantidade) {

        double novoSaldo = this.saldo - quantidade;

        this.saldo = novoSaldo;

    }

    void deposita(double quantidade) {

        this.saldo += quantidade;

    }

    
    
    
}
