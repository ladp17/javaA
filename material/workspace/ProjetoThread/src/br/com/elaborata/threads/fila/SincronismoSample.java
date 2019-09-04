/**
 * 
 */
package br.com.elaborata.threads.fila;

/**
 * @author Roque Junior
 *
 */
public class SincronismoSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadFila caixa1 = new ThreadFila();
		caixa1.setName("Cliente caixa 1");
		ThreadFila caixa2 = new ThreadFila();
		caixa2.setName("Cliente caixa 2");
		ThreadFila caixa3 = new ThreadFila();
		caixa3.setName("Cliente caixa 3");
		ThreadFila caixa4 = new ThreadFila();
		caixa4.setName("Cliente caixa 4");
		
		caixa1.start();
		caixa2.start();
		caixa3.start();
		caixa4.start();

	}

}
