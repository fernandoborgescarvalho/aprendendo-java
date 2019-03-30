
package br.com.ricardoeletro.aprendendojava.tasks.tv;


public class CalcularTotalCompras {
    
    public static void main(String[] args) {
        
        TV sony = new TV();
        sony.preco = 5999.0;
        sony.modelo = "S1";
        
        CarrinhodeCompras carrinho = new CarrinhodeCompras();
        carrinho.calcularValorTotalCompras(sony);
        
    }
    
}
