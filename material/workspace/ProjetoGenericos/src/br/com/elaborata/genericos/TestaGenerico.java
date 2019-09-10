/**
 * 
 */
package br.com.elaborata.genericos;

/**
 * @author Roque Junior
 *
 */
public class TestaGenerico {

	public static void main(String[] args) {
		int[] fibonacci = { 1, 1, 2, 3, 5, 8, 13 };
		double[] temperaturas = { 22.5, 25.9, 24.6, 21.2, 19.0 };

		System.out.println("Sequencia Fibonacci...");
		mostrarElementos(fibonacci);

		System.out.println();
		System.out.println("Temperaturas...");
		mostrarElementos(temperaturas);
	}

	private static void mostrarElementos(int[] elementos) {

		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i] + ", ");
		}
	}

	private static void mostrarElementos(double[] elementos) {

		for (int i = 0; i < elementos.length; i++) {
			System.out.print(elementos[i] + ", ");
		}
	}
}
