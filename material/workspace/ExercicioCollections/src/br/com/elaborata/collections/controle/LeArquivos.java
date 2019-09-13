/**
 * 
 */
package br.com.elaborata.collections.controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import br.com.elaborata.collections.modelo.enume.Endereco;
import br.com.elaborata.collections.modelo.enume.Estado;
import br.com.elaborata.collections.modelo.enume.Pais;
import br.com.elaborata.collections.modelo.pojo.Cidade;
import br.com.elaborata.collections.modelo.pojo.Funcionario;

/**
 * @author Roque Junior
 *
 */
public class LeArquivos {

	private static BufferedReader entrada;

	/**
	 * Método responsável por abrir o arquivo passado como paramêtro<br>
	 * 
	 * @author Roque Junior
	 * @since 10/09/2019
	 * @param arquivo
	 */
	private static void abrirArquivo(String arquivo) throws FileNotFoundException {

		FileReader fileReader = new FileReader(new File(arquivo));

		entrada = new BufferedReader(fileReader);

	}

	/**
	 * Método responsável por fechar o arquivo para evitar surpresas<br>
	 * 
	 * @author Roque Junior
	 * @since 10/09/2019
	 * @throws IOException
	 */
	private static void fecharArquivo() throws IOException {
		if (entrada != null) {
			entrada.close();
		}
	}

	/**
	 * Método responsável por recuperar um arquivo contendo vários
	 * funcionários<br>
	 * 
	 * @author Roque Junior
	 * @since 10/09/2019
	 * 
	 * @return {@link Collection} Funcionario
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public Collection<Funcionario> listarFuncionario() throws NumberFormatException, IOException {
		Collection<Funcionario> funcionarios = new ArrayList<Funcionario>();
		abrirArquivo("tabela funcionario.txt");

		while (entrada.ready()) {
			String[] array = entrada.readLine().split(",");
			Funcionario funcionario = new Funcionario();
			Cidade cidade = new Cidade();
			cidade.setNome(array[3]);

			funcionario.setCodigo(Integer.valueOf(array[0]));
			funcionario.setNome(array[1]);
			funcionario.setEndereco(Endereco.getEndereco(array[2]));
			funcionario.setCidade(cidade);
			funcionario.setEstado(Estado.valueOf(array[4]));
			funcionario.setPais(Pais.valueOf(String.valueOf(array[5]).toUpperCase()));

			funcionarios.add(funcionario);
		}
		fecharArquivo();

		return funcionarios;

	}

	/**
	 * Método responsável por recuperar um arquivo contendo várias cidades<br>
	 * 
	 * @author Roque Junior
	 * @since 10/09/2019
	 * 
	 * @return {@link Collection} Cidade
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public Collection<Cidade> listarCidade() throws NumberFormatException, IOException {

		Collection<Cidade> cidades = new ArrayList<Cidade>();
		abrirArquivo("tabela cidades.txt");

		while (entrada.ready()) {
			String[] array = entrada.readLine().split(",");
			Cidade cidade = new Cidade();
			cidade.setNome(array[2]);
			cidade.setCodigo(Integer.valueOf(array[0]));
			cidade.setEstado(Estado.valueOf(array[1]));

			cidades.add(cidade);
		}
		fecharArquivo();

		return cidades;

	}

	public void salvarFuncionarios(Collection<Funcionario> funcionarios) {
		FileWriter fw = null;
		BufferedWriter out = null;

		try {
			fw = new FileWriter("tabela funcionario alterada.txt");
			out = new BufferedWriter(fw);

			for (Funcionario funcionario : funcionarios) {

				StringBuilder sb = new StringBuilder();
				sb.append(funcionario.getCodigo().toString());
				sb.append(",");
				sb.append(funcionario.getNome());
				sb.append(",");
				sb.append(funcionario.getEndereco().getDescricao());
				sb.append(",");
				sb.append(funcionario.getCidade().getNome());
				sb.append(",");
				sb.append(funcionario.getEstado().name());
				sb.append(",");
				sb.append(funcionario.getPais().getDescricao());
				sb.append("\n");

				out.write(sb.toString());

			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Tabela salva com sucesso, verifique o novo arquivo!");

	}

}
