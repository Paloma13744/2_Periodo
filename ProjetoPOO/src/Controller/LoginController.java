
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import model2.Usuario;
import View.Login;
import View.MenuPrincipal;

// Criada essa classe devido o mvc para que atraves do controller ele manda 
//mensagem para o view
public class LoginController {
    
     private final Login view;
     private LoginHelper helper;
     
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entrarNoSistema(){
        //Pegar o usu�rio da view 
        Usuario usario = helper.obterModelo();
        
    //Pesquisar o usu�rio no banco
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usario);
    
    if(usuarioAutenticado != null){
        //navegar para menu principal
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
    }else{
        view.exibeMensagem("Usu�rio ou senha inv�lidos");
    }
    //Se o usuario da view tiver o mesmo usuario que veio do banco, direcionar para o menu
    //Sen�o vou mostrar uma mensagem ao usuario "Usuario ou senha inv�lidos.
    
    
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    
}
