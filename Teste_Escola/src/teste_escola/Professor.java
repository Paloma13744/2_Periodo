package teste_escola;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private String nome;
    private int RA;
    private double salario;
    private int datanas;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    public Professor() {
        
    }

    public Professor(String nome, int RA, int datanas) {
        super(nome, RA, datanas);
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


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDatanas() {
        return datanas;
    }

    public void setDatanas(int datanas) {
        this.datanas = datanas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    public void aplicarProva(){
        
    }

}
