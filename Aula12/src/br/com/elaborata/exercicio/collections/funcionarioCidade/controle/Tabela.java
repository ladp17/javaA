/**
 * 
 */
package br.com.elaborata.exercicio.collections.funcionarioCidade.controle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import br.com.elaborata.exercicio.collections.funcionarioCidade.modelo.Cidade;
import br.com.elaborata.exercicio.collections.funcionarioCidade.modelo.Funcionario;

/**
 * @author aluno
 *
 */
public class Tabela {
	
	Connection conexao = Conexao.getConexao();
		
	public Funcionario preencheFuncionario(String str) {
		String[] aux = str.split(",");
		Funcionario funcionario = new Funcionario(aux[0], aux[1], aux[2], aux[3], aux[4], aux[5]);
		return funcionario;		
	}
	
	public <T> void salvar( Collection <T> col, String arquivo) {
		
		FileWriter fw;
		try {
			fw = new FileWriter(arquivo);
			BufferedWriter out = new BufferedWriter(fw);
			
			String saida = "";
			
			for (T t : col) {
				
				saida += t + "\n";
				
			}
			
			out.append(saida);
			out.flush();
			
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public Collection<Funcionario> listarFuncionario(String arquivo) {
		
//		String sql = "SELECT * FROM tb_funcionario;";
//		
//		Statement select = conexao.createStatement();
//		
//		ResultSet resultado = select.executeQuery(sql);
//		
//		while (resultado.next()) {
//			
//			//aqui tem que fazer os resultados.get...
//			
//		}
//				
		return null;
			
		}

	public Cidade preencheCidade(String str) {
		String[] aux = str.split(",");
		Cidade cidade = new Cidade(aux[0], aux[1], aux[2]);
		
		return cidade;		
	}
	
	public Collection<Cidade> listarCidade(String arquivo) {
		
//		Collection<Cidade> cidades = new ArrayList<Cidade>();
//		
//			
//			try {
////				
////				scanner = new Scanner(new File(arquivo));
////				
////				while (scanner.hasNext()) {
////					
////					cidades.add(preencheCidade(scanner.nextLine()));
//					
//				}
//				
//				return cidades;
//				
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
				return null;
//			} 
//			
		}
	
}
