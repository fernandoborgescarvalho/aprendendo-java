/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ricardoeletro.aprendendojava.input;

import javax.swing.JOptionPane;

public class InputGui{
    




public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Mensagem");
        JOptionPane.showMessageDialog(null, "Mensagem", "Título", JOptionPane.WARNING_MESSAGE);

        String nome = JOptionPane.showInputDialog("Nome : ");
        System.out.println("Nome: " + nome);

        nome = JOptionPane.showInputDialog(null, "Nome : ", "Título", JOptionPane.WARNING_MESSAGE);
        System.out.println("Nome: " + nome);

        int opcao = JOptionPane.showConfirmDialog(null, "Confirma?");
        System.out.println("Confirmado : " + opcao);

        opcao = JOptionPane.showConfirmDialog(null, "Mensagem", "Título", JOptionPane.WARNING_MESSAGE);
        System.out.println("Confirmado : " + opcao);
    }
}