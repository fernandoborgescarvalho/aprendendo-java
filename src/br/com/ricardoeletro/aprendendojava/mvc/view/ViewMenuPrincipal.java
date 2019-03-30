package br.com.ricardoeletro.aprendendojava.mvc.view;

import javax.swing.JOptionPane;

public class ViewMenuPrincipal {

    public String exibirMenuPrincipal() {
        String opcaoSelecionada = JOptionPane.showInputDialog("1 - Saldo \n 2 - Depósito");
        return opcaoSelecionada;
    }

    public Double exibirViewDeposito() {
        String valor = JOptionPane.showInputDialog("Valor: ");
        return Double.valueOf(valor);
    }

    public void exibirViewOpcaoInvalida() {
        JOptionPane.showMessageDialog(null, "Opção de Menu Inválida");
    }

}
