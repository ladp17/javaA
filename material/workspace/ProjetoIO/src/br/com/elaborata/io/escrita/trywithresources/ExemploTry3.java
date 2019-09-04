/**
 * 
 */
package br.com.elaborata.io.escrita.trywithresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Roque Junior
 *
 */
public class ExemploTry3 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
				BufferedWriter bw = 
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("saida2.txt")))) {
			String linha = br.readLine();
			while (linha != null) {
				if (linha.equals("exit")) {
					break;
				}

				bw.append(linha);
				bw.newLine();

				linha = br.readLine();
				System.out.println(linha);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
