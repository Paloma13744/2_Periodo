package teste_escola;
import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private int cargahoraria;
    private ArrayList<Professor> professor;
    private ArrayList<Turma> turmas;

    public Disciplina() {

    }

    public Disciplina(String nome, int cargahoraria) {
        this.nome = nome;
        this.cargahoraria = cargahoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(ArrayList<Professor> professor) {
        this.professor = professor;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
