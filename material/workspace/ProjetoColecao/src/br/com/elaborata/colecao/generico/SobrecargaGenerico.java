/**
 * 
 */
package br.com.elaborata.colecao.generico;

/**
 * @author Roque Junior
 *
 */
public class SobrecargaGenerico {

	public static void main(String[] args) {

		Integer[] numerosInteiros = { 1, 2, 3, 4, 5, 6 };
		Double[] numerosReais = { 1.1, 2.1, 3.3, 4.0, 5.3, 6.9 };
		Character[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F' };

		mostraElementos(numerosInteiros);
		mostraElementos(numerosReais);
		mostraElementos(caracteres);

	}

	private static <G> void mostraElementos(G[] array) {

		for (G g : array) {
			System.out.printf("%s : ", g);
		}
		System.out.println();
	}

	

}
