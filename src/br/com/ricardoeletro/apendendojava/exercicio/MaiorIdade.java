package br.com.ricardoeletro.apendendojava.exercicio;

import javax.swing.JOptionPane;

public class MaiorIdade {

    public static void main(String[] args) {

        String idade = JOptionPane.showInputDialog("Insira sua idade : ");

        System.out.println("Idade: " + idade);

        Integer id = Integer.valueOf(idade);

        if (id >= 18) {

            JOptionPane.showMessageDialog(null, "Maior de Idade");
        } else {
            JOptionPane.showMessageDialog(null, "Menor de Idade");
        }

    }

}
