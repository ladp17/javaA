/**
 * 
 */
package br.com.elaborata.exercicio.collections.funcionarioCidade.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author aluno
 *
 */
public class Conexao {
	
static {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
		
	}
	
	private static Connection connection;
	
	public static Connection getConexao() {
		
		if(connection == null) {
			try {
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/Funcionario?"
						+ "user=root&password=elaborata");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//fecharConexao();
			}
		}
		return connection;
	}

}
