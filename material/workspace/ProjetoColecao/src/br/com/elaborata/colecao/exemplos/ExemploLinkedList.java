package br.com.elaborata.colecao.exemplos;

import java.util.LinkedList;
import java.util.ListIterator;

public class ExemploLinkedList {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//Criando lista
		LinkedList lista = new LinkedList();
		
		//Adicionando elementos na lista
		lista.add("Paraná");
		lista.add("São Paulo");
		
		//Chamando método pra exibir a lista
		exibeLista(lista);
		
		//Adicionando elemento no início da lista
		lista.addFirst("Bahia");
		
		//Chamando método para exibir lista novamente
		exibeLista(lista);
		
		//Adicionando elemento no final da lista
		lista.addLast("Rio de Janeiro");
		
		//Chamando método para exibir lista novamente
		exibeLista(lista);

	}
	
	@SuppressWarnings({ "rawtypes" })
	static void exibeLista(LinkedList lista){
		
		System.out.println("\nExibindo lista: ");
		
		/*obtem um ListIterator para percorrer toda a lista,
		  começando no primeiro elemento*/
		ListIterator iterator = lista.listIterator(0);
		
		while(iterator.hasNext()){
			
			String estado = (String) iterator.next();
			System.out.println(estado);

		}
	}

}
