/**
 * 
 */
package br.com.elaborata.colecao;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Roque Junior
 *
 */
public class LinkedListSample {

	public static void main(String[] args) {

		Queue<String> estados = new LinkedList<String>();
		// Adicionando elementos
		estados.add("Goias");
		estados.add("Paraná");
		estados.add("Sao Paulo");

		// Verificando se a lista esta vazia
		if (estados.isEmpty()) {
			System.out.println("A lista esta vazia");
		} else {
			System.out.println("A lista NÃO esta vazia");
		}

		// Pegando o total de elementos
		int totalEstados = estados.size();
		System.out.println("Total estados: " + totalEstados);

		// Imprimindo os elementos da lista
		for (String estado : estados) {
			System.out.println(estado);
		}
		System.out.println("\n\n");
		while (estados.size() > 0) {
			System.out.println("Removendo " + estados.poll());
		}

		totalEstados = estados.size();
		System.out.println("Total estados: " + totalEstados);
	}
}
