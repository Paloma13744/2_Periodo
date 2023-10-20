/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author geraldo
 */
public class LivroVO {
    
    protected int codigo;
    protected String nome;
    protected String autor;
    protected double preco;
    protected Date dataLancamento;
    protected PrateleiraVO prateleira;

    @Override
    public String toString() {
        return "LivroModel{" + "codigo=" + codigo + ", nome=" + nome + ", autor=" + autor + ", preco=" + preco + ", dataLancamento=" + dataLancamento + ", prateleira=" + prateleira + '}';
    }
    
    public LivroVO(){
        
    }
    public LivroVO(int codigo){
        this.codigo=codigo;
    }    
    public LivroVO(int codigo, String nome, String autor, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        dataLancamento = new Date(System.currentTimeMillis());
    }     
    public LivroVO(PrateleiraVO prateleira, int codigo, String nome, String autor, double preco) {
        this(codigo, nome, autor, preco);
        this.prateleira=prateleira;
    }    

    public LivroVO(int codigo, String nome, String autor, double preco, Date dataLancamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LivroVO other = (LivroVO) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public PrateleiraVO getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(PrateleiraVO prateleira) {
        this.prateleira = prateleira;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public String getDataLancamentoFormatada() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataLancamento);
        String dataFormatada = ""+calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR);
        return dataFormatada;
    }    
}
