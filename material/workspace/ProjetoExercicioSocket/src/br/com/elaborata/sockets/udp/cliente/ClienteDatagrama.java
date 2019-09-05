/**
 * 
 */
package br.com.elaborata.sockets.udp.cliente;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Roque Junior
 *
 */
public class ClienteDatagrama {

	public static void main(String[] args) throws IOException {
		// Criando objeto DatagramaSocket para o cliente -
		// não precisa especificar porta
		DatagramSocket cliente = new DatagramSocket();
		// Definindo endereço do servidor
		InetAddress enderecoServidor = InetAddress.getByName("10.5.19.19");
		// Criando mensagem de solicitação que será enviada ao servidor
		String pergunta = "Solicitação do Cliente";
		byte[] bufferPergunta = pergunta.getBytes();
		// Preparando pacote
		DatagramPacket pacotePergunta = new DatagramPacket(bufferPergunta, bufferPergunta.length, enderecoServidor,
				2345);
		// Enviando pacote
		cliente.send(pacotePergunta);
		System.out.println("Enviou a pergunta");
		// Preparando pacore para receber resposta do servidor
		DatagramPacket resposta = new DatagramPacket(new byte[512], 512);
		// Recebendo parate de resposta do servidor
		cliente.receive(resposta);
		// Fechando socket do cliente
		cliente.close();
	}
}
