
package pilha;

import java.util.Scanner;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {  
      Scanner leia = new Scanner(System.in);
      int tamanho,num = 0,soma=0,media;
      Stack<Integer>pilha = new Stack<Integer>();
      /*pilha.push(10);
      pilha.push(20);
      pilha.push(30);
      tamanho = pilha.size();
        for (int i = 0; i < tamanho; i++) {
            System.out.println(pilha.pop());  // Desimpilha;
        }
      
/*
      
      */
    /* while(cont<=num){
         System.out.println("Informe um número:");
         num = leia.nextInt();
         pilha.push(num);
         cont++;
     }
/*
       
      */
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o "+ (i+1) +"ºnúmero:");
            num = leia.nextInt();
            pilha.push(num);
        }
        System.out.println("___________________________________________________________");
        System.out.println("Valores da pilha:");
        for (int i = 0; i < 10; i++) {
            num = pilha.pop();
            System.out.println(num);
            soma+= num;
        }
        System.out.println("___________________________________________________________");
        media = soma/10;
        System.out.println("A soma dos valores dessa pilha será:" + soma);
        System.out.println("A média dos valores dessa pilha será:" + media);
        
      
     
      
      
      
      
    }
    
}
