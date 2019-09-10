/**
 * 
 */
package br.com.elaborata.genericos.listagem;

/**
 * @author Roque Junior
 *
 */
public class ImprimirListagemGenerica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListagemGenerica<Cliente> listagem = new ListagemGenerica<Cliente>();

		listagem.adicionar(new Cliente("José", "2222-3333"));
		listagem.adicionar(new Cliente("João", "3333-4444"));

		for (int i = 0; i < listagem.getLista().size(); i++) {
			System.out.println(listagem.getLista().get(i));
		}

		ListagemGenerica<Funcionario> listagem1 = new ListagemGenerica<Funcionario>();

		listagem1.adicionar(new Funcionario("José", "2222-3333"));
		listagem1.adicionar(new Funcionario("João", "3333-4444"));

		for (int i = 0; i < listagem1.getLista().size(); i++) {
			System.out.println(listagem1.getLista().get(i));
		}
	}

}
