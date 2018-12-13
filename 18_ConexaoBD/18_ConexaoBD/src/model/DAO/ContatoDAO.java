package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Contato;
import util.Conexao;
import util.Teclado;



public class ContatoDAO {

	String stringconecta = "jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC,com.mysql.cj.jdbc.Driver,gilberto,1234";
	
	public static Contato inserir(String nome, String email, String mensagem) {
		Contato contato = null;
		try {
			// Criação do insert
			String sql = "insert into contato (nome, email, mensagem) values (?,?,?)";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "gilberto",
					"1234");
			// Abrir a conexão
			Connection con = conex.obterConexao();
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);
			// Comando executado
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		contato = new model.Contato(nome, email, mensagem);
		return contato;
	}

	public static Contato[] buscarTodos() {
		Contato[] contatos = null;
		try {
			// Crição do select
			String sql = "Select * from contato";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "gilberto",
					"1234");
			Connection con = conex.obterConexao();
			/*
			 * Executa a confirmação direta de acesso ao banco pois não são necessárias
			 * informações para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();
			/*
			 * ResultSet - Classe java que monta em memória uma matriz com a resposta das
			 * linhas do banco de dados
			 */
			ResultSet rs = comando.executeQuery(sql);
			// vetor de objetos
			contatos = new Contato[10];
			/*
			 * Executa a confirmação direta de acesso ao banco pois não são necessárias
			 * informações para a Query (caracter curinga)
			 */
			Statement comando2 = con.createStatement();
			/*
			 * ResultSet - Classe java que monta em memória uma matriz com a resposta das
			 * linhas do banco de dados
			 */
			ResultSet rs1 = comando2.executeQuery(sql);
			// vetor de objetos
			contatos = new Contato[10];
			// É necessário encerrar o acesso ao banco para liberar a conexão
			rs1.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contatos;
	}
	
	public static Contato excluir(int id) throws SQLException{
		// Criação do delete
		
		String sql = "delete from contato where id = ?";
		Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "gilberto",
				"1234");
		Connection con = conex.obterConexao();
		PreparedStatement comando = con.prepareStatement(sql);
		comando.setInt(1,id);
		comando.executeUpdate();
		return null;
		
		
	}
	
	public void apagarMensagem() throws SQLException {
		System.out.println("====================================");
		System.out.println(" Apagar Mensagem ");
		System.out.println("====================================");
		int id = Teclado.LerInt("Digite o número da mensagem a ser apagada:");
		ContatoDAO.excluir(id);
		System.out.println("Mensagem apagada com sucesso");
		}
	
	
	public static Contato atualizar( String mensagem, int id) {
		Contato contato = null;
		try {
			// Criação do update
			String sql = "update contato set mensagem = ? where id = ? ";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/18_conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "gilberto",
					"1234");
			// Abrir a conexão
			Connection con = conex.obterConexao();
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1,mensagem);
			comando.setInt(2,id);
			
			// Comando executado
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return contato;
	}
	

	
	
	


}
