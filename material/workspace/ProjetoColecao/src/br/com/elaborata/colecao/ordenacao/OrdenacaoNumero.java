/**
 * 
 */
package br.com.elaborata.colecao.ordenacao;

import java.util.Arrays;

/**
 * @author Roque Junior
 *
 */
public class OrdenacaoNumero {
	
	public static void main(String[] args) {
		int[] numeros = {3, 1, 4, 2, 5, 0, 9, 7, 6, 8};
		
		Arrays.sort(numeros);
		
		for (int i : numeros) {
			System.out.print(i + " ");
		}
	}

}
