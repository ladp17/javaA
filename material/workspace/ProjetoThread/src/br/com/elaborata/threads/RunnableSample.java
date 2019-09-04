/**
 * 
 */
package br.com.elaborata.threads;

/**
 * @author Roque Junior
 *
 */
public class RunnableSample implements Runnable {

	
	@Override
	public void run() {
		String nomeDaThread = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			
			System.out.println(nomeDaThread + " : " + i);
			
		}

	}

}
