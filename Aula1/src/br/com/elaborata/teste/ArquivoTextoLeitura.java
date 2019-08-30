/**
 * 
 */
package br.com.elaborata.teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author aluno
 *
 */
public class ArquivoTextoLeitura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader in = null;
		String linha;
		
		try {
			
			fr = new FileReader("dadoscurso.txt");
			in = new BufferedReader(fr);
			
			do {
				
				linha = in.readLine();
				if(linha != null){

					System.out.println(linha);
					
				}
				
			} while (linha != null);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
		
		} finally {
			
			try {
				
				fr.close();
				in.close();
				
			} catch (IOException e2) {

				e2.printStackTrace();
			
			}
			
		}
	}

}
