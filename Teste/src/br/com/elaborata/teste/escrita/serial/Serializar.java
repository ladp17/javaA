/**
 * 
 */
package br.com.elaborata.teste.escrita.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Classe responsavel por serializar obetos
 * 
 * @author aluno
 *
 */
public class Serializar {

	/**
	 * @param args
	 */
	
	/**
	 * metodo que recebe um objeto e serializa e o serializa no cliente.ser
	 * 
	 * @author aluno
	 */
	public static void serializar(Serializable objeto) throws FileNotFoundException, IOException {
		
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cliente.ser"));
		
		outputStream.writeObject(objeto);
		outputStream.flush();
		outputStream.close();
	}
	
	public static void main(String[] args) {

		
		
	}

}
