/**
 * 
 */
package br.com.elaborata.sockets;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Roque Junior
 *
 */
public class Servidor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			System.out.println("[Criando o Servidor...]");
			ServerSocket servidor = new ServerSocket(1234);
			System.out.println("[Servidor operando na porta 1234]");
			
			while (true) {
				Socket cliente = servidor.accept();
				System.out.println("[Conexão aberta de "+
				cliente.getInetAddress().toString()+"]");
				System.out.println("[Enviando Dados...]");
				
				ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
				saida.flush(); //enviando cabeçalho de preparo do outro endpoint
				
				saida.writeObject("Servidor básico conectado");
				saida.writeObject("Dados conexão "+cliente.toString());
				saida.writeObject("Tchau !");
				System.out.println("[Dados enviados]");
				saida.writeObject("EOT");
				cliente.close();
				
				System.out.println("Conexão encerrada...");
				
			}
			
		} catch (Exception e) {
			System.out.println("Erro !\n " + e.getMessage());
		}

	}

}
