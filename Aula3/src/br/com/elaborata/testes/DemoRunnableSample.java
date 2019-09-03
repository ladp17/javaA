/**
 * 
 */
package br.com.elaborata.testes;

/**
 * @author aluno
 *
 */
public class DemoRunnableSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		RunnableSample rs = new RunnableSample();
		
		Thread t1 = new Thread(rs);
		Thread t2 = new Thread(rs);
		Thread t3 = new Thread(rs);
		Thread t4 = new Thread(rs);
		Thread t5 = new Thread(rs);
		Thread t6 = new Thread(rs);
		Thread t7 = new Thread(rs);
		Thread t8 = new Thread(rs);
		Thread t9 = new Thread(rs);
		
//		t1.setName("Thread1");
//		t2.setName("Thread2");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
	}

}
