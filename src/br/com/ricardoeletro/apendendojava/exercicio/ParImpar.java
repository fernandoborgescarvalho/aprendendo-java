package br.com.ricardoeletro.apendendojava.exercicio;
import javax.swing.JOptionPane;
public class ParImpar {

    public static void main(String[] args) {

        String numerostring = JOptionPane.showInputDialog("Insira um numero inteiro:");

        Integer numero = Integer.valueOf(numerostring);

        int resto;

        resto = numero % 2;

        if (resto == 0) {
            JOptionPane.showMessageDialog(null, "Número Par!");

        } else {
            JOptionPane.showMessageDialog(null, "Número impar!");
        }

    }

}
