package br.com.ricardoeletro.aprendendojava.mvc.controller;

import br.com.ricardoeletro.aprendendojava.mvc.view.ViewSaldo;

public class SaldoController {

    public void exibirViewMenuPrincipalSaldo() {
        ViewSaldo viewSaldo = new ViewSaldo();

        String opcao = viewSaldo.exibirViewMenuPrincipalSaldo();
        switch (opcao) {
            case "1":
                viewSaldo.exibirViewSaldoSimplicado();
                break;
            case "2":
                viewSaldo.exibirViewSaldoDetalhado();
                break;
            case "99":
                new MenuPrincipalController().exibirViewMenuPrincipal();
                break;
            default:
                System.out.println("Op Invalido");
                break;
        }
    }

}
