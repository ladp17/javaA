/**
 * 
 */
package br.com.elaborata.io.escrita;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class LerArquivoSequencial {

	private Scanner entrada;

	public void abrirArquivo() throws FileNotFoundException {
		entrada = new Scanner(new File("cliente.txt"));
	}

	public void fecharArquivo() {
		if (entrada != null) {
			entrada.close();
		}
	}

	public void lerRegistros() {

		System.out.println("Lendo os clientes");

		while (entrada.hasNext()) {

			Cliente cliente = new Cliente();

			cliente.setId(entrada.nextInt());
			cliente.setNome(entrada.next());
			cliente.setSobrenome(entrada.next());

			System.out.printf(
					"Cliente --> id: %d, nome: %s, sobrenome: %s \r\n",
					cliente.getId(), cliente.getNome(),
					cliente.getSobrenome());

		}

	}

	public static void main(String[] args) {

		LerArquivoSequencial app = new LerArquivoSequencial();

		try {
			app.abrirArquivo();
			app.lerRegistros();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao manipular arquivo sequencial " + e.getMessage());
		} finally {
			app.fecharArquivo();
		}

	}

}
