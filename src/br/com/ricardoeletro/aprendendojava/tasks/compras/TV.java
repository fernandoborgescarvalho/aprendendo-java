package br.com.ricardoeletro.aprendendojava.tasks.compras;

import javax.swing.JOptionPane;

/*Crie uma classe para representar uma TV com os dados informados no link TV site Magazine Luiza*/
public class TV {

    Double preco;

    public static void main(String[] args) {

        TV smarttv32lg = new TV();
        TV smarttv32Samsung = new TV();
        

     //   smarttv32lg.preco = 999.5;

    }

    public void calcularValorTotalCompras(TV tv) {

        Double total = 0.0;

        total = total + tv.preco;
        JOptionPane.showMessageDialog(null, "Preço Total: " + total);
        

    }

}
