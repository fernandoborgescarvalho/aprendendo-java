
package br.com.ricardoeletro.aprendendojava.tasks.tv;

public class TVConstrutor {

    String modelo;
    Double preco;

    TVConstrutor() {
    }

     public TVConstrutor(Double preco) {
        this.preco = preco;
    }
    
    public TVConstrutor(String modelo, Double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    

    public static void main(String[] args) {
        TVConstrutor tv1 = new TVConstrutor();
        tv1.preco = 100D;
        
        TVConstrutor tv2 = new TVConstrutor(199.0);
        System.out.println(tv2.preco);
    }
    
}