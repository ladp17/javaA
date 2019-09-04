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
public class ArquivoTextoEscritaCSV {
	
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter out = null;
		
		try {
			fw = new FileWriter("dadoscurso.csv");
			out = new BufferedWriter(fw);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Curso Linguagem Java Avançado");
			sb.append(",");
			sb.append("60 horas");
			sb.append(",");
			sb.append("Período Noturno");
			
			out.write(sb.toString());
			
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
