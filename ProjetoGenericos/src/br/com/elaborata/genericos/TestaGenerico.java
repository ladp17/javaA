/**
 * 
 */
package br.com.elaborata.genericos;

/**
 * @author aluno
 *
 */
public class TestaGenerico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] fibonacci = {1, 1, 2, 3, 5, 8, 13};
		Double[] temperaturas = {22.5, 25.9, 24.6, 21.2, 19.0};
		
		System.out.print("Sequencia Fibonacci: ");
		mostrarElementos(fibonacci);
		
		System.out.println();
		
		System.out.print("Temperaturas: ");
		mostrarElementos(temperaturas);
		
	}

	public static <T> void mostrarElementos(T[] elementos) {
		
		for (int i = 0; i < elementos.length; i++) {
			
			System.out.print(elementos[i] + " ");
			
		}
		
		System.out.println();
		
	}
	
}
