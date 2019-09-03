/**
 * 
 */
package br.com.elaborata.testes;

/**
 * @author aluno
 *
 */
public class DemoThreadSample extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadSample t1 = new ThreadSample();
		ThreadSample t2 = new ThreadSample();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.run();
		t2.run();
		
	}

}
