package br.com.elaborata.sockets.exemploapplet;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class ClienteCall extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_PORT = 4321;
	public Socket clisoc;
	private Thread reader;
	public TextArea outputArea;
	public TextField inputArea, nomefield;
	public PrintStream out;
	public String name;

	// Cria as linhas de leitura e escrita e as inicia.
	public void init() {
		outputArea = new TextArea(20, 45);
		inputArea = new TextField(45);
		nomefield = new TextField(10);

		// Tela da Applet
		add(new Label("MiniChat usando conexao (Socket TCP)"));
		add(new Label("Nome do usuario"));
		add(nomefield);
		add(outputArea);
		add(new Label("Digite uma mensagem e pressione ENTER"));
		add(inputArea);
		resize(375, 500);
		try {
			// Cria um socket cliente passando o endereco e a porta do servidor
			clisoc = new Socket("10.5.19.19", DEFAULT_PORT);
			reader = new Reader(this, outputArea);
			out = new PrintStream(clisoc.getOutputStream());
			// Define prioridades desiguais para que o console seja
			// compartilhado
			// de forma efetiva.
			reader.setPriority(3);
			reader.start();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public boolean handleEvent(Event evt) {
		if (evt.target == inputArea) {
			char c = (char) evt.key;
			if (c == '\n')
			// Vigia se o usuario pressiona a tecla ENTER.
			// Isso permite saber a mensagem esta pronta para ser enviada!
			{
				String inLine = inputArea.getText();
				name = nomefield.getText();
				out.println(name + ">" + inLine);
				inputArea.setText("");
				// Envia a mensagem, mas adiciona o nome do usuario a ela para
				// que os
				// outros clientes saibam quem a enviou.
				return true;
			}
		}
		return false;
	}
}

// ----------------------------------------------------------------------------
// A classe Reader le a entrada do soquete e atualiza a OutputArea com as
// novas mensagens.
class Reader extends Thread {
	protected ClienteCall cliente;
	private TextArea outputArea;

	public Reader(ClienteCall c, TextArea outputArea) {
		super("chatclient Reader");
		this.cliente = c;
		this.outputArea = outputArea;
	}

	public void run() {
		DataInputStream in = null;
		String line;
		try {
			in = new DataInputStream(cliente.clisoc.getInputStream());
			while (true) {
				line = in.readLine();
				// Adiciona a nova mensagem a OutputArea
				outputArea.appendText(line + "\r\n");
			}
		} catch (IOException e) {
			System.out.println("Reader:" + e);
		}
	}
}
