package pilha_estatica;

public class Pilha_estatica {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        int tam, n;
        pilha.empilhar(1);
        pilha.empilhar(12);
        pilha.empilhar(1);
        pilha.empilhar(9);
        pilha.empilhar(8);
        pilha.empilhar(7);
        
        
        tam = pilha.tamanho();
        System.out.println("Tamanho da pilha:" + tam);
        for (int i = 0; i < 10; i++) {
            n = (Integer) pilha.desempilhar();
        }
        System.out.println("Tamnaho da pilha:" + pilha.tamanho());
    }

}
