
package aprende;


public class Alunos {
    
    private String nome;
    private String cpf;
    private int idade;
    private String ra;

    public Alunos() {
    }
    
    

    public Alunos(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public Alunos(String nome, String cpf, String ra) {
        this.nome = nome;
        this.cpf = cpf;
        this.ra = ra;
    }

    public Alunos(String nome, String cpf, int idade, String ra) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    
    
}
