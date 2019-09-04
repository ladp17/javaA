/**
 * 
 */
package br.com.elaborata.threads;

/**
 * @author Roque Junior
 *
 */
public class DemoRunnableSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunnableSample rs = new RunnableSample();
		
		Thread th1 = new Thread(rs);
		th1.setName("Thread 1");
		ThreadSample th2 = new ThreadSample();
		th2.setName("Thread 2");
		
		th1.start();
		th2.start();

	}

}
