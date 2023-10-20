
package Listaconv;

public class ClasseMainConvidados {
    public static void main(String[] args) {
        
     Lista.Lista(5);
     Lista.insere("Ana");
     Lista.insere("Paulo");
     Lista.insere("Bianca");
     
     Lista.insere("Luna");
     Lista.imprime();
     
     Lista.retira("Luna");
     System.out.println("****************");
     Lista.imprime();
     
     
     
    }
}
