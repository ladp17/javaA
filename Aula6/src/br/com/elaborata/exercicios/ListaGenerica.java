/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.ArrayList;

/**
 * @author ladp17
 *
 */
public class ListaGenerica <T> {

	private ArrayList<T> lista = new ArrayList<T>();
	
	public ListaGenerica() {
	}

	public ArrayList<T> getLista() {
		return lista;
	}

	public void setLista(ArrayList<T> lista) {
		this.lista = lista;
	}

	public void adiciona(T item) {
		
		lista.add(item);
		
	}
	
	public void remover(Integer index) {
		
		lista.remove(index);
		
	}
	
	public void remover(T item) {
		
		lista.remove(item);
		
	}
	
	public void imprimeLista() {
		
		for (T t : lista) {
			
			System.out.println(t);
			
		}
		
	}
	
}
