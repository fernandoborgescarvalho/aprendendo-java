package br.com.ricardoeletro.aprendendojava.array;

import java.util.Random;

public class Array10Posicao62_2 {

    public static void main(String[] args) {

        Array10Posicao62 array = new Array10Posicao62();
        //array.criarArray10Posicoes(5, 20);
    }

    public void criarArray10Posicoes(Integer tamanhoArray, Integer valorMaximo) {
        int[] array = new int[tamanhoArray];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(valorMaximo);
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}
