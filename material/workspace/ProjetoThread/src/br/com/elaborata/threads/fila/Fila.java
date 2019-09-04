/**
 * 
 */
package br.com.elaborata.threads.fila;

/**
 * @author Roque Junior
 *
 */
public class Fila {

	public void fila(String nomeDaThread) {

		for (int i = 0; i < 10; i++) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(nomeDaThread + " : " + i);
			
		}

	}

}
