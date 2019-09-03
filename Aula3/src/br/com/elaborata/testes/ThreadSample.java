/**
 * 
 */
package br.com.elaborata.testes;

/**
 * @author aluno
 *
 */
public class ThreadSample extends Thread {

	public void run() {
		
		String nomeDaThread = this.getName();
		
		for (int i = 0; i < 10 ; i++) {
			
			System.out.println(nomeDaThread + ": " + i);
			
		}
		
	}
	
}
