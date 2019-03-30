package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class Aposentadoria {

    public static void main(String[] args) {

        String idadestring = JOptionPane.showInputDialog("Digite Idade:");

        Integer idade = Integer.valueOf(idadestring);

        int resultado;

        resultado = 66 - idade;

        if (resultado <= 0) {

            JOptionPane.showMessageDialog(null, "Já Pode se aponsentar!");

        } else {

            JOptionPane.showMessageDialog(null, "Falta " + resultado + " para se aposentar!");

        }

    }

}
