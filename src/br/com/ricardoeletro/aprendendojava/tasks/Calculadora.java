package br.com.ricardoeletro.aprendendojava.tasks;

public class Calculadora {
    
    public static void main(String[] args) {
        
        
        //chamar o metodo
        
        
        Calculadora calc = new Calculadora();
        calc.somar(10,20);
            
       
    }
       
    
       public void somar(Integer x, Integer y) {

        Integer total;

        total = x + y;

        System.out.println(total);

    }

}
