package modelo;
import java.sql.*;
import java.util.*;

/**
 * Encapsula persistência para Livros.
 * @author geraldo
 */
public class LivroDAO
{
	private String     sqlquery;  //Sql
	private Statement  stmt;
	private ResultSet  resultado;
	private int        contador; // Resultado de linhas de updates
	private Connection conecta;
        private String url;
    
        private static LivroDAO instance;

	private LivroDAO()
	{
	}

	private LivroDAO(String url)
	{
          this.url = url;
	}
	
        /**
         * Implementa o singleton.
         * @param url
         * @return
         * @throws SQLException 
         */
	public static LivroDAO getInstance(String url) throws SQLException{
		
		if (instance==null){
			instance = new LivroDAO(url);
			if (instance.conecta() == false){
				throw new SQLException("Não foi possível estabelecer a conexão com o Banco de Dados. Procure o administrador do sistema!");
			}
		}
		return instance;
	}

        /**
         * Tenta conectar com o banco de dados.
        */
        public boolean conecta()
        {
            try
            {
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // Cria instancia do JDBC
            }
            catch(ClassNotFoundException sql)
            {
                System.out.println("Classe nao encontrada");
                return false;
            }

            try
            {
                String bancoDadosURL = "jdbc:ucanaccess://c://ifmg//web//netbeans12_6//dados//LivrariaVirtualDesktop.mdb";
                conecta = DriverManager.getConnection(bancoDadosURL);
                System.out.println(url);
            }
            catch(SQLException sqle)
            {
                System.out.println("Erro de conexao com o banco de dados");
                return false;
            }

            try
            {
                    stmt = conecta.createStatement();
            }
            catch(SQLException sql)
            {
                System.out.println("Erro na cria��o do Statement");
                return false;
            }
	
            return true;
        }

        /**
         * Insere um LivroVO no banco de dados.
         * @param LivroVO
         *
        */
	public int inserir(LivroVO livroVO)
	{

            if (livroVO.getPrateleira()!=null)
            {
                sqlquery = "insert into LIVRO (codigo, nome, autor, preco, dataLancamento, idPrateleira) values ("+
                           livroVO.getCodigo()+",'"+livroVO.getNome()+"','"+livroVO.getAutor()+"',"+livroVO.getPreco()+",'"+livroVO.getDataLancamentoFormatada()
                           +"', "+livroVO.getPrateleira().getCodigo()+")";
            }
            else{ // Livro não tem prateleira
                sqlquery = "insert into LIVRO (codigo, nome, autor, preco, dataLancamento) values ("+
                           livroVO.getCodigo()+",'"+livroVO.getNome()+"','"+livroVO.getAutor()+"',"+livroVO.getPreco()+",'"+livroVO.getDataLancamentoFormatada()
                           +"')";
            }

            System.out.println(sqlquery);
            System.out.println("Data formatada: "+livroVO.getDataLancamentoFormatada());

            try
            {
                    contador = stmt.executeUpdate(sqlquery);
            }
            catch(SQLException e)
            {   
                e.printStackTrace();
                System.out.println(e);
                return 0;
            }
            catch(Exception e)
            {   
                e.printStackTrace();
                System.out.println(e);
                return 0;
            }
            return contador;
	}

        
        /**
         * Altera as informações de um livro no banco de dados.
         * @param LivroVO
         *
        */
	public int alterar(LivroVO livroVO)
	{

            if (livroVO.getPrateleira()!=null)
            {
                sqlquery = "update LIVRO set nome='"+livroVO.getNome()+"',"
                        + " autor='"+livroVO.getAutor()+"',"
                        + " preco="+livroVO.getPreco()+","
                        + " dataLancamento='"+livroVO.getDataLancamentoFormatada()+"',"
                        + " idPrateleira="+livroVO.getPrateleira().getCodigo()                    + " where codigo="+livroVO.getCodigo()+";";
            }
            else{ // Livro não tem prateleira
                sqlquery = "update LIVRO set nome='"+livroVO.getNome()+"',"
                        + " autor='"+livroVO.getAutor()+"',"
                        + " preco="+livroVO.getPreco()+","
                        + " dataLancamento='"+livroVO.getDataLancamentoFormatada()+"' "
                        + " where codigo="+livroVO.getCodigo()+";";
            }
            
            System.out.println("sqlquery: " + sqlquery);
            
            try
            {
                    contador = stmt.executeUpdate(sqlquery);
            }
            catch(SQLException sql)
            {
                    return 0;
            }
            return contador;
	}

