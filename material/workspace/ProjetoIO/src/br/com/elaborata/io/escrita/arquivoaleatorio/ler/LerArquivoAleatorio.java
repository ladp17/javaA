/**
 * 
 */
package br.com.elaborata.io.escrita.arquivoaleatorio.ler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import br.com.elaborata.io.escrita.arquivoaleatorio.criar.Cliente;


/**
 * @author Roque Junior
 *
 */
public class LerArquivoAleatorio {
	
	private RandomAccessFile file;
	
	/**
	 * Testando leitura do registro 2
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		LerArquivoAleatorio app = new LerArquivoAleatorio();
		app.abrirArquivo("cliente.dat");
		
		//Buscando o registro na posição 2 do arquivo
		Cliente cliente = app.lerRegistro(2);

		//Imprimindo cliente na tela
		System.out.printf("Cliente encontrado na posição ..." +
				"--> id=%d, nome=%s, sobrenome=%s\n",
				cliente.getId(),
				cliente.getNome(),
				cliente.getSobrenome());
		
		app.fecharArquivo();
	}
	
	/**
	 * Abre o arquivo de dados
	 * 
	 * @param nome	nome do arquivo (ex: "cliente.dat")
	 * @throws FileNotFoundException
	 */
	public void abrirArquivo(String nome) throws FileNotFoundException {
		
		file = new RandomAccessFile(nome, "r");
	}
	
	/**
	 * Lê um registro de cliente do arquivo
	 * 
	 * @param posicao
	 * @return cliente
	 * @throws IOException
	 */
	public Cliente lerRegistro(int posicao) throws IOException {
		
		Cliente cliente = new Cliente();
		//para chegar no valor de 72 seguir o seguinte calculo:
		//nome tem 15 chars e cada char vale 2 bytes fecha (30 bytes)
		//sobrenome tem 15 chars e cada char vale 2 bytes fecha (30 bytes)
		//id é 1 int que vale 4 bytes
		//saldo é 1 double que vale 8 bytes
		// 30 + 30 + 4 + 8 =  72
		file.seek((posicao -1) * 72);
		
		cliente.setId(file.readInt());

		//lendo cada caracter do nome - 15 vezes
		StringBuffer sb = new StringBuffer(15);
		for (int i = 0 ; i < 15 ; i++) {
			sb.append(file.readChar());
		}
		
		cliente.setNome(sb.toString().trim());
		
		//lendo cada caracter do sobrenome - 15 vezes
		sb = new StringBuffer(15);
		for (int i = 0 ; i < 15 ; i++) {
			sb.append(file.readChar());
		}
		
		cliente.setSobrenome(sb.toString().trim());
		
		cliente.setSaldo(file.readDouble());
		
		return cliente;
	}
	
	/**
	 * Fecha o arquivo de dados.
	 * @throws IOException
	 */
	public void fecharArquivo() throws IOException {
		if(file != null) {
			file.close();
		}
	}

}
