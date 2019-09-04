/**
 * 
 */
package br.com.elaborata.threads;

/**
 * @author Roque Junior
 *
 */
public class ThreadSample extends Thread {
	
	@Override
	public void run() {
		String nomeDaThread = this.getName();
		for (int i = 0; i < 10; i++) {
			
			System.out.println(nomeDaThread + " : " + i);
			
		}
	}

}
