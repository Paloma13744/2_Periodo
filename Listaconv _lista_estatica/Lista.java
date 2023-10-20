package Listaconv;

public class Lista {

    static Object conv[];
    static int primeiro, ultimo;

    public static void Lista(int tam) {
        conv = new Object[tam];
        primeiro = 0;
        ultimo = primeiro;
        //Cria uma lista vazia;
    }

    public static void insere(Object nome) {
        if (ultimo >= conv.length) {  // Tamanho do indice ;
            System.err.println("Erro! Lista está cheia");
        } else {
            conv[ultimo] = nome;  // x : nome digitado;
            ultimo = ultimo + 1;
        }
        return;
        //Insere um convidado ao final da Lista;

    }

    public static boolean vazia() {
        //Testa se há elementos no vetor 'item' e retorna false;       
        return (primeiro == ultimo);

    }

    public static void imprime() {
        for (int i = 0; i < ultimo; i++) {
            System.out.println("Convidado:" + conv[i]);

        }
        //Imprime os convidados  da lista do primeiro até (último -1);

    }

    public static Object pesquisa( Object chave) {
        if (vazia()) {
            System.out.println("Erro!Lista vazia");
        }
        
        int aux = primeiro;
        while((aux< ultimo)&&(!conv[aux].equals(chave))){
            aux++;
        }
        if(aux >= ultimo){
            return null;
        }
        else{
            return conv[aux];
        }
       
        
        //Pesquisa Insere mais um convidado no final da lista;

    }

    public static Object retira(Object chave) {
        if (vazia()) {
            System.out.println("Erro! Lista vazia");
            return null;
        }
        int p = 0;    
        while (p < ultimo && !conv[p].equals(chave)) {
            p++;           
        }
        if (p >= ultimo) {   //it(valor aleatório) não está no vetor;
            return null;
        }
        Object elem = conv[p];

        //Retorna o 1º elemento da lista ,se esta nao estiver vazia;
        ultimo = ultimo - 1;
        for (int i = p; i < ultimo; i++) {
            conv[i] = conv[i +1];
        }
        return elem;

    }

    public static Object retiraPrimeiro() {
        if (vazia()) {
            System.out.println("Erro!Lista vazia");
            return null;
        }
        Object elem = conv[0];

        ultimo = ultimo - 1;
        for (int i = 0; i < ultimo; i++) {
            conv[i] = conv[i + 1];
        }
        //Retorna o 1º elemento da lista ,se não estiver vazia;
        //Variável object : aceita todos os tipos de dados: String,int,double,float
        return elem;

    }



}
