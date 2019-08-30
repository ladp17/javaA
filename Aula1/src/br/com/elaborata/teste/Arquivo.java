/**
 * 
 */
package br.com.elaborata.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * Classe que controla a leitura e escrita de arquivos
 * 
 * @author aluno
 *
 */
public class Arquivo {
	
	private FileWriter fw = null;
	private BufferedWriter out = null;
	private FileReader fr = null;
	private BufferedReader in = null;
	
	public Arquivo(String nome) {

		try {
			
			fw = new FileWriter(nome);
			out = new BufferedWriter(fw);
			fr = new FileReader(nome);
			in = new BufferedReader(fr);
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
	
	}
	
	public String leLinha(int index) {
		
		String linha;
		int i = 0;
		
		try {
						
			do {
				
				linha = in.readLine();
				
			} while (linha != null && i < index);
			
			return linha;
			
		} catch (IOException e) {
		
			e.printStackTrace();
			return null;
			
		}
		
	}
	
	public void imprimeLinha(int index) {
		
		String linha;
		int i = 0;
		
		try {
						
			do {
				
				linha = in.readLine();
				
			} while (linha != null && i < index);
			
			System.out.println(linha);
			
		} catch (IOException e) {
		
			e.printStackTrace();
			
		}
		
	}
	
	public void imprime() {
		
		String linha;
		
		try {
			
			do {
				
				linha = in.readLine();
				
				if (linha != null) {
									
					System.out.println(linha);
					
				}
				
			} while (linha != null);
			
		} catch (IOException e) {
		
			e.printStackTrace();
			
		}
		
	}
	
	public String le() {
		
		StringBuilder sb = new StringBuilder();
		String linha;
		
		try {
			
			do {
				
				linha = in.readLine();
				
				sb.append(linha);
				
			} while (linha != null);
			
			return sb.toString();
			
		} catch (IOException e) {
		
			e.printStackTrace();
			return null;
			
		} 
		
	}
	
	public void escreve(String dados) {
		
		
		try {
			
			out.append(dados);
			
			out.flush();
						
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}

}
