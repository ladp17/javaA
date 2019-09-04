/**
 * 
 */
package br.com.elaborata.io.escrita;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Roque Junior
 *
 */
public class CriarArquivoSequencial {
	
	private Formatter saida;
	
	
	public void abrirArquivo() throws FileNotFoundException {
		saida = new Formatter("cliente.txt");
	}
	
	public void fecharArquivo() {
		if(saida != null) {
			saida.close();
			System.out.println("Fim da gravação. Verifique o arquivo gravado!");
		}
	}
	
	public void incluirRegistros() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe os dados do cliente, -1 para encerrar");
		
		System.out.println("Id : ");
		
		int id = 0;
		
		while (id != -1) {
			
			Cliente cliente = new Cliente();
			
			id = scanner.nextInt();
			if(id != -1){
				cliente.setId(id);
				System.out.println("Nome : ");
				cliente.setNome(scanner.next());
				System.out.println("Sobrenome : ");
				cliente.setSobrenome(scanner.next());
				
				saida.format("%d %s %s \r\n",
						cliente.getId(), cliente.getNome(), cliente.getSobrenome());
				
				System.out.println("Informe os dados do cliente, -1 para encerrar");
				System.out.println("Id : ");
				
				
			}
			
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		
		CriarArquivoSequencial app = new CriarArquivoSequencial();
		
		try {
			app.abrirArquivo();
			app.incluirRegistros();
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao manipular arquivo sequencial " + e.getMessage());
		} finally {
			app.fecharArquivo();
		}
		
	}

}
