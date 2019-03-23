
package br.com.ricardoeletro.apendendojava.po;


public class Smartphone {
    String cor;
    Integer ram;
    Double tamanhoDisplay;
    String modelo;
    
    
       
    
    public static void main(String[] args) {
  
        Smartphone s9=new Smartphone();
      
   s9.cor="Preto";
   s9.ram=4;
   s9.tamanhoDisplay=5.8;
   s9.modelo="Galaxy s9";
     
   
   
   Smartphone j6=new Smartphone();
   
   j6.cor="Violeta";
   j6.ram=2;
   j6.tamanhoDisplay=5.6;
   j6.modelo="Galaxy J6";
   
   
   
   Smartphone[] phones = new Smartphone[10];
   phones[0]=j6;
   phones[1]=s9;
   
   
   
        
        
        
        
    }
            
   
    public void calcularTotal(){
        
        
        
        
    }
    
    
    
    
    
}
