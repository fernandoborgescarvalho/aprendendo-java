package br.com.ricardoeletro.aprendendojava.mvc.controller;

import br.com.ricardoeletro.aprendendojava.mvc.view.ViewMenuPrincipal;

public class MenuPrincipalController {

    public String exibirViewMenuPrincipal() {
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        String opcao = menu.exibirMenuPrincipal();
        return opcao;
    }

    public void opcoesMenuPrincial(String opcao) {
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        switch (opcao) {
            case "1":
                SaldoController saldoController = new SaldoController();
                saldoController.exibirViewMenuPrincipalSaldo();
                break;
            case "2":
                menu.exibirViewDeposito();
                break;
            default:
                menu.exibirViewOpcaoInvalida();
                break;
        }
    }

}
