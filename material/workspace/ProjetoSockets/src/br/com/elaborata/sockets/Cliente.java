/**
 * 
 */
package br.com.elaborata.sockets;

import java.io.ObjectInputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * @author Roque Junior
 *
 */
public class Cliente extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			String srt = JOptionPane.showInputDialog("Informe o número do IP");
			
			Socket cliente = new Socket(srt, 1234);
			System.out.println("[Conexão aceita de "+ cliente.getInetAddress().toString()+"]");
			System.out.println("[Recebendo mensagens...]");
			
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String msg;
			
			do {
				Thread.sleep(2000);
				msg = (String) entrada.readObject();
				System.out.println(msg);
			} while (!msg.equals("EOT"));
			
			cliente.close();
			System.out.println("[Conexão foi encerrada...]");
			
			
		} catch (Exception e) {
			System.out.println("Erro !\n " + e.getMessage());
		}
	}

}
