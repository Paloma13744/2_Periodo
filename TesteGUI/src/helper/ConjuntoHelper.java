package helper;

import ponto.Conjunto;
import java.util.ArrayList;

public class ConjuntoHelper {

    private ArrayList listaConjunto;

    private static ConjuntoHelper instance;

    private ConjuntoHelper() {
        listaConjunto = new ArrayList();
    }

    public static synchronized ConjuntoHelper getInstance() {
        if (instance == null) {
            instance = new ConjuntoHelper();
        }

        return instance;
    }

    public ArrayList getListaConjunto() {
        return listaConjunto;
    }

    public void addConjunto(Conjunto conjunto) {
        listaConjunto.add(conjunto);
    }

    /**
     * // java doc : (/**) Adicionar um conjunto ao Helper.
     *
     * @param conjuntoCodigo a ser adicionado.
     * @return
     */
    public int excluir(int conjuntoCodigo) {
        int quantidadeRemovidos = 0;
        Conjunto temp = null;
        for (int i = 0; i < listaConjunto.size(); i++) {
            temp = (Conjunto) listaConjunto.get(i);
            if (conjuntoCodigo == temp.getCodigo()) {
                listaConjunto.remove(i);
                quantidadeRemovidos++;
            }
        }
        return quantidadeRemovidos;
    }

    public Conjunto pesquisar(int codigoConjunto) {
        Conjunto temp = null;
        for (int i = 0; i < listaConjunto.size(); i++) {
            temp = (Conjunto) listaConjunto.get(i);
            if (codigoConjunto == temp.getCodigo()) {
                return temp;
            }
        }
        return null;

    }
    public int alterar(Conjunto conjunto) {
        Conjunto temp = null;
        int totalObjetos=0;
        for (int i = 0; i < listaConjunto.size(); i++) {
            temp = (Conjunto) listaConjunto.get(i);
            if (temp.getCodigo() == conjunto.getCodigo()) {
                temp.setDescricao(conjunto.getDescricao());
                totalObjetos++;
            }
        }
        return totalObjetos;

    }
    

}
