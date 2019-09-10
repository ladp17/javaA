/**
 * 
 */
package br.com.elaborata.colecao.comparator;

import java.util.Comparator;

/**
 * @author aluno
 *
 */
public class AlunoOrdenaNome implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {

		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
