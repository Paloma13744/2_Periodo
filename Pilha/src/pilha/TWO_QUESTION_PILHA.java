package pilha;

import java.util.Scanner;
import java.util.Stack;
/*
Faça um programa em Java utilizando a biblioteca Stack que armazene uma
sequencia de n números double digitados pelo usuário. Imprima os valores da
pilha. Imprima o menor e o maior valor da pilha.
*/
public class TWO_QUESTION_PILHA {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<Double>pilha = new Stack<Double>();        
        double  num,tamanho,maior=0,menor=1800;
        int quantidade;
        
        System.out.println("Quantos números você gostaria de digitar?");
        quantidade = leia.nextInt();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o número desejado");
            num = leia.nextDouble();
            if(num>maior){
                maior = num;
            }
            if(num<=menor){
                menor = num;
            }
            pilha.push(num);
        }
        System.out.println("___________________________________________________________");
        System.out.println("Valores da pilha:");
        
        System.out.println("O maior valor digitado é:" + maior);
        System.out.println("O menor valor digitado é:" + menor);
        
        
        
         
        
    }
}
