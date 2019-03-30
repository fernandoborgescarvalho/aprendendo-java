package br.com.ricardoeletro.aprendendojava.po.conta;

import br.com.ricardoeletro.aprendendojava.po.conta.Conta;

public class Programa {

    public static void main(String[] args) {

        Conta minhaConta;

        minhaConta = new Conta();

        minhaConta.titula = "Fernando";
        minhaConta.saldo = 1000;

        System.out.println("Saldo Atual:" + minhaConta.saldo);

        
        minhaConta.titula="Rafael";
       
        
        
        //saca 200 reais
        
        minhaConta.saca(200);
        
        //deposita 500 reais
        
        minhaConta.deposita(500);
        
          System.out.println("Saldo Atual:" + minhaConta.saldo);
        
    }

}
