/**
 * 
 */
package br.com.elaborata.threads.fila;

/**
 * @author Roque Junior
 *
 */
public class ThreadFila extends Thread {
	
	private static Fila fila = new Fila();
	
	
	@Override
	public void run() {
	
//		System.out.println("Iniciando a Thread " + Thread.currentThread().getName());
		
		fila.fila(Thread.currentThread().getName());
		
		
//		System.out.println("Finalizando a Thread " + Thread.currentThread().getName());
	}

}
