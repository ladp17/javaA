/**
 * 
 */
package br.com.elaborata.teste;

/**
 * @author aluno
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arquivo arquivo = new Arquivo("Turma11433.txt");
		
		String dados;
		
		dados = "Flavio "
				+ "Leonardo "
				+ "Jorge\n"
				+ "Paulo "
				+ "Roquez";
		
		arquivo.escreve(dados);
		
		arquivo.imprime();
		
		
	}

}
