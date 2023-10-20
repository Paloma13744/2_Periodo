package listamaindinamica;

public class Lista {

    private static class Celula {

        Object item;
        Celula prox;
    }
    private Celula primeiro, ultimo, pos;

    public Lista() {
        this.primeiro = new Celula(); // cria-se uma lista vazia ;
        this.pos = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }

    public void InserePrimeiro(Object item) {
        Celula aux = this.primeiro.prox;
        this.primeiro.prox = new Celula();   // Criou - se o Celula dentro do prox do primeiro;
        this.primeiro.prox.item = item;   // Variável da célula que armazena o valor ;
        this.primeiro.prox.prox = aux;
    }

    public void Insere(Object x) {

        this.ultimo.prox = new Celula();   // Criou - se o Celula dentro do prox do primeiro;
        this.ultimo = this.ultimo.prox;   // Variável da célula que armazena o valor ;
        this.ultimo.item = x;
        this.ultimo.prox = null;
    }

    public void imprime() {
        Celula aux = this.primeiro.prox;
        while (aux != null) {
            System.out.println(aux.item.toString());
            aux = aux.prox;
        }

    }

    public Object Pesquisar(Object chave) {

        if (vazia()) {
            System.out.println("Erro!Lista vazia");
        }
        if (this.vazia() || chave == null) {
            return null;
        }
        Celula aux = this.primeiro;   // Criou-se uma Celula para auxiliar dentro do while ;
        while (aux.prox != null) {     // Se próximo item de aux for diferente de nulo , a condição será verdadeira ;
            if (aux.prox.item.equals(chave)) {
                return true;
            }
            aux = aux.prox;    // Aux passa para próximo item ,para continuar procurando;  // Aux recebe a próxima célula;
        }
        return false;   // Se não,  o resultado retornará negativo;

    }

    public boolean vazia() {
        return (this.primeiro == this.ultimo); // Retorna se a lista está vazia ou não;
    }

    public Object Retirar(Object chave) throws Exception{
        /*Celula aux = this.primeiro;    // Celula auxiliar recebe o primeiro número;
         Celula q = aux.prox;           // Crio-se uma celula chamada q ,para receber o aux.prox que passará de item a item ,procurando a chave ;
         Object item = q.item;          // Criou-se o objeto item ;
         aux.prox = q.prox;    
         if(aux.prox == null){
             this.ultimo = aux;
         }
        return item;
    }
/*
        
         */
        if (this.vazia() || chave == null) {
            throw new Exception("Erro! Lista vazia ou chave imválida !");
        }
        Celula aux = this.primeiro;
        while (aux.prox != null && !aux.prox.item.equals(chave)) {
            aux = aux.prox;
        }
        if (aux.prox == null) {
            return null;
        }
        Celula q = aux.prox;
        Object item = q.item;
        aux.prox = q.prox;
        if (aux.prox == null) {
            this.ultimo = aux;
        }

        return item;
    }
}
