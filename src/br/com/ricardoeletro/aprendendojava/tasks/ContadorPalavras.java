
package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class ContadorPalavras {
    public static void main(String[] args) {
   
    
    String texto = JOptionPane.showInputDialog("Digite um Texto:");

        texto = texto.trim();
                
      JOptionPane.showMessageDialog(null, "Quantidade de Palavras:  " + texto.split(" ").length);
    }
    
}

