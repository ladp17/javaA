/**
 * 
 */
package br.com.elaborata.testes;

/**
 * @author aluno
 *
 */
public class RunnableSample implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread().getName() + ": " + i);
			
		}
		
	}

}
