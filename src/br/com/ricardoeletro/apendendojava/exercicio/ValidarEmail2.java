package br.com.ricardoeletro.apendendojava.exercicio;

import javax.swing.JOptionPane;

public class ValidarEmail2 {

    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Digite E-mail");

        email = email.trim();

        if (email.contains("@")) {

            if (email.endsWith(".com")) {

                if (email.indexOf("@") >= 3) {

                } else {

                    JOptionPane.showMessageDialog(null, "Mais de tres caracteres depois do @");
                }

            } else {

                JOptionPane.showMessageDialog(null, "Falta .com!");
            }

        } else {

            JOptionPane.showMessageDialog(null, "Falta @!");

        }

    }

}
