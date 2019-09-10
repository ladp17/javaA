/**
 * 
 */
package br.com.elaborata.colecao;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Roque Junior
 *
 */
public class HashSetSample {

	public static void main(String[] args) {
		
		Set<String> paises = new HashSet<String>();
		
		// Adicionando elementos
		paises.add("Brasil");
		paises.add("Chile");
		paises.add("Paraguai");
		paises.add("Argentina");
		paises.add("Chile");
		
		
		
		if(paises.contains("Brasill")) {
			System.out.println("Brasill está na lista");
		} else {
			System.out.println("Brasill não está na lista");
		}
		
		for (String string : paises) {
			if(string.equals("Brasil")) {
				System.out.println(string);
			}
		}
		
		// Verificando se a lista esta vazia
		if (paises.isEmpty())
			System.out.println("A lista esta vazia");
		else
			System.out.println("A lista NÃO esta vazia");
		
		// Removendo o elemento 1 (Chile)
		if(paises.remove("Chile")) {
			System.out.println("O Pais Chile foi removido da lista");
		} else {
			System.out.println("Chile não está contido na lista");
		}
		
		// Pegando o total de elementos
		int totalPaises = paises.size();
		System.out.println("Total paises: " + totalPaises);
		
		// Imprimindo os elementos da lista
		for (String pais : paises)
			System.out.println(pais);
	}
}
