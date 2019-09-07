/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.HashSet;
import java.util.Set;

/**
 * @author aluno
 *
 */
public class ExercicioLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Integer nImpressoras = 5;

		Set<Impressora> impressoras = new HashSet<Impressora>(); 
		Set<Impressora> listaDeIndesejadas = new HashSet<Impressora>(); 
		Set<Integer> indicesIntesejados = new HashSet<Integer>(); 
		
		//numero da marca indesejada. NAO EH O INDICE
		indicesIntesejados.add(1);
		indicesIntesejados.add(5);
		
		
		//cria as impreçoras e ja prepara quais serao excluidas
		for (int i = 0; i++ < nImpressoras;) {
			
			Impressora impressora = new Impressora("marca" + i, "modelo" + i, 500);
			impressoras.add(impressora);
					
			if (indicesIntesejados.contains(i)) {
				
				listaDeIndesejadas.add(impressora);
				
			}
			
		}

		//remove todas as impressoras que estao na lista de indesejadas
		impressoras.remove(impressoras.removeAll(listaDeIndesejadas));
		
		//imprime todas as impressoras
		for (Impressora impressora : impressoras) {
			
			System.out.println(impressora);
			
		}
		
	}

}