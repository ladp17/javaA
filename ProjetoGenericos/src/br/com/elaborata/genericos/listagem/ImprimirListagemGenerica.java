/**
 * 
 */
package br.com.elaborata.genericos.listagem;

/**
 * @author aluno
 *
 */
public class ImprimirListagemGenerica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ListagemGenerica<Cliente> listagem = new ListagemGenerica<Cliente>();
		
		listagem.adicionar(new Cliente("leo", "12345678"));
		listagem.adicionar(new Cliente("nome", "????????"));
		
		for (int i = 0; i < listagem.getLista().size(); i++) {
			
			System.out.println(listagem.getLista().get(i));
			
		}
		
	}

}
