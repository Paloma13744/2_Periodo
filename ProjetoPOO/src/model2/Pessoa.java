
package model2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;




abstract class Pessoa {
    
    protected String nome;
    protected Date dataDeNascimento;
    protected int id;
    protected String telefone;
    protected String email;
    
    

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Pessoa(String nome, String dataDeNascimento, int id, String telefone, String email) {
        this.nome = nome;
        try {
            this.dataDeNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.id = id;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


   
    
    
}
