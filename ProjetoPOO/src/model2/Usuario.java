
package model2;


public class Usuario extends Pessoa{
    
    protected String senha;
    protected String nivelDeAcesso;

    public Usuario( int id, String nome, String senha) {
        super(nome, id);
        this.senha = senha;
    }

    public Usuario(int id,String nome, String dataDeNascimento, String telefone, String email, String senha, String nivelDeAcesso) {
        super(nome, dataDeNascimento, id, telefone, email);
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
    

    
    

    

    
    
}
