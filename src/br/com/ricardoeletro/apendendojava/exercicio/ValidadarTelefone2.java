package br.com.ricardoeletro.apendendojava.exercicio;

import javax.swing.JOptionPane;

public class ValidadarTelefone2 {

    public static void main(String[] args) {

        int saida=0;
        
        while (saida == 0)  {

            String regex = "\\(\\d\\d\\) \\d\\d\\d\\d-\\d\\d\\d\\d";

            String telefone = JOptionPane.showInputDialog("Favor inserir o telefone : ");

            if (telefone.matches(regex)) {
                JOptionPane.showMessageDialog(null, "Telefone no formato!");
                saida=1;
            } else {
                JOptionPane.showMessageDialog(null, "Telefone não está no formato (99) 9999-9999, digite novamente!");

            }
        }

    }

}
