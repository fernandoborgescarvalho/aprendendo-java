package br.com.ricardoeletro.aprendendojava.metodo;

import javax.swing.JOptionPane;

public class CriandoMetodo {

    public static void main(String[] args) {

        CriandoMetodo m = new CriandoMetodo();
        String texto = JOptionPane.showInputDialog("Texto :");
        m.imprimiTextoMaiuculo(texto);

    }

    public void imprimiTexto(String texto) {
        System.out.println(texto);
    }

    public void imprimiTextoMaiuculo(String texto) {
        System.out.println(texto.toUpperCase());
    }

}
