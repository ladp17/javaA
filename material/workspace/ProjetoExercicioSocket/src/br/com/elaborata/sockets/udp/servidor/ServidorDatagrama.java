/**
 * 
 */
package br.com.elaborata.sockets.udp.servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Roque Junior
 *
 */
public class ServidorDatagrama {

	public static void main(String[] args) throws IOException {
		// Criando objeto do tipo DatagramSocket para escutar a porta 2345
		DatagramSocket servidor = new DatagramSocket(2345);
		// Criando datagrama que receberá pacote
		DatagramPacket pacoteRecebido = new DatagramPacket(new byte[512], 512);
		// Fica aguardando até o recebimento de uma nova mensagem
		servidor.receive(pacoteRecebido);
		// Preparando a resposta
		String mensagem = "Resposta do servidor";
		// Tansformando String em array de bytes
		byte[] bufferResposta = mensagem.getBytes();
		// Empacotando resposta
		DatagramPacket resposta = new DatagramPacket(bufferResposta, bufferResposta.length, pacoteRecebido.getAddress(),
				pacoteRecebido.getPort());
		// Enviando pacote
		servidor.send(resposta);
		// Fechando comunicação
		servidor.close();
	}

}
