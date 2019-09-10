/**
 * 
 */
package br.com.elaborata.colecao.comparator;

import java.util.Comparator;

/**
 * @author Roque Junior
 *
 */
public class AlunoOrdenarNome implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
