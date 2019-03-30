package br.com.ricardoeletro.aprendendojava.tasks;

import javax.swing.JOptionPane;

public class CapitalporUF {

    public static void main(String[] args) {

        String UF = JOptionPane.showInputDialog("Digite a UF:");

        if (UF.equals("AC")) {

            JOptionPane.showMessageDialog(null, "Capital : Rio Branco");

        } else if (UF.equals("AL")) {
            JOptionPane.showMessageDialog(null, "Capital : Maceió");

        } else if (UF.equals("AP")) {

            JOptionPane.showMessageDialog(null, "Capital : Macapá");

        } else if (UF.equals("BA")) {

            JOptionPane.showMessageDialog(null, "Capital : Salvador");

        } else if (UF.equals("AM")) {

            JOptionPane.showMessageDialog(null, "Capital : Manaus");

        } else if (UF.equals("CE")) {

            JOptionPane.showMessageDialog(null, "Capital : Fortaleza");

        } else if (UF.equals("DF")) {

            JOptionPane.showMessageDialog(null, "Capital : Brasília");

        } else if (UF.equals("ES")) {

            JOptionPane.showMessageDialog(null, "Capital : vitória");

        } else if (UF.equals("GO")) {

            JOptionPane.showMessageDialog(null, "Capital : Goiânia");

        } else if (UF.equals("MA")) {

            JOptionPane.showMessageDialog(null, "Capital : São Luís");

        } else if (UF.equals("MT")) {

            JOptionPane.showMessageDialog(null, "Capital : Cuiabá");

        } else if (UF.equals("MS")) {

            JOptionPane.showMessageDialog(null, "Capital : Campo Grande");

        } else if (UF.equals("MG")) {

            JOptionPane.showMessageDialog(null, "Capital : Belo Horizonte");

        } else if (UF.equals("PA")) {

            JOptionPane.showMessageDialog(null, "Capital : Belém");

        } else if (UF.equals("PB")) {

            JOptionPane.showMessageDialog(null, "Capital : João Pessoa");

        } else if (UF.equals("PR")) {

            JOptionPane.showMessageDialog(null, "Capital : Curitiba");

        } else if (UF.equals("PE")) {

            JOptionPane.showMessageDialog(null, "Capital : Recife");

        } else if (UF.equals("PI")) {

            JOptionPane.showMessageDialog(null, "Capital : Teresina");

        } else if (UF.equals("RJ")) {

            JOptionPane.showMessageDialog(null, "Capital : Rio de Janeiro");
        } else if (UF.equals("SP")) {

            JOptionPane.showMessageDialog(null, "Capital : São Paulo");

        } else {
            JOptionPane.showMessageDialog(null, "Não encontrado!");
        }

    }
}
