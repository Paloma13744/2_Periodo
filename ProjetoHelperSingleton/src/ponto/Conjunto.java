
package ponto;

import java.util.ArrayList;

public class Conjunto {

    private int codigo;
    private String descricao;
    private ArrayList listaPontos;
    
    public Conjunto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        listaPontos=new ArrayList();
    }
    
    public int getCodigo(){
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList getListaPontos() {
        return listaPontos;
    }

    public void setListaPontos(ArrayList listaPontos) {
        this.listaPontos = listaPontos;
    }

    @Override
    public String toString() {
        return "Conjunto{" + "codigo=" + codigo + ", descricao=" + descricao + ", listaPontos=" + listaPontos + '}';
    }
    
    public int adicionar(Ponto ponto){
	listaPontos.add(ponto);
        return 1;
    }
    
    public void excluirPonto(Ponto ponto){	
        // exclui o objeto ponto do ArrayList e retorne o número de objetos excluídos.
    }

    public void listarPontos(){
        Ponto p=null;
        System.out.println("Início listarPontos");
        for(int i=0;i<listaPontos.size();i++){
            p=(Ponto)listaPontos.get(i);
            System.out.println(p);
        }
        System.out.println("fim listarPontos");
    }
    

    
    
 
}
