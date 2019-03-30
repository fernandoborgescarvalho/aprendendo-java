package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class RegexCNPJ {

    public static void main(String[] args) {

        int sair = 0;

        while (sair == 0) {

            String regex = "\\d\\d.\\d\\d\\d.\\d\\d\\d/\\d\\d\\d\\d-\\d\\d";

            String cnpj = JOptionPane.showInputDialog("Favor inserir CNPJ no formato  xx.xxx.xxx/xxxx-xx");

            if (cnpj.matches(regex)) {

                JOptionPane.showMessageDialog(null, "CNPJ no formato xx.xxx.xxx/xxxx-xx");

                sair = 1;

            } else {

                JOptionPane.showMessageDialog(null, "CNPJ não está no formato xx.xxx.xxx/xxxx-xx, favor digitar novamente!");

            }

        }

    }
}
