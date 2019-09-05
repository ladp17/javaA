/**
 * 
 */
package br.com.elaborata.sockets.tcp.servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Roque Junior
 *
 */
public class Servidor {

	public static void main(String[] args) throws IOException {
		// Criação de objeto que gerencia conexão com cliente
		ServerSocket conexaoServidor = new ServerSocket(4321, 1);
		// Recebendo solicitação do cliente
		Socket cliente = conexaoServidor.accept();
		// Abrindo canal para receber dados
		DataInputStream entrada = new DataInputStream(cliente.getInputStream());
		// Abrindo canal para enviar dados
		DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
		// Recebendo mensagem do cliente
		String mensagemRecebida = entrada.readUTF();
		if ("Olá!! tudo bem?".equals(mensagemRecebida)) {
			// Exibindo mensagem recebida pelo cliente
			System.out.println("Mensagem recebida pelo cliente: " + mensagemRecebida);
			// Enviando resposta na requisição do cliente
			saida.writeUTF("Tudo e você??");
		}
		// Fechando canais de entrada e saida e conexão com o cliente
		saida.close();
		entrada.close();
		cliente.close();
		conexaoServidor.close();
	}
}
