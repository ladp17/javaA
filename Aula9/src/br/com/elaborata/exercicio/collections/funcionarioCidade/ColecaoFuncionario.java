/**
 * 
 */
package br.com.elaborata.exercicio.collections.funcionarioCidade;

import java.util.Collection;

/**
 * @author aluno
 *
 */
public class ColecaoFuncionario {

	public Funcionario find(String chave, Collection<Funcionario> funcionarios) {
		
		for (Funcionario funcionario : funcionarios) {
			
			if (funcionario.getNome().equals(chave)) {
				return funcionario;
				
			}
			
		}
		
		return null;
		
	}
	
public Cidade findcidade(String chave, Collection<Cidade> cidades) {
		
		for (Cidade cidade : cidades) {
			
			if (cidade.getNome().equals(chave)) {
				return cidade;
				
			}
			
		}
		
		return null;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String arquivoFuncionarios = "tabela funcionario.txt";
		String arquivoCidades = "tabela cidades.txt";
		String arquivoFuncionariosAlterados = "tabela funcionario aterado.txt";
		LeArquivo arquivo = new LeArquivo();
		ColecaoFuncionario colecaoFuncionario = new ColecaoFuncionario();
		
		Collection<Funcionario> funcionarios = arquivo.listarFuncionario(arquivoFuncionarios);
		Collection<Cidade> cidades = arquivo.listarCidade(arquivoCidades);
		
		Funcionario funcionario;
		funcionario = colecaoFuncionario.find("Abner", funcionarios);
		funcionario.setCidade("Monteiropolis");
		funcionario.setEstado(colecaoFuncionario.findcidade("Monteirópolis", cidades).getEstado());
		arquivo.salvar(funcionarios, arquivoFuncionariosAlterados);
		
		
	}

}
