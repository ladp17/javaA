/**
 * 
 */
package br.com.elaborata.io.escrita.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Classe responsável por serializar objetos<br>
 * 
 * @author Roque Junior
 * @since Agosta/2019
 *
 */
public class Serializar {

	
	/**
	 * Método que recebe um objeto e o serializa<br>
	 * no arquivo "cliente.ser"<br>
	 * 
	 * @author Roque Junior
	 * @since Agosto/2019
	 * @throws FileNotFoundException, IOException
	 * 
	 * 
	 */
	public static void serializar(Serializable objeto) throws FileNotFoundException, IOException {
		
		ObjectOutputStream output = 
				new ObjectOutputStream(
						new FileOutputStream("cliente.ser"));
		
		output.writeObject(objeto);
		output.flush();
		output.close();
		
	}
	
	/**
	 * Método que cria um cliente pra testar a serialização<br>
	 * @author Roque Junior
	 * @since Agosto/2019
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setId(11433);
		cliente.setNome("Gilberto");
		cliente.setSobrenome("Gil");
		
		try {
			serializar(cliente);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Arquivo serializado com sucesso!!!!");

	}

}
