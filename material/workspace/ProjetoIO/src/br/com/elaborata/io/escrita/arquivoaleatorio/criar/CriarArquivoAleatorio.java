/**
 * 
 */
package br.com.elaborata.io.escrita.arquivoaleatorio.criar;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Roque Junior
 *
 */
public class CriarArquivoAleatorio {
	
	private RandomAccessFile file;
	
	/**
	 * Abre o arquivo de dados
	 * 
	 * @param nome	nome do arquivo (ex. "cliente.dat")
	 * @throws FileNotFoundException
	 */
	public void abrirArquivo(String nome) throws FileNotFoundException {
		//Definindo permissão de leitura e gravação para o arquivo
		file = new RandomAccessFile(nome, "rw");
	}
	
	/**
	 * Adiciona um registro de cliente no final do arquivo
	 * 
	 * @param cliente
	 * @throws IOException
	 */
	public void incluirRegistro(Cliente cliente) throws IOException {
		file.writeInt(cliente.getId());
		/*Como só podemos manipular tipos primitivos,
		 * devemos escrever chars em vez de Strings
		 */
		file.writeChars(limitarString(cliente.getNome()));
		file.writeChars(limitarString(cliente.getSobrenome()));
		file.writeDouble(cliente.getSaldo());
	}
	
	/**
	 * Fecha o arquivo de dados
	 * 
	 * @throws IOException
	 */
	public void fecharArquivo() throws IOException {
		if(file != null) {
			file.close();
		}
	}
	
	/**
	 * Limita o texto informado pelo tamanho máximo (15 caracteres)
	 * 
	 * @param textoOrigem
	 * @return	Retorna texto de entrada com 15 caracteres
	 */
	private String limitarString(String textoOrigem) {
		
		int tamanhoMaximo = 15;
		StringBuffer sb = new StringBuffer(tamanhoMaximo);
		int diferenca = tamanhoMaximo - textoOrigem.length();
		
		if(diferenca >= 0) {
			sb.append(textoOrigem);
			while (diferenca > 0){
				sb.append(' ');
				diferenca--;
			}
		} else {
			sb.append(textoOrigem.substring(0, tamanhoMaximo));
		}
		
		return sb.toString();
	}
 
	/**
	 * Criando clientes para armazenar no arquivo
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		CriarArquivoAleatorio app = new CriarArquivoAleatorio();
		app.abrirArquivo("cliente.dat");
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1);
		cliente1.setNome("Michael");
		cliente1.setSobrenome("Jackson");
		cliente1.setSaldo(1234.57);
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2);
		cliente2.setNome("Roberto");
		cliente2.setSobrenome("Carlos");
		cliente2.setSaldo(2345.99);
		
		Cliente cliente3 = new Cliente();
		cliente3.setId(3);
		cliente3.setNome("Cliente 3");
		cliente3.setSobrenome("cliente 3");
		cliente3.setSaldo(235.99);
		
		Cliente cliente4 = new Cliente();
		cliente4.setId(4);
		cliente4.setNome("Cliente4");
		cliente4.setSobrenome("cliente4");
		cliente4.setSaldo(245.99);
		
		Cliente cliente5 = new Cliente();
		cliente5.setId(15);
		cliente5.setNome("Cliente5");
		cliente5.setSobrenome("cliente5");
		cliente5.setSaldo(234.99);
		
		app.incluirRegistro(cliente1);
		app.incluirRegistro(cliente4);
		app.incluirRegistro(cliente2);
		app.incluirRegistro(cliente5);
		app.incluirRegistro(cliente3);
		
		app.fecharArquivo();

	}

}
