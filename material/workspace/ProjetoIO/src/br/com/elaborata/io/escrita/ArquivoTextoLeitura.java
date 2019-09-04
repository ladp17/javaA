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
public class ArquivoTextoLeitura {
	
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader in = null;
		
		try {
			fr = new FileReader("dadoscurso.txt");
			in = new BufferedReader(fr);
			
			String linha;
			
			do {
				linha = in.readLine();
				if(linha!=null) {
					System.out.println(linha);
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
