/**
 * 
 */
package br.com.elaborata.colecao.comparable;

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
		
		alunos.add(new Aluno(1004, "Francisco Alvarenga", 'M'));
		alunos.add(new Aluno(1001, "Amália Silveira Silva", 'F'));
		alunos.add(new Aluno(1002, "Danusa Pedrosa", 'F'));
		
		Collections.sort(alunos);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
