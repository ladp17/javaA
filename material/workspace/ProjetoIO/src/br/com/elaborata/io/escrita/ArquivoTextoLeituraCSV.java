/**
 * 
 */
package br.com.elaborata.io.escrita;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Roque Junior
 *
 */
public class ArquivoTextoLeituraCSV {
	
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader in = null;
		
		try {
			fr = new FileReader("dadoscurso.csv");
			in = new BufferedReader(fr);
			
			String linha;
			String[] dados;
			do {
				linha = in.readLine();
				if(linha!=null) {
					dados = linha.split(",");
					for (String string : dados) {
						System.out.println(string);
					}
				}
			} while (linha!=null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
