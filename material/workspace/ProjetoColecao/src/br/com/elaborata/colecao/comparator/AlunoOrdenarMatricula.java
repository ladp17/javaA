/**
 * 
 */
package br.com.elaborata.colecao.comparator;

import java.util.Comparator;

/**
 * @author Roque Junior
 *
 */
public class AlunoOrdenarMatricula implements Comparator<Aluno> {

	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		return aluno1.getMatricula().compareTo(aluno2.getMatricula());
	}

	

}
