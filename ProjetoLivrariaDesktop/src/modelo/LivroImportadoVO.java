/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author geraldo
 */
public class LivroImportadoVO extends LivroVO{
    private double aliquotaImportacao;
    private double precoTotal;

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
        
    public LivroImportadoVO(){
    }

    public LivroImportadoVO(int codigo, String nome, String autor, double preco, double aliquotal){
        super(codigo, nome, autor, preco);
        this.aliquotaImportacao=aliquotaImportacao;
    }
    
    public LivroImportadoVO(PrateleiraVO prateleira, int codigo, String nome, String autor, double preco, double aliquotal){
        super(prateleira, codigo, nome, autor, preco);
        this.aliquotaImportacao=aliquotaImportacao;
    }
    
    public double getAliquotaImportacao() {
        return aliquotaImportacao;
    }

    public void setAliquotaImportacao(double aliquotaImportacao) {
        this.aliquotaImportacao = aliquotaImportacao;
    }

    
}
