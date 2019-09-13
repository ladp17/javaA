/**
 * 
 */
package br.com.elaborata.collections.controle;

import java.io.IOException;
import java.util.Collection;

import br.com.elaborata.collections.modelo.pojo.Cidade;
import br.com.elaborata.collections.modelo.pojo.Funcionario;

/**
 * @author Roque Junior
 *
 */
public class ColecaoFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LeArquivos leArquivos = new LeArquivos();

		Collection<Funcionario> funcionarios;
		Collection<Cidade> cidades;
		try {
			funcionarios = leArquivos.listarFuncionario();
			cidades = leArquivos.listarCidade();

			sair: 
			for (Funcionario funcionario : funcionarios) {
				if (funcionario.getNome().equalsIgnoreCase("ilaria")) {
					for (Cidade cidade : cidades) {
						if (cidade.getNome().equalsIgnoreCase("monteirópolis")) {
							funcionario.setCidade(cidade);
							funcionario.setEstado(cidade.getEstado());
							break sair;
						}
					}
				}
			}

			leArquivos.salvarFuncionarios(funcionarios);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
