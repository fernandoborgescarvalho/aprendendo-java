/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ricardoeletro.aprendendojava.array;

/**
 *
 * @author fernando.carvalho
 */
public class ArrayExemplo {

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
