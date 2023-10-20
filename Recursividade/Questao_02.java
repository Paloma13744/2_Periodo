
package recursiv_aedi;

public class Questao_02 {
    public static void main(String[] args) {
        
        
        System.out.println("Potencial:" + potencia(2,3));
        /*
       Escreva uma função recursiva chamada potencia() que aceite dois argumentos
inteiros positivos i e j. A função retorna o i elevado à potencia j; Por exemplo,
potencial (2,3) é igual a 8.
        */
}
    public static int potencia(int a ,int b){
        if(b==1){
            return a;
        }
        
        return a * potencia(a,b-1);
    }
}

