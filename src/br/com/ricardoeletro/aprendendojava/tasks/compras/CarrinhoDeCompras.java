package br.com.ricardoeletro.aprendendojava.tasks.compras;

public class CarrinhoDeCompras {

    public static void main(String[] args) {

        TV smarttv32lg = new TV();
        TV smarttv32samsung = new TV();
        
        
        
        
        smarttv32lg.preco = 999.5;
        smarttv32samsung.preco=1200.0;
        

        smarttv32lg.calcularValorTotalCompras(smarttv32lg);
        smarttv32samsung.calcularValorTotalCompras(smarttv32samsung);

    }

}
