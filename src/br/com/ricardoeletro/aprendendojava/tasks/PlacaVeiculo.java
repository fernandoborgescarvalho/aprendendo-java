package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class PlacaVeiculo {

    public static void main(String[] args) {

        int sair = 0;

        while (sair == 0) {

            String regex = "w\\w\\w\\w\\-\\d\\d\\d\\d";
            String telefone = JOptionPane.showInputDialog("Favor inserir Placa  Placa Veicular: XXX-xxxx");

            if (telefone.matches(regex)) {

                JOptionPane.showMessageDialog(null, "CEP no formato  xxxxx-xxx");

                sair = 1;

            } else {

                JOptionPane.showMessageDialog(null, "CEP não está no formato Placa Veicular: XXX-xxxx, favor digitar novamente!");

            }
        }
    }
}
