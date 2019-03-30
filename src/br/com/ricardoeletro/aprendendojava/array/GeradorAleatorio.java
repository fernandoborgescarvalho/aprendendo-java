
package br.com.ricardoeletro.aprendendojava.array;

import java.util.Random;

public class GeradorAleatorio {

    public static void main(String[] args) {
        Random r = new Random();

        int n = r.nextInt(100);

        System.out.println(n);

    }

}
