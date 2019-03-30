
package br.com.ricardoeletro.aprendendojava.switch1;

import javax.swing.JOptionPane;


public class SwitchUF {

    public static void main(String[] args) {

        String uf = JOptionPane.showInputDialog("UF");

        switch (uf) {
            case "MT":
                System.out.println("Cuiaba");
                break;
            case "SP":
                System.out.println("Sao Paulo");
                break;
            default:
                System.out.println("UF NÃO Existe");
        }
    }
}

