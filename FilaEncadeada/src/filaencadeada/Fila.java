
package filaencadeada;

public class Fila {

  
    private static class Celula{
        Object item;
        Object prox;        
    }
    private Celula frente;
    private Celula tras;
    
    public Fila(){  // fila vazia
        this.frente = new Celula();
        this.tras = this.frente;
        this.frente.prox = null;
    }
    public boolean vazia(){
        return(this.frente== this.tras);
    }
    public void enfileirar(Object x){
        this.tras.prox = new Celula();
        this.tras =  (Celula) this.tras.prox;
        this.tras.item = x;
        this.tras.prox = null;   
        
    }
    public Object desenfileirar()throws Exception{
        Object item = null;
        if(this.vazia()){
            throw  new Exception("Erro! A fila está vazia");
        }
      this.frente = (Celula) this.frente.prox;
      item = this.frente.item;
      return item;
    }
    public void imprime(){
        Celula aux ;
        aux = (Celula) this.frente.prox;
        while(aux != null){
            System.out.println("" + aux.toString());
        aux = (Celula) aux.prox;
    }
        System.out.println();
    }
    
    
}
