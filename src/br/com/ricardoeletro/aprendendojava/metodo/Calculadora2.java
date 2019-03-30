package br.com.ricardoeletro.aprendendojava.metodo;

import javax.swing.JOptionPane;

public class Calculadora2 {

    public static void main(String[] args) {
        Calculadora2 calc = new Calculadora2();

        String opcaostring = JOptionPane.showInputDialog("Digite Opção 1: somar / 2: Multiplicar: / 3: Subtrair / 4- Dividir");

        Integer opcao = Integer.valueOf(opcaostring);

        String numerostring1 = JOptionPane.showInputDialog("Digite Numero Inteiro 1:");
        String numerostring2 = JOptionPane.showInputDialog("Digite Numero Inteiro 2");

        Integer numero1 = Integer.valueOf(numerostring1);
        Integer numero2 = Integer.valueOf(numerostring2);

        switch (opcao) {
            case 1:
                calc.somar(numero1, numero2);
                break;
            case 2:
                calc.multiplicar(numero1, numero2);
                break;
            case 3:
                calc.subtrair(numero1, numero2);
                break;
            default:
                calc.dividir(numero1, numero2);
                break;
        }

    }

    public void somar(Integer x, Integer y) {

        Integer resultado = x + y;

        JOptionPane.showMessageDialog(null, "Resultado da soma : " + resultado);

    }

    public void multiplicar(Integer x, Integer y) {

        Integer resultado = x * y;

        JOptionPane.showMessageDialog(null, "Resultado da Multiplicação : " + resultado);

    }

    public void subtrair(Integer x, Integer y) {

        Integer resultado = x - y;

        JOptionPane.showMessageDialog(null, "Resultado da Subtração : " + resultado);

    }

    public void dividir(Integer x, Integer y) {

        Integer resultado = x / y;

        JOptionPane.showMessageDialog(null, "Resultado da Divisão : " + resultado);

    }

}
