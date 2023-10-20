/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import model2.Agendamento;
import model2.Cliente;
import model2.Servico;
import model2.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "admin", "09/05/1999", "30212121", "administrativo@petshop.com", "admin", "total");
        Usuario usuario2 = new Usuario(2, "estagiaria", "09/09/1996", "30212122", "estagiario@petshop.com", "abcde", "estagiária");
         
        Cliente cliente1 = new Cliente(32, "Alan Figueiredo",  "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "Rua João Dutra","93300012");
        Cliente cliente2 = new Cliente(45, "Judite Oliveira",  "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "Rua pedro",   "93300045");
        Cliente cliente3 = new Cliente(17, "Paulo Ricado",  "24/04/1997", "30212128", "pauloricardopet@gmail.com",  "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(64, "Augusto",  "20/08/1995", "30212130", "neymarsantospet@gmail.com", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "Debruine Pipoqueiro",  "13/09/1992", "30212131", "debruinepet@gmail.com", "Rua pedro quaresma 784 São Dimas",  "933000847");
        Cliente cliente6 = new Cliente(6, "Matuidi Pareira",  "17/08/1994", "302122324", "matuidipet@gmail.com", "Rua champions 10 Cachoeira",  "933000782");
        Cliente cliente7 = new Cliente(7, "Marta de Souza",  "25/03/1993", "302121292", "martasouzapet@gmail.com", "Rua tesla 215 São Lucas",  "93352012");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari",  "04/03/1990", "302121451", "alineferraripet@gmail.com", "Rua hyrule 32 São João",  "9334714747");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho",  "09/02/1998", "302121189", "samuelcoutinhopet@gmail.com", "Rua floresta 12 Centro ",  "9330046364");
        Cliente cliente10 = new Cliente(10, "Felipe Luis",  "12/06/1999", "3021212478", "felipeluispet@gmail.com", "Rua marechal 1023 Expedicionário",  "933000874");
        
        Servico servico1 = new Servico(1, "Banho e Tosa", 50);
        Servico servico2 = new Servico(2, "Consulta com Veterinário", 180);
        Servico servico3 = new Servico(3, "Banho", 20);
        Servico servico4 = new Servico(4, "Aplicar Vacina", 45);
        Servico servico5 = new Servico(5, "Exames", 200);
        Servico servico6 = new Servico(6, "Internação", 300);

        Agendamento agendamento1 = new Agendamento(32, cliente1, servico3, 30, "14/07/2018 09:30");
       Agendamento agendamento2 = new Agendamento(45, cliente3, servico2, 40, "14/07/2018 10:00");
        Agendamento agendamento3 = new Agendamento(10, cliente4, servico1, 18, "14/07/2018 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        //agendamento.add(agendamento1);
        //agendamento.add(agendamento2);
        //agendamento.add(agendamento3);
        
    }
    
    
}
