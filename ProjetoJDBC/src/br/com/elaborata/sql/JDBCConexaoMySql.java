/**
 * 
 */
package br.com.elaborata.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DespesasPessoais?user=root&password=elaborata");
			System.out.println("Conectado ao banco de dados...");
			
			PreparedStatement insert = conn.prepareStatement("INSERT INTO despesas"
					+ "(categoria, descricao, valor, data_pagamento) "
					+ "VALUES (?,?,?,?);");
			
			insert.setString(1, "Casa");
			insert.setString(2, "Luz");
			insert.setDouble(3, 156.00);
			insert.setString(4, "2018/01/05");
			
			insert.execute();
			
			String sql = "SELECT codigo, categoria, descricao, " +
					"valor, data_pagamento FROM despesas;";
			
			Statement select = conn.createStatement();
			
			ResultSet resultado = select.executeQuery(sql);
			
			int codigo;
			String categoria;
			String descricao;
			Double valor;
			Date dataPagamento;
			
			while (resultado.next()) {
				codigo = resultado.getInt("codigo");
				categoria = resultado.getString("categoria");
				descricao = resultado.getString("descricao");
				valor = resultado.getDouble("valor");
				dataPagamento = resultado.getDate("data_pagamento");
				System.out.println(codigo + ", " + categoria + ", " +
				descricao + ", " + valor + ", " +
				dataPagamento);
				}
			
		} catch (ClassNotFoundException e) {
			System.out.println("ERRO: Driver JDBC não encontrado!");
		} catch (SQLException e) {
		System.out.println("ERRO: Verifique se os dados de conexão estão corretos!");
		} finally {
			
			if (conn != null) {
				
				try {
					conn.close();
					System.out.println("conexao encerrada com sucesso!");
				} catch (SQLException e) {

					System.out.println("ERRO: " + e.getMessage());
				
				}
				
			}
			
		}
	}

}