        /**
         * Exclui um livro do banco de dados.
         * @param LivroVO
         *
        */
	public int excluir(int codigo)
	{

            sqlquery = "delete * from LIVRO where codigo="+codigo+";";
            try
            {
                contador = stmt.executeUpdate(sqlquery);
            }
            catch(SQLException sql)
            {
                return 0;
            }
            return contador;
	}

        /**
         * Seleciona todos os banco de dados
         * @return todos os livros.
        */
        public ArrayList<LivroVO> selecionaTodosLivros()
        {

            ResultSet rs = null;
            
            sqlquery = "select codigo, nome, autor, preco, dataLancamento, idPrateleira from LIVRO";

            System.out.println("SQL: " + sqlquery);
            ArrayList<LivroVO> listaLivros = new ArrayList<LivroVO>();

	    try
	    {
                rs = stmt.executeQuery(sqlquery);

                while(rs.next())
                {
                    LivroVO livroVO=new LivroVO(rs.getInt("codigo"), rs.getString("nome"), rs.getString("autor"),
                        rs.getDouble("preco"), rs.getDate("dataLancamento"));
                    listaLivros.add(livroVO);
                }
            }
            catch(SQLException sql)
            {
                System.out.println("Erro SQL" + sql);
		return null;
	    }
            return listaLivros;
        }
	
        /**
         * Seleciona livros por gênero.
         * @param genero
         * @return livros por gênero.
         */
        public ArrayList<LivroVO> selecionaLivrosPorGenero(int codigoPrateleira)
        {

            ResultSet rs = null;
            sqlquery = "SELECT codigo, nome, autor, preco, dataLancamento " +
                                    "FROM LIVRO WHERE (((idPrateleira)=" + codigoPrateleira+ "));";

            System.out.println("SQL: " + sqlquery);
            ArrayList<LivroVO> listaLivros = new ArrayList<LivroVO>();

	    try
	    {
                rs = stmt.executeQuery(sqlquery);

                while(rs.next())
                {
                    LivroVO livroVO=new LivroVO(rs.getInt("codigo"), rs.getString("nome"), rs.getString("autor"),
                        rs.getDouble("preco"), rs.getDate("dataLancamento"));
                    listaLivros.add(livroVO);
                }
            }
            catch(SQLException sql)
            {
                System.out.println("Erro SQL" + sql);
		return null;
	    }
            return listaLivros;
        }
		

        /**
         * Fecha a conexão com o banco de dados.
         */
        public void close()
	{
		try
		{
			conecta.commit();
			conecta.close();
		}
		catch(SQLException sql)
		{
		}
	}

    /**
     * Confirmar as alterações no banco de dados.
    */
    public void commit()
    {
        try
        {
                conecta.commit();
        }
        catch(SQLException sql)
        {
        }
    }
        
    /**
     * Verifica se um usuário tem cadastro no bando de dados.
     * @param usuario
     * @param senha
     * @return true se o usuário é cadastro, false caso contrário.
     */
    public boolean temCadastro(String login, String senha)
    {

            ResultSet rs = null;
            sqlquery = "SELECT login, senha, dataCriacao " +
                                    "FROM USUARIO WHERE (((login)=\'" + login + "\') AND ((senha)=\'"+senha+"\'));";
            System.out.println("SQL: " + sqlquery);

            try
            {
                rs = stmt.executeQuery(sqlquery);
                System.out.println("Sql executado..."+rs);

            while(rs.next())
            {
                System.out.println("Recuperado: Usu�rio: " + rs.getString(1) + " Senha: " + rs.getString(2));;
                        return true;
            }
            }
            catch(SQLException sql)
            {
                System.out.println("Erro SQL" + sql);
                    return false;
                }
            return false;
        }
    /**
     * Seleciona um livro.
     * @param usuario
     * @param senha
     * @return true se o usuário é cadastro, false caso contrário.
     */
    public LivroVO pesquisar(int codigoLivro)
    {
        LivroVO livroVO=null;
        ResultSet rs = null;
        sqlquery = "SELECT codigo, nome, autor, preco, dataLancamento " +
                                "FROM LIVRO WHERE (((codigo)=" + codigoLivro+ "));";

        System.out.println("SQL: " + sqlquery);
        

        try
        {
            rs = stmt.executeQuery(sqlquery);

            while(rs.next())
            {
                livroVO=new LivroVO(rs.getInt("codigo"), rs.getString("nome"), rs.getString("autor"),
                    rs.getDouble("preco"), rs.getDate("dataLancamento"));
                break;
            }
        }
        catch(SQLException sql)
        {
            System.out.println("Erro SQL" + sql);
            return null;
        }
        return livroVO;
    }
}
