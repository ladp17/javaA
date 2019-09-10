/**
 * 
 */
package br.com.elaborata.colecao.festa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roque Junior
 *
 */
public class ListaFesta<J> {

	private List<J> listaConvidados = new ArrayList<J>();

	public List<J> getListaConvidados() {
		return listaConvidados;
	}

	public void setListaConvidados(List<J> listaConvidados) {
		this.listaConvidados = listaConvidados;
	}
	
	public void addConvidado(J convidado) {
		listaConvidados.add(convidado);
	}
	
	
}
