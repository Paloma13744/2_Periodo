package listas_aedi;

public class Listas_Aedi {

    public static void main(String[] args) {
        //Criando lista;
        Lista.Lista(10);
        //criou-se uma lista de 10 elementos;

        Lista.insere(7);
        Lista.insere(22);
        Lista.insere(1);
        Lista.insere(10);
        Lista.insere(3);
        Lista.insere(9);
        
        Lista.imprime();
        
        Lista.retira(10);
        Lista.retira(9);
        Lista.retira(1);
        
     
        Lista.imprime();
        
        System.out.println(Lista.pesquisa(3));

    }

}
