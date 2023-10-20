package teste_escola;

import java.util.ArrayList;

public abstract class  Pessoa   {
    private String nome;
    private int RA;
    private int datanas;

    public Pessoa() {
        
    }

    public Pessoa(String nome, int RA, int datanas) {
        this.nome = nome;
        this.RA = RA;
        this.datanas = datanas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public int getDatanas() {
        return datanas;
    }

    public void setDatanas(int datanas) {
        this.datanas = datanas;
    }   
    public void imprimir(String nome){
        System.out.println("Nome da pessoa:" + nome);
    }
    
}