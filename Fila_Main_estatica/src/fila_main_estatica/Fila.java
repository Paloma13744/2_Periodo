
package fila_main_estatica;

public class Fila {

    private  Object item[];
    private  int frente,tras;

    public Fila() {
        
    }

    public Fila(int tam) {
        this.item = new Object[tam];
        this.frente =0;
        this.tras = this.frente;
    }
    public boolean vazia(){
        return(this.frente == this.tras);
    }
    public  void inserir(Object x){
        if(this.item.length== this.frente || this.item.length==this.tras){
            System.out.println("Erro!A fila está cheia!");
        }
        else{
            this.item[this.tras] = x;
            this.tras = this.tras + 1;
            System.out.println("Sucesso! Fila possui espaço adequado!");
        }
    }
    public Object retirar(Object chave){
        if(vazia()){
            System.out.println("Erro! Fila está vazia! ");
        }
        Object item = this.item[this.frente];
        this.frente = this.frente + 1;
        return item;
         
    }
    public  void imprime() {
        for (int i = this.frente; i < this.tras; i++) {
            System.out.println( this.item[i].toString());

        }
        //Imprime os elementos da lista do primeiro até (último -1);

    }

   
}
