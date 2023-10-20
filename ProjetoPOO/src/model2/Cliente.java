
package model2;



public class Cliente extends Pessoa{
    
    
    private String endereco;
    private String cep;

    public Cliente(String endereco, String cep, String nome, int id) {
        super(nome, id);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id,String nome, String dataDeNascimento, String cep,String email, String endereco,  String telefone ) {
        super(nome, dataDeNascimento, id, telefone, email);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    // Observação para sobrescrever e colocar o nome ao invés da referência
   @Override
   public String toString(){
      return getNome(); 
   }

   
    
}
