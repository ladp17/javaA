/**
 * 
 */
package br.com.elaborata.sockets.tcp.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Roque Junior
 *
 */
public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// Abrindo conexão com o IP do servidor
		Socket conexaoCliente = new Socket("10.5.19.19", 4321);
		// Abrindo canal para receber dados
		DataInputStream entrada = new DataInputStream(conexaoCliente.getInputStream());
		// Abrindo canal para enviar dados
		DataOutputStream saida = new DataOutputStream(conexaoCliente.getOutputStream());
		String mensagemEnviada = "Olá!! tudo bem?";
		System.out.println("Mensagem que enviaremos ao servidor: " + mensagemEnviada);
		// Enviando mensagem ao servidor
		saida.writeUTF(mensagemEnviada);
		// Ao receber resposta do servidor, exibe mensagem recebida da tela
		String mensagemRecebida = entrada.readUTF();
		System.out.println("Resposta do servidor: " + mensagemRecebida);
		// Fechando canais de entrada e saida
		saida.close();
		entrada.close();
		// fechando a conexão
		conexaoCliente.close();
	}
}
