
package recursiv_aedi;

public class Recursiv_AEDI {

    public static void main(String[] args) {
        int s ;
        s = Soma(5);
        System.out.println("s:" + s);
        /*
        Escreva uma função recursiva de nome soma() que recebe um numero inteiro
        positivo n como argumento e retorna a soma dos n primeiros números inteiros. 
        Por exemplo, se a função recebe n = 5, deve retornar 15, pois 15 = 1 + 2 + 3 + 4 + 5.
        */
        
    
    
}
 public static int Soma(int num){
        int n  ;
       
        if(num<=0){
            n =0;
        }
        else{
            n = num + Soma(num -1);
        }
        
        return n;

        
        
        
        
        /*
        Soma(0) =  n =0     Soma(0) = 0;
        Soma(1) =  1 +
        
        
        
        Soma(4) = 4 + Soma( 4 -1)
        r = 4 + 3 = 7
        Soma(5) = r = 5 + (5-1)
        r =  5 + 4 = 9
           
        
        
        
      
           
        
           
          
        */
}


}