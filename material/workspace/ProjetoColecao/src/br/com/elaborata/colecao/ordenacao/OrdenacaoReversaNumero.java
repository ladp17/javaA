/**
 * 
 */
package br.com.elaborata.colecao.ordenacao;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Roque Junior
 *
 */
public class OrdenacaoReversaNumero {
	
	public static void main(String[] args) {
		Integer[] numeros = {3, 1, 4, 2, 5, 0, 9, 7, 6, 8};
		
		Arrays.sort(numeros, Collections.reverseOrder());
		
		for (int i : numeros) {
			System.out.print(i + " ");
		}
	}

}
