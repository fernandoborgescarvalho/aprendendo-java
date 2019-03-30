package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class TamanhoTexto {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Digite um Texto:");

        texto = texto.trim();

        JOptionPane.showMessageDialog(null, "Caracteres" + texto.length());

    }

}
