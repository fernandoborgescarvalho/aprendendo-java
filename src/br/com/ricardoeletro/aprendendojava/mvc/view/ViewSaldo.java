package br.com.ricardoeletro.aprendendojava.mvc.view;


import javax.swing.JOptionPane;

public class ViewSaldo {

    public String exibirViewMenuPrincipalSaldo() {
        String opcaoSelecionada = JOptionPane.showInputDialog("1 - Saldo simplificado \n 2 - Saldo detalhado"
                + "\n 99 - Menu principal");
        return opcaoSelecionada;
    }

    public void exibirViewSaldoSimplicado() {
        JOptionPane.showMessageDialog(null, "Saldo: 200");
    }

    public void exibirViewSaldoDetalhado() {
        JOptionPane.showMessageDialog(null, "Saldo: 200 \n Cheque: 50 \n Total: 250,00");
    }
}
