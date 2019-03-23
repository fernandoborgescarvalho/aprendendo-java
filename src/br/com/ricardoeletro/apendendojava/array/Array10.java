package br.com.ricardoeletro.apendendojava.array;

import java.util.Random;

public class Array10 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random r = new Random();

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = r.nextInt(100);

            System.out.println(numeros[i]);

        }

    }
}
