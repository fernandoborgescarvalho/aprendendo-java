
package br.com.ricardoeletro.apendendojava.exercicio;

import javax.swing.JOptionPane;


public class ConverterTextoMais {
 
    public static void main(String[] args) {
     //criango variavel texto com JOptionPane
        String texto=JOptionPane.showInputDialog("Insira um texto:");
     
     //exibir o texto maisculo
      JOptionPane.showMessageDialog(null,"toUpperCase : " + texto.toUpperCase());
        
        
        
        
        
    }
}
