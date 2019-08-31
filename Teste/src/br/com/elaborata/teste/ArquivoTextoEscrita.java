/**
 * 
 */
package br.com.elaborata.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author aluno
 *
 */
public class ArquivoTextoEscrita {

	
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter out = null;
		
		try {
		
			fw = new FileWriter("dadoscurso.txt");
			out = new BufferedWriter(fw);
			
			out.write("teste1");
			out.write("teste2\n");
			out.write("teste3\n");
			out.flush();
			
			
		} catch (IOException e) {

			e.printStackTrace();
		
		}
		
	}
	
	
}
