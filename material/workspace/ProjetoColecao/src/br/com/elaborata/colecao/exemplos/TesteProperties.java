package br.com.elaborata.colecao.exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {

	//Declarando variável do tipo Properties
	private Properties table;
	
	//Configura GUI para testar a tabela Properties
	public TesteProperties(){
		table = new Properties(); //cria tabela Properties
		//configura propriedades
		table.setProperty("server_database", "jdbc:mysql://localhost:3306/estoque?" +
				"user=root&password=root");
		table.setProperty("driver_database", "com.mysql.jdbc.Driver");
		salvandoProperties(); //salva as propriedades
	}//fim do construtor TesteProperties
	
	//salva as propriedades em um arquivo
	public void salvandoProperties(){
		//salva o conteúdo de tabela no arquivo config.properties
		try{
			FileOutputStream output = new FileOutputStream("config.properties");
			
			//Salva as propriedades
			table.store(output, "Arquivo de Configuração");
			output.close();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	//Carrega as propiredades de um arquivo
	public void lendoPropriedades(){
		//Carrega o conteúdo da tabela
		try{
			FileInputStream input = new FileInputStream("config.properties");
			table.load(input);
			input.close();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	//Gera saída de valores de propiredades
	public String getProperty(String key){
		return table.getProperty((String)key);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Testando properties
		TesteProperties app = new TesteProperties();
		app.lendoPropriedades();
		System.out.println("Valor da propriedade server_database: "
				+ app.getProperty("server_database"));
		System.out.println("Valor da prorpiedade driver_database: "
				+ app.getProperty("driver_database"));
	}

}
