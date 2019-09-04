/**
 * 
 */
package br.com.elaborata.threads.somar;

/**
 * @author Roque Junior
 *
 */
public class SincronismoSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numeros1 = {1, 2, 3, 4, 5};
		int[] numeros2 = {5, 6, 7, 8, 9};
		
		ThreadSoma threadSoma1 = new ThreadSoma(numeros1);
		threadSoma1.setName("ThreadSoma1");
		ThreadSoma threadSoma2 = new ThreadSoma(numeros2);
		threadSoma2.setName("ThreadSoma2");
		
		threadSoma1.start();
		threadSoma2.start();

	}

}
