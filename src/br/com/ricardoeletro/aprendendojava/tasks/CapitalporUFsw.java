/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

/**
 *
 * @author fernando.carvalho
 */
public class CapitalporUFsw {

    public static void main(String[] args) {

        String UF = JOptionPane.showInputDialog("Digite a UF:");

        switch (UF) {
            case "AC":
                JOptionPane.showMessageDialog(null, "Capital : Rio Branco");
                break;
            case "AL":
                JOptionPane.showMessageDialog(null, "Capital : Maceió");
                break;
            case "AP":
                JOptionPane.showMessageDialog(null, "Capital : Macapá");
                break;
            case "BA":
                JOptionPane.showMessageDialog(null, "Capital : Salvador");
                break;
            case "AM":
                JOptionPane.showMessageDialog(null, "Capital : Manaus");
                break;
            case "CE":
                JOptionPane.showMessageDialog(null, "Capital : Fortaleza");
                break;
            case "DF":
                JOptionPane.showMessageDialog(null, "Capital : Brasília");
                break;
            case "ES":
                JOptionPane.showMessageDialog(null, "Capital : vitória");
                break;
            case "GO":
                JOptionPane.showMessageDialog(null, "Capital : Goiânia");
                break;
            case "MA":
                JOptionPane.showMessageDialog(null, "Capital : São Luís");
                break;
            case "MT":
                JOptionPane.showMessageDialog(null, "Capital : Cuiabá");
                break;
            case "MS":
                JOptionPane.showMessageDialog(null, "Capital : Campo Grande");
                break;
            case "MG":
                JOptionPane.showMessageDialog(null, "Capital : Belo Horizonte");
                break;
            case "PA":
                JOptionPane.showMessageDialog(null, "Capital : Belém");
                break;
            case "PB":
                JOptionPane.showMessageDialog(null, "Capital : João Pessoa");
                break;
            case "PR":
                JOptionPane.showMessageDialog(null, "Capital : Curitiba");
                break;
            case "PE":
                JOptionPane.showMessageDialog(null, "Capital : Recife");
                break;
            case "PI":
                JOptionPane.showMessageDialog(null, "Capital : Teresina");
                break;
            case "RJ":
                JOptionPane.showMessageDialog(null, "Capital : Rio de Janeiro");
                break;
            case "SP":
                JOptionPane.showMessageDialog(null, "Capital : São Paulo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não encontrado!");
                break;
        }

    }

}
