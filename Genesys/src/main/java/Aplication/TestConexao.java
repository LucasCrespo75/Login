package Aplication;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class TestConexao {

		public static void main(String[] args) {
			
			Connection conexao = null;

	        try {

	                 Class.forName("oracle.jdbc.OracleDriver");

	                 conexao = DriverManager.getConnection(

	                		 "jdbc:oracle:thin:@localhost:1521:XE", "JAVA3", "12345");

	                 System.out.println("Conexao: " + conexao.toString());
	                 
	        } catch (ClassNotFoundException e) {

	                 e.printStackTrace();

	        } catch (SQLException e) {

	                 e.printStackTrace();

	        }


		}

	}


