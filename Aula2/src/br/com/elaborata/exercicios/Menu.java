/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.ArrayList;

/**
 * @author aluno
 *
 */
public class Menu {
	private String nomeArquivo = "Pessoas.ser";
	
	private Teclado teclado = new Teclado();
	
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	//tem que trocar o tipo de retorno
	public void cadastrar() {
		Pessoa pessoa = null;
		
		String nome;
		String escolaridade;
		Integer idade;
		String objetivo;
		
		nome = teclado.leNome();
		escolaridade = teclado.leEscolaridade();
		idade = teclado.leIdade();
		objetivo = teclado.leObjetivo();
		
		pessoa = new Pessoa(nome, escolaridade, idade, objetivo);
		
		//provavelmente terei que mudar essa parte
		pessoas.add(pessoa);
	}

	@SuppressWarnings("unchecked")
	public void iniciaMenu() {
		Arquivo arquivo = new Arquivo(nomeArquivo);
		
		Integer opcao;
		
		do {
			
			System.out.println("1 - Cadastrar\n2 - Obter e mostrar na tela\n3 - Salvar alteração");
			opcao = teclado.leInt();
			
			switch (opcao) {
			
			//Cadastrar
			case 1:
				cadastrar();
				break;
				
			//Obter e mostrar na tela
			case 2:{

				ArrayList<Pessoa> listapessoas = new ArrayList<Pessoa>();
				
				listapessoas = (ArrayList<Pessoa>) arquivo.descerealizar();
				
				if (listapessoas == null) {
					
					System.out.println("nenhum cadastrado");
					
				} else {
					
					for (Pessoa pessoa : listapessoas) {
						
						System.out.println(pessoa);
						
					}
					
				}
				
				
				
			}
				
				break;
				
			//Salvar alteracao	
			case 3:
				
				arquivo.serializar(pessoas);
				
				break;

			default:
				break;
			}
			
			
		} while (opcao != 2 || opcao != 3);
		
		System.out.println("concluido");
		
	}
}
