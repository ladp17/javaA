/**
 * 
 */
package br.com.elaborata.genericos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roque Junior
 *
 */
public class TestaGenerico2 {

	public static void main(String[] args) {
		Integer[] fibonacci = { 1, 1, 2, 3, 5, 8, 13 };
		Double[] temperaturas = { 22.5, 25.9, 24.6, 21.2, 19.0 };
 
		System.out.println("Sequencia Fibonacci...");
		mostrarElementos(fibonacci);

		System.out.println();
		System.out.println("Temperaturas...");
		mostrarElementos(temperaturas);
	}

	private static <T> void mostrarElementos(T[] elementos) {

		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i] + ", ");
		}
	}

	
}
