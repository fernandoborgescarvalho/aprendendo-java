package br.com.ricardoeletro.aprendendojava.mvc;

import br.com.ricardoeletro.aprendendojava.mvc.controller.MenuPrincipalController;

public class Main {

    public static void main(String[] args) {

        MenuPrincipalController menuPrincipalController = new MenuPrincipalController();
        String opcao = menuPrincipalController.exibirViewMenuPrincipal();
        
        menuPrincipalController.opcoesMenuPrincial(opcao);

        System.out.println(opcao);
    }

}
