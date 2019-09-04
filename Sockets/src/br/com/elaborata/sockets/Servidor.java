/**
 * 
 */
package br.com.elaborata.sockets;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author aluno
 *
 */
public class Servidor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			final Integer porta = 1234;
		
		try {
			
			System.out.println("Criando Servidor");
			ServerSocket servidor = new ServerSocket(porta);
			System.out.println("Servidor operando na porta " + porta);
			
			while (true) {
				
				Socket cliente = servidor.accept();
				System.out.println("Conexao aperta de: " + cliente.getInetAddress());
				System.out.println("Enviando Dados...");
				ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
				saida.flush();
				
				saida.writeObject("Servidor Basico Conectado");
				saida.writeObject("Dados concexao: " + cliente);
				saida.writeObject("Tchau !");
				System.out.println("Dados enviados");
				saida.writeObject("EOT");
				cliente.close();
				System.out.println("Conexao encerrada");
				
				
			}	
			
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}	
		
	}

}
