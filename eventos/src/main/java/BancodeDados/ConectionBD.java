package BancodeDados;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ConectionBD {

	    public static void main(String[] args) {
	       
	        String url = "jdbc:mysql://localhost:3306/eventos";
	        String usuario = "root"; 
	        String senha = "admin";   

	        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
	            System.out.println("Conexão bem-sucedida!");
	        } catch (SQLException e) {
	            System.out.println("Erro ao conectar: " + e.getMessage());
	        }
	       
	    }
	}
	