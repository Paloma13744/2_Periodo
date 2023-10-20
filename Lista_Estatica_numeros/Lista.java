package listas_aedi;

public class Lista {

    static int item[];
    static int primeiro, ultimo;

    public static void Lista(int tam) {
        item = new int[tam];
        primeiro = 0;
        ultimo = primeiro;
        //Cria uma lista vazia;
    }

    public static void insere(int x) {
        if (ultimo >= item.length) {  // Tamanho do indice ;
            System.err.println("Erro! Lista está cheia");
        } else {
            item[ultimo] = x;  // x : numero digitado;
            ultimo = ultimo + 1;
        }
        return;
        //Insere um elemento ao final da Lista;

    }

    public static boolean vazia() {
        //Testa se há elementos no vetor 'item' e retorna false;       
        return (primeiro == ultimo);

    }

    public static void imprime() {
        for (int i = 0; i < ultimo; i++) {
            System.out.println("Número:" + item[i]);

        }
        //Imprime os elementos da lista do primeiro até (último -1);

    }

    public static Object pesquisa(int chave) {
        if (vazia()) {
            System.out.println("Erro!Lista vazia");
        }
        
        int aux = primeiro;
        while((aux< ultimo)&&(item[aux]!=chave)){
            aux++;
        }
        if(aux >=ultimo){
            return null;
        }
        else{
            return item[aux];
        }
       
        
        //Pesquisa Insere mais um elemento no final da lista;

    }

    public static Object retira(int chave) {
        if (vazia()) {
            System.out.println("Erro!Lista vazia");
            return null;
        }
        int p = 0;
        while (p < ultimo && item[p] != chave) {
            p++;
        }
        if (p >= ultimo) {   //it(valor aleatório) não está no vetor;
            return null;
        }
        Object elem = item[p];

        //Retorna o 1º elemento da lista ,se esta nao estiver vazia;
        ultimo = ultimo - 1;
        for (int i = p; i < ultimo; i++) {
            item[i] = item[i +1];
        }
        return elem;

    }

    public static Object retiraPrimeiro() {
        if (vazia()) {
            System.out.println("Erro!Lista vazia");
            return null;
        }
        Object elem = item[0];

        ultimo = ultimo - 1;
        for (int i = 0; i < ultimo; i++) {
            item[i] = item[i + 1];
        }
        //Retorna o 1º elemento da lista ,se não estiver vazia;
        //Variável object : aceita todos os tipos de dados: String,int,double,float
        return elem;

    }

}
