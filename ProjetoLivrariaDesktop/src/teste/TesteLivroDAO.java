package teste;

import modelo.LivroDAO;
import modelo.PrateleiraVO;
import modelo.LivroVO;
import java.util.Collection;
import java.util.Iterator;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class TesteLivroDAO {

	  public static void main(String[] s) {
		  
		LivroDAO dao = null;
		
		try{
			dao = LivroDAO.getInstance("Livraria");
		}
		catch(SQLException e){
                    e.printStackTrace();
			System.out.println("Erro com o Banco de Dados!");
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("Erro Fatal!");
			System.exit(0);
		}
                
                LivroVO livroVO = new LivroVO(12, "Cálculo!!!", "José", 85);
                PrateleiraVO prateleiraVO = new PrateleiraVO(1, "Livros de Cálculo");
                
                livroVO.setPrateleira(prateleiraVO);
                if (dao.inserir(livroVO)>0){
                    dao.commit();
                    System.out.println("Sucesso na operação!!!");
                }
                else{
                    
                    System.out.println("Erro!!!");
                }

                /** Teste de alteração do livro */
                livroVO.setAutor("Novo Autor");
                livroVO.setDataLancamento(new Date(System.currentTimeMillis()));
                livroVO.setPreco(111);
                if (dao.alterar(livroVO)>0){
                    dao.commit();
                    System.out.println("Dados do livro alterados com sucesso!");
                }
                else{
                    
                    System.out.println("Erro na alteração do livro!!!");
                }
                
                ArrayList<LivroVO> lista = dao.selecionaTodosLivros();
                
                for (int i=0; i< lista.size(); i++){                    
                    System.out.println("Livro: " + lista.get(i));                    
                }        
	  }
}

