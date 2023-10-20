
package listamaindinamica;

public class ListaMainDinamica {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.Insere(4);
        lista.Insere(14);
        lista.imprime();
        lista.Retirar(4);
        lista.imprime();
    }
    
}
