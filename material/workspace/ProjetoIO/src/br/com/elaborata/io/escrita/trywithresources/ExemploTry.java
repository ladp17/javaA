/**
 * 
 */
package br.com.elaborata.io.escrita.trywithresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author Roque Junior
 *
 */
public class ExemploTry {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);

		try (BufferedReader br = new BufferedReader(isr)) {
			OutputStream os = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);

			try (BufferedWriter bw = new BufferedWriter(osw)) {
				String linha = br.readLine();

				while (linha != null) {
					if (linha.equals("exit")) {
						break;
					}

					bw.append(linha);
					bw.newLine();

					linha = br.readLine();
				}
			}
		}
	}

}
