
package br.com.ricardoeletro.aprendendojava.wrapper;

public class Wapper {
    public static void main(String[] args) {
        Character chars = 'a';
        Boolean booleans = false;
        Byte bytes = 1;
        Short shorts = 1;
        Integer ints = 1;
        Long longs = 1L;
        Float floats = 1.0F;
        Double doubles = 1.0D;
        Double doubles2 = 1.0D;
        
        //String str = doubles.toString();
        //System.out.println(str);
        
        System.out.println( doubles == doubles2);
        
        System.out.println( doubles.equals(doubles2) );
        
        if(doubles.equals(doubles2)){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
        
       int resultdo = doubles.compareTo(doubles2);
        if( resultdo == 0 ){
            System.out.println("IGUAIS");
        }else{
            System.out.println("DIFERENTE");
        }
        
    }
}