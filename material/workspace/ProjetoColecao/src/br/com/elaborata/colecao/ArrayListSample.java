/**
 * 
 */
package br.com.elaborata.colecao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roque Junior
 *
 */
public class ArrayListSample {

	public static void main(String[] args) {

		List<String> peixes = new ArrayList<String>();

		// Adicionando Elemento
		peixes.add("Tilápia");
		peixes.add("Carpa");

		// Obtendo um elemento da lista
		String tmp = peixes.get(0);

		System.out.println(tmp);

		// Verificando se a lista está vazia
		if (peixes.isEmpty()) {
			System.out.println("A lista está vazia");
		} else {
			System.out.println("A lista não está vazia");
		}

		// Removendo o elemento 1 (Carpa)
		peixes.remove(1);

		// Alterando o elemento 0 (Dourado)
		peixes.set(0, "Dourado");

		// Adicionando o elemento 1 (Lambari)
		peixes.add(1, "Lambari");

		// Total de elementos da lista
		int totalElementos = peixes.size();

		System.out.println("Elementos na lista : " + totalElementos);

		// Imprimindo os elementos da lista
		for (String peixe : peixes) {
			System.out.println(peixe);
		}

	}

}
