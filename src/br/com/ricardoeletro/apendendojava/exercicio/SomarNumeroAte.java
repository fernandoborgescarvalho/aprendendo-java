package br.com.ricardoeletro.apendendojava.exercicio;

import javax.swing.JOptionPane;

public class SomarNumeroAte {

    public static void main(String[] args) {
        int soma;

        String numerostring = JOptionPane.showInputDialog("Digite um numero: ");

        Integer numero = Integer.valueOf(numerostring);
        soma = 0;
        for (int i = 0; i <= numero; i++) {

            soma = soma + i;

        }

        JOptionPane.showMessageDialog(null, "Resultado da soma :" + " " + soma);
    }

}
