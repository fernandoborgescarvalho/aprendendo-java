
package br.com.ricardoeletro.aprendendojava.input;

import javax.swing.JOptionPane;

public class Input {
    public static void main(String[] args) {
         String nome = JOptionPane.showInputDialog("Nome : ");
        System.out.println("Nome: " + nome);
    }
}