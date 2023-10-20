
package Controller.Helper;

import model2.Agendamento;
import model2.Cliente;
import model2.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class AgendaHelper implements IHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preecherTabela(ArrayList<Agendamento> agendamentos) {
       
        // Na vari�vel tablelModel temos acesso ao conte�do, � necess�rio fazer o cast para adequar a Default
       DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamentos().getModel();
       //Come�ando do linha 0
       tableModel.setNumRows(0);
       
       //Percorrer a lista preenchendo o tablel model
       
        //Usando um for it
        // Objeto e elemento, dentro do for eu tenho uma vari�vel agendamento entre a lista de agendamentos
       
        for (Agendamento agendamento : agendamentos) {
           //preciso adicionar linhas 
           tableModel.addRow(new Object[] {
           
               //setando as colunas
               agendamento.getId(),
               agendamento.getCliente().getNome(),
               agendamento.getServico().getDescricao(),
               agendamento.getValor(),
               agendamento.getDataFormatada(),
               agendamento.getHoraFormatada(),
               agendamento.getObservacao()
           
        });
       
    }
    
    }

    public void preencherCliente(ArrayList<Cliente> clientes) {
        
        //Transformando em um model padr�o 
        
        DefaultComboBoxModel comboBoxModel =(DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente); // Aqui est� onde pega as informa��es
        }
    }

    public void preecherServico(ArrayList<Servico> servicos) {
      
        DefaultComboBoxModel comboBoxModel =(DefaultComboBoxModel) view.getJComboBoxServico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico); // Aqui est� onde pega as informa��es
        }
    }

    public Servico obterServico() {
       return (Servico)view.getJComboBoxServico().getSelectedItem();
       
    }
    
    public Cliente obterCliente() {
       return (Cliente)view.getjComboBoxCliente().getSelectedItem();
       
    }
    
   

    public void setarValor(float valor) {
       view.getjTextFieldValor().setText(valor+""); // Quando eu concateno de um inteiro com uma String toda oper��o vira String
    }

    /**
     *
     * @return
     */
    @Override
    public Agendamento obterModelo() {
        // Passando de String para inteiro
        
        String idString = view.getjTextField_ID().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getjTextFieldValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextFieldData().getText();
        String hora = view.getjTextFieldHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor ,dataHora, observacao);
        System.out.println(agendamento.getId());
        System.out.println(agendamento.getData());
        System.out.println(agendamento.getCliente());
        System.out.println(agendamento.getObservacao());
        return agendamento;

    }

    @Override
    public void limparTela() {
        
        view.getjTextField_ID().setText("");
        view.getjTextFieldData().setText("");
        view.getjTextFieldHora().setText("");
        view.getjTextObservacao().setText("");
    }
    
   
    
}
