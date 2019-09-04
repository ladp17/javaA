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
public class ExemploTry2 {
	public static void main(String[] args) throws IOException {
		try (
				InputStream is = System.in;
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				OutputStream os = new FileOutputStream("saida1.txt");
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osw)
			) {

			String linha = br.readLine();
			while (linha != null) {
				if (linha.equals("exit")) {
					break;
				}

				bw.append(linha);
				bw.newLine();

				linha = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
