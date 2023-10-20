package teste_escola;

public class Aluno extends Pessoa {

    private int RA;
    private String nome;

    private Turma turma;  // Associação

    public Aluno() {

    }

    public Aluno(String nome, int RA, int datanas) {
        super(nome, RA, datanas);
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void realizarProva() {
    
    }

    public void imprimir() {
        System.out.println("Nome da pessoa:" + this.getNome());
        System.out.println("Ra:" + this.getRA());
    }
}
