/**
 * 
 */
package br.com.elaborata.colecao.festa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aluno
 *
 */
public class ListaFesta<T> {

	private List<T> listaConvidados = new ArrayList<T>();

	public List<T> getListaConvidados() {
		return listaConvidados;
	}

	public void setListaConvidados(List<T> listaConvidados) {
		this.listaConvidados = listaConvidados;
	}
	
	public void addConvidado(T convidado) {
		
		this.listaConvidados.add(convidado);
		
	}
	
}
