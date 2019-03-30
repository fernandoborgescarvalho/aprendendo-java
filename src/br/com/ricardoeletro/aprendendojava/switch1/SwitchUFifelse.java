
package br.com.ricardoeletro.aprendendojava.switch1;

import javax.swing.JOptionPane;


public class SwitchUFifelse {

    public static void main(String[] args) {

        String uf = JOptionPane.showInputDialog("UF");

        if (uf.equals("MT")) {
            System.out.println("Cuiaba");
        } else if (uf.equals("SP")) {
            System.out.println("Sao Paulo");
        } else {
            System.out.println("UF NÃO Existe");
        }

    }
}
