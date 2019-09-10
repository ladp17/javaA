/**
 * 
 */
package br.com.elaborata.colecao.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Roque Junior
 *
 */
public class MainAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno(1002, "Francisco Alvarenga", 'M'));
		alunos.add(new Aluno(1004, "Amália Silveira Silva", 'F'));
		alunos.add(new Aluno(1001, "Danusa Pedrosa", 'F'));
		
		Collections.sort(alunos, new AlunoOrdenarMatricula());
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
