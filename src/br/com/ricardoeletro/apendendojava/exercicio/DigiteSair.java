package br.com.ricardoeletro.apendendojava.exercicio;

import javax.swing.JOptionPane;

public class DigiteSair {

    public static void main(String[] args) {
        
        String Entradasair; 
        Entradasair="";
        
        while (!"sair".equals(Entradasair)) {

        
            Entradasair = JOptionPane.showInputDialog("Digite sair:");

            if (Entradasair.equals("sair")){

                break;
            }

        }

    }

}
