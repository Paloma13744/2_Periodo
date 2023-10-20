
package model2;


public class Main {

    
    public static void main(String[] args) {
        
        String nome = "tiago";
        System.out.println(nome);
        
        Servico servico = new Servico(0001, "Banho e Tosa", 300);
        System.out.println(servico.getValor());
        System.out.println(servico.getDescricao());
        
        Cliente cliente = new Cliente("Rua5","1829219", "Thiago", 0001);
        System.out.println(cliente.getCep());
        
        Usuario usuario = new Usuario(10032, "Thiago", "1234");
        System.out.println(usuario.getNome());
        
        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "26/07/2018 09:15"); 
        
        System.out.println(agendamento.getCliente().getNome());
    }
    
}
