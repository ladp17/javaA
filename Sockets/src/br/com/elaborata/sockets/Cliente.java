/**
 * 
 */
package br.com.elaborata.sockets;

import java.io.ObjectInputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * @author aluno
 *
 */
public class Cliente extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer porta = 1234;	
		
		try {
			
			String str = JOptionPane.showInputDialog("informe o numero de IP");
			Socket cliente = new Socket(str, porta);
			System.out.println("Conexao aceita de: " + cliente.getInetAddress());
			System.out.println("Recebenco mensagens");
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String msg;
			
			do {
				
				Thread.sleep(2000);
				msg = (String) entrada.readObject();
				System.out.println(msg);
				
			} while (!msg.equals("EOT"));
			cliente.close();
			System.out.println("Concexao Encerrada");
			
					
		} catch (Exception e) {

			e.printStackTrace();
		
		}
		
	}

}
