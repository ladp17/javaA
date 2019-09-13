package br.com.elaborata.exercicio.collections.funcionarioCidade.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	static {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
		} catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO: handle exception
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
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
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				//fecharConexao();
			}
		}
		return connection;
	}
	
	public static void fecharConexao() {
		try {
			if(connection!=null) {
				connection.close();
			}
			System.out.println("Conexão encerrada....");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(Conexao.getConexao()!= null){
			System.out.println("Você conectou com sucesso.");
		} else {
			System.out.println("Você não conseguiu conectar.");
		}
		
		Conexao.fecharConexao();
		

	}

}
