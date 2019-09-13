/**
 * 
 */
package br.com.elaborata.collections.controle;

import java.io.IOException;
import java.util.Collection;

import javax.swing.JOptionPane;

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

			System.out.println("Encerrando o procedimento");

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Formato de número não é correto");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao realizar o acesso ao arquivo");
			e.printStackTrace();
		}
	}

}
