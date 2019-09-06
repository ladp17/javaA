/**
 * 
 */
package br.com.elaborata.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author aluno
 *
 */
public class JDBCConexaoMySql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/despesaspessoais?"
					+ "user=root&password=elaborata");
			
			System.out.println("Conexão realizada com sucesso!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("ERRO:  Drive JDBC não localizado!");
		} catch (SQLException e) {
			System.out.println("ERRO:  Verifique se os dados de conexão estão corretos!");
		} finally {
			if(conn!=null) {
				try {
					conn.close();
					System.out.println("Conexão encerrada com sucesso!");
				} catch (SQLException e) {
					System.out.println("ERRO:  " + e.getMessage());
				}
			}
		}

	}

}
