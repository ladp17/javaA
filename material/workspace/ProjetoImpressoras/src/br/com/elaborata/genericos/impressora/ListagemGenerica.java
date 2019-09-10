/**
 * 
 */
package br.com.elaborata.genericos.impressora;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roque Junior
 *
 */
public class ListagemGenerica<E> {

	private List<E> lista = new ArrayList<E>();

	public List<E> getLista() {
		return lista;
	}

	public void setLista(List<E> lista) {
		this.lista = lista;
	}
	
	public void adicionar(E item) {
		this.lista.add(item);
	}
	
}
