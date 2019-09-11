/**
 * 
 */
package br.com.elaborata.exercicio.collections.funcionarioCidade;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author aluno
 *
 */
public class LeArquivo {
	private Scanner scanner;
	
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
		
		Collection<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
			
			try {
				
				scanner = new Scanner(new File(arquivo));
				
				while (scanner.hasNext()) {
					String prox = scanner.nextLine();
				
						funcionarios.add(preencheFuncionario(prox));
						
				
					
				}
				
				return funcionarios;
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			} 
			
		}

	public Cidade preencheCidade(String str) {
		String[] aux = str.split(",");
		Cidade cidade = new Cidade(aux[0], aux[1], aux[2]);
		
		return cidade;		
	}
	
	public Collection<Cidade> listarCidade(String arquivo) {
		
		Collection<Cidade> cidades = new ArrayList<Cidade>();
		
			
			try {
				
				scanner = new Scanner(new File(arquivo));
				
				while (scanner.hasNext()) {
					
					cidades.add(preencheCidade(scanner.nextLine()));
					
				}
				
				return cidades;
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			} 
			
		}
	
}
