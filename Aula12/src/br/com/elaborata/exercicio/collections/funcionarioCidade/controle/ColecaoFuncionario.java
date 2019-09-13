/**
 * 
 */
package br.com.elaborata.exercicio.collections.funcionarioCidade.controle;

import java.util.Collection;

import br.com.elaborata.exercicio.collections.funcionarioCidade.modelo.Cidade;
import br.com.elaborata.exercicio.collections.funcionarioCidade.modelo.Funcionario;

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
		Tabela tabela = new Tabela();
		ColecaoFuncionario colecaoFuncionario = new ColecaoFuncionario();
		
		Collection<Funcionario> funcionarios = tabela.listarFuncionario(arquivoFuncionarios);
		Collection<Cidade> cidades = tabela.listarCidade(arquivoCidades);
		
		Funcionario funcionario;
		funcionario = colecaoFuncionario.find("Abner", funcionarios);
		funcionario.setCidade("Monteiropolis");
		funcionario.setEstado(colecaoFuncionario.findcidade("Monteirópolis", cidades).getEstado());
		tabela.salvar(funcionarios, arquivoFuncionariosAlterados);
		
		
	}

}
