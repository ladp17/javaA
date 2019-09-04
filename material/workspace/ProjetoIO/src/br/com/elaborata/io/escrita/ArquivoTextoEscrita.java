/**
 * 
 */
package br.com.elaborata.io.escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Roque Junior
 *
 */
public class ArquivoTextoEscrita {
	
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter out = null;
		
		try {
			fw = new FileWriter("dadoscurso.txt");
			out = new BufferedWriter(fw);
			
			out.write("Curso Linguagem Java Avançado\n");
			out.write("60 horas\n");
			out.write("Período Noturno");
			
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
