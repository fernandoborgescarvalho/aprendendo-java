package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class RegexCep {

    public static void main(String[] args) {

        int sair = 0;

        while (sair == 0) {

            String regex = "\\d\\d\\d\\d\\d-\\d\\d\\d";
            String telefone = JOptionPane.showInputDialog("Favor inserir CEP no formato  xxxxx-xxx");

            if (telefone.matches(regex)) {

                JOptionPane.showMessageDialog(null, "CEP no formato  xxxxx-xxx");

                sair = 1;

            } else {

                JOptionPane.showMessageDialog(null, "CEP não está no formato xxxxx-xxx, favor digitar novamente!");

            }
        }
    }
}
