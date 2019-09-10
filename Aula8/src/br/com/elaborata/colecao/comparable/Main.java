/**
 * 
 */
package br.com.elaborata.colecao.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author aluno
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(new Aluno(2, "BAluno2", "m"));
		alunos.add(new Aluno(4, "DAluno4", "m"));
		alunos.add(new Aluno(1, "AAluno1", "m"));
		alunos.add(new Aluno(3, "CAluno3", "m"));
		
		Collections.sort(alunos);
	
		for (Aluno aluno : alunos) {
			
			System.out.println(aluno);
			
		}
		
	}

}
