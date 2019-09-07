/*
*
 * 
 */
package br.com.elaborata.exercicios;

import java.util.ArrayList;

import java.util.List;

/**
 * @author ladp17
 *
 */
public class ListaGenerica <T> {

	private List<T> lista = new ArrayList<T>();
	
	public ListaGenerica() {
	}

	public List<T> getLista() {
		return lista;
	}

	public void setLista(List<T> lista) {
		this.lista = lista;
	}

	public void adiciona(T item) {
		
		lista.add(item);
		
	}

	
// remover por index n estava funcionando

	public void remover(int index) {
		
		this.lista.remove(index);
				
	}
	
	public void remover(T item) {
		
		this.lista.remove(item);

	}
	
	public void imprimeLista() {
		
		for (T t : lista) {
			
			System.out.println(t);
			
		}
	}
}
