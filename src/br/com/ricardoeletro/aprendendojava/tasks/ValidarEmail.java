package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class ValidarEmail {

    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Insira seu e-mail : ");
        
        email = email.trim();
        
        if (email.contains("@")) {

            if (email.endsWith(".com")) {

                if (email.indexOf("@") >= 3) {

                } else {
                    JOptionPane.showMessageDialog(null, ">=3");
                }

            } else {
                JOptionPane.showMessageDialog(null, "falta .com");

            }

        } else {
            JOptionPane.showMessageDialog(null, "E-mail inválido falta @");
        }
        JOptionPane.showMessageDialog(null, "E-mail válido!");

    }

}
