/**
 * 
 */
package br.com.elaborata.io.escrita.exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Roque Junior
 *
 */
public class Exercicio1 {
	public static void main(String[] args) {
		escrever();
		
		ler();
	}

	private static void ler() {
		FileReader fr = null;
		BufferedReader in = null;
		
		try {
			fr = new FileReader("turma11433.txt");
			in = new BufferedReader(fr);
			
			String linha;
			String[] dados;
			do {
				linha = in.readLine();
				if(linha!=null) {
					dados = linha.split(",");
					for (String string : dados) {
						if("Jorge".equals(string)) {
							System.out.println(string+" ");
							continue;
						}
						System.out.print(string+" ");
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

	private static void escrever() {
		FileWriter fw = null;
		BufferedWriter out = null;
		
		try {
			fw = new FileWriter("turma11433.txt");
			out = new BufferedWriter(fw);
			
			out.write("Flavio,");
			out.write("Leonardo,");
			out.write("Jorge,");
			out.write("Paulo,");
			out.write("Roque");
			
			
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
