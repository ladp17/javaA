/**
 * 
 */
package br.com.elaborata.threads;

/**
 * @author Roque Junior
 *
 */
public class DemoThreadSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadSample threadSample1 = new ThreadSample();
		threadSample1.setName("Thread 1");
		ThreadSample threadSample2 = new ThreadSample();
		threadSample2.setName("Thread 2");
		
		threadSample1.run();
		threadSample2.run();
		

	}

}
