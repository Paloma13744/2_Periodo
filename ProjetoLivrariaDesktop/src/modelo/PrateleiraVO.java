/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author geraldo
 */
public class PrateleiraVO {

    private int codigo;
    private String descricao;
    protected ArrayList<LivroVO> livros;

    public PrateleiraVO(int codigo) {
        this.codigo = codigo;
        this.descricao = "Sem descricao";
        livros=new ArrayList<LivroVO>();
    } 
    
    public PrateleiraVO(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        livros=new ArrayList<LivroVO>();
    }    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int adicionarLivro(LivroVO livro){
        livros.add(livro);
        return 1;
    }
    
    public int removerLivro(LivroVO livro){
        int contador=0;
        for (int i=0; i<livros.size();i++){
            if(livros.get(i).getCodigo()==livro.getCodigo()){
                if (livros.remove(livros.get(i))){
                    contador++;
                }
            }
        }
        return contador;        
    }
    public LivroVO pesquisarLivro(int codigo){

        for (int i=0; i<livros.size();i++){
            if(livros.get(i).getCodigo()==codigo){
                return livros.get(i);
            }
        }
        return null;
    }
    
    public int atualizar(LivroVO livro){
        LivroVO temp=null;
        int numeroRegistrosAlterados=0;
        for (int i=0; i<livros.size();i++){
            temp=livros.get(i);
            if(temp.getCodigo()==livro.getCodigo()){
                temp.setNome(livro.getNome());
                temp.setAutor(livro.getAutor());
                temp.setPreco(livro.getPreco());
                temp.setDataLancamento(livro.getDataLancamento());
                numeroRegistrosAlterados=1;
            }
        }
        return numeroRegistrosAlterados;
    }
    
    public void imprimirLivros(){

        LivroVO temp=null;
        System.out.println("Livros da agência: "+codigo+" descricao: "+descricao);
        for (int i=0; i<livros.size();i++){
            temp=livros.get(i);
            System.out.println(temp.toString());
        }
    }    
            
}
