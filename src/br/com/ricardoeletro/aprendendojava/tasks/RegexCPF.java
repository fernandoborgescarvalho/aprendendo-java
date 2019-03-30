package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class RegexCPF {
public static void main(String[] args) {

        int sair = 0;

        while (sair == 0) {

            String regex = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
            String cpf = JOptionPane.showInputDialog("Favor inserir CPF no formato  xxx.xxx.xxx-xx");

            if (cpf.matches(regex)) {

                JOptionPane.showMessageDialog(null, "CPF no formato xxx.xxx.xxx-xx");

                sair = 1;

            } else {

                JOptionPane.showMessageDialog(null, "CPF não está no formato xxx.xxx.xxx-xx, favor digitar novamente!");

            }

        }

    }
}
