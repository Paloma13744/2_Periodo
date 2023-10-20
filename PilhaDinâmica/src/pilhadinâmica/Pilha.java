package pilhadinâmica;

public class Pilha {

    private static class Celula {

        Object item;
        Celula prox;
    }
    private Celula topo;
    private int tam;

    public Pilha() {
        //Inicia  a pilha;
    }

    
    public Pilha(int tam) {
        this.topo = null;    // Criou-se uma pilha vazia;
        this.tam =0 ; 
    }
    
    public boolean vazia(){
        return(this.topo == null);
    }
    public int tamanho(){
        return this.tam =0;
    }
           
    public void empilhar(Object x) {
        Celula aux = this.topo;     // antigo topo;  // Criou-se uma Celula auxiliar ;
        this.topo= new Celula();    // Novo topo;    Criando novo item + prox;
        this.topo.item =  x;      // Adiciona o elemento que o usuário deseja;
        this.topo.prox = aux; // prox recebe o antigo topo;
        this.tam++;
 
    }
    
    public Object desempilhar() throws Exception {  //Remove do topo para baixo ,regra!!!
        if (this.vazia()) {
           throw new Exception("Erro! Pilha vazia");
        }
           Object item = this.topo.item;
           this.topo = this.topo.prox;    // topo anterior;
           this.tam--;

        return item;
    }

}
