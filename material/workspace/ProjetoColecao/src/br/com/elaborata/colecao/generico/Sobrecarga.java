/**
 * 
 */
package br.com.elaborata.colecao.generico;

/**
 * @author Roque Junior
 *
 */
public class Sobrecarga {

	public static void main(String[] args) {

		Integer[] numerosInteiros = { 1, 2, 3, 4, 5, 6 };
		Double[] numerosReais = { 1.1, 2.1, 3.3, 4.0, 5.3, 6.9 };
		Character[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F' };

		mostraElementos(numerosInteiros);
		System.out.println();
		mostraElementos(numerosReais);
		System.out.println();
		mostraElementos(caracteres);

	}

	private static void mostraElementos(Integer[] numerosInteiros) {

		for (Integer i : numerosInteiros) {
			System.out.printf("%s : ", i);
		}
	}

	private static void mostraElementos(Double[] numerosReais) {

		for (Double d : numerosReais) {
			System.out.printf("%s : ", d);
		}
	}

	private static void mostraElementos(Character[] caracteres) {

		for (Character c : caracteres) {
			System.out.printf("%s : ", c);
		}
	}

}
