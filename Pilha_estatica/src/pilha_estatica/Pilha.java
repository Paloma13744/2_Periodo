
package pilha_estatica;

public class Pilha {
    private Object item[];
    private int topo;

  
    public Pilha(int tam) {    //pilha vazia;
        this.item = new Object[tam];
        this.topo = -1;
    }
    public void  empilhar(Object x){
        if(this.topo + 1 == this.item.length){
            System.out.println("Erro!Pilha está vazia!");
        }
        else{
            this.topo = this.topo + 1;
            this.item[this.topo] = x;
        }
    }
    public boolean vazia(){
        return(this.topo == -1);
    }
    public Object desempilhar(){
        if(this.vazia()){
        System.out.println("Erro!Pilha está vazia");
        return null;
    }
        this.topo = this.topo -1;
        return this.item[this.topo+1];
    }
    public int tamanho(){
        return this.topo + 1;
    }
    public void imprime(){
        for (int i = topo; i >=0; i--) {
            System.out.println(item[i]);
        }
    }
   
  
}


