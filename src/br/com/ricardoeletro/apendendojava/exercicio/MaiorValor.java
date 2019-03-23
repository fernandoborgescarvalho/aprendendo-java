package br.com.ricardoeletro.apendendojava.exercicio;

import java.util.Objects;
import javax.swing.JOptionPane;

public class MaiorValor {

    public static void main(String[] args) {
        String valorstringx = JOptionPane.showInputDialog("Insira um número inteiro(x)  : ");
        
        String valorstringy = JOptionPane.showInputDialog("Insira um número inteiro(y)  : ");
        
        Integer valorx = Integer.valueOf(valorstringx);
        
        Integer valory = Integer. valueOf(valorstringy);
        
        
        if (Objects.equals(valorx, valory)) {
            
            JOptionPane.showMessageDialog(null, valorx + " " + "Igual" + " " + valory);
            
        } else if (valorx > valory) {
            JOptionPane.showMessageDialog(null, valorx + " " + "Maior" + " " + valory);
            
        } else {
            JOptionPane.showMessageDialog(null, valory + " " + "Maior" + " " + valorx);
        }
    }
}
