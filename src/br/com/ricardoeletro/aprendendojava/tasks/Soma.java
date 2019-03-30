package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class Soma {

    public static void main(String[] args) {
        int resultado;
        String somastring1 = JOptionPane.showInputDialog("Insira o 1 numero inteiro");
        String somastring2 = JOptionPane.showInputDialog("Insira o 2 numero inteiro");
        Integer soma1 = Integer.valueOf(somastring1);
        Integer soma2 = Integer.valueOf(somastring2);
        resultado = soma1 + soma2;
        JOptionPane.showMessageDialog(null, "Resultado da soma :" + " " + resultado);

    }

}
