package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class RegexTelefone {

    public static void main(String[] args) {

        int sair = 0;

        while (sair == 0) {

            String regex = "\\(\\d\\d\\) \\d\\d\\d\\d\\d-\\d\\d\\d\\d";
            String telefone = JOptionPane.showInputDialog("Favor inserir telefone no formato  (99) 99999-9999");

            if (telefone.matches(regex)) {

                JOptionPane.showMessageDialog(null, "Telefone no formato (99) 99999-9999");

                sair = 1;

            } else {

                JOptionPane.showMessageDialog(null, "Telefone não está no formato (99) 99999-9999, favor digitar novamente!");

            }

        }

    }

}
