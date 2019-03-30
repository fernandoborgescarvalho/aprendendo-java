
package br.com.ricardoeletro.aprendendojava.array;

public class ArrayExemplo2 {

    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 5;

        int i = array[1];

        System.out.println(array[1]);
        System.out.println("tamanho: " + array.length);

    }
}
