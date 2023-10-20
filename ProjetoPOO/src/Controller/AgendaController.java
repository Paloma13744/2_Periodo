
package Controller;

import Controller.Helper.AgendaHelper;
import model2.Agendamento;
import model2.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import model2.Servico;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    public void atualizaTabela(){
        //Buscar uma lista com os Agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir a lista na View
        
        helper.preecherTabela(agendamentos);
        
       
        
    }
    
    public void atualizaCliente(){
        
        //Buscar os clientes do banco de dados 
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //Exibir os clientes no comboBox Cliente
        helper.preencherCliente(clientes);
        
    }
    
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();
         ArrayList<Servico> servicos = servicoDAO.selectAll();
         
         helper.preecherServico(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
       //Buscar Objeto agendamento da tela 
       Agendamento agendamento = helper.obterModelo();
       //Salvar Objeto no banco de dados
       new AgendamentoDAO().insert(agendamento);
       //Insere elemento na tabela
       atualizaTabela();
       helper.limparTela();
    }
    
    
}
