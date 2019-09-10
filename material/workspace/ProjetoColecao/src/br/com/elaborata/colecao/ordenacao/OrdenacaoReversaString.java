/**
 * 
 */
package br.com.elaborata.colecao.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Roque Junior
 *
 */
public class OrdenacaoReversaString {

	public static void main(String[] args) {
		List<String> bairros = new ArrayList<String>();

		bairros.add("Capão Raso");
		bairros.add("Pinheirinho");
		bairros.add("Água Verde");
		bairros.add("Batel");

		Collections.sort(bairros, Collections.reverseOrder());
		
		for (String string : bairros) {
			System.out.println(string);
		}
		
	}

}
