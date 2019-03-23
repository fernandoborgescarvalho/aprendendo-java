package br.com.ricardoeletro.apendendojava.exercicio;

import javax.swing.JOptionPane;

public class ValidarTelefone {

    public static void main(String[] args) {

        String telefone = JOptionPane.showInputDialog("Favor inserir o telefone : ");

        if (telefone.length() >= 15) {

            JOptionPane.showMessageDialog(null, "Erro na válidação > de 14 caracters : ");

        } else {

            JOptionPane.showMessageDialog(null, "Telefone válido!");

        }

    }
}
