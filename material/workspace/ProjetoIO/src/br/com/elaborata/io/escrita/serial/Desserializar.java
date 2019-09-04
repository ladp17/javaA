/**
 * 
 */
package br.com.elaborata.io.escrita.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Classe responsável por desserializar objetos<br>
 * 
 * @author Roque Junior
 * @since Agosta/2019
 *
 */
public class Desserializar {
	
	
	/**
	 * Método que retorna um objeto e o desserializa<br>
	 * no arquivo "cliente.ser"<br>
	 * 
	 * @author Roque Junior
	 * @since Agosto/2019
	 * 
	 */
	public static Object desserializar() throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream input = new ObjectInputStream(
				new FileInputStream("cliente.ser"));
		
		Object objeto = input.readObject();
		input.close();
		
		return objeto;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Object objeto;
		try {
			objeto = desserializar();
			if(objeto instanceof Cliente) {
				
				Cliente cliente = (Cliente) objeto;
				
				System.out.println(cliente.getId());
				System.out.println(cliente.getNome());
				System.out.println(cliente.getSobrenome());
				
			} else if(objeto instanceof Funcionario) {
				Funcionario funcionario = (Funcionario) objeto;
				
				System.out.println(funcionario.getId());
				System.out.println(funcionario.getNome());
				System.out.println(funcionario.getSobrenome());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
