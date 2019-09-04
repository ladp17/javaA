/**
 * 
 */
package br.com.elaborata.threads.somar;

/**
 * @author Roque Junior
 *
 */
public class ThreadSoma extends Thread {
	
	private static Somar somar = new Somar();
	private int numeros[];
	private int resposta;
	
	
	public ThreadSoma(int[] numeros) {
		this.numeros = numeros;
	}
	
	@Override
	public void run() {
	
		System.out.println("Iniciando a Thread " + Thread.currentThread().getName());
		
		resposta = somar.somar(this.numeros);
		
		System.out.println("Total da soma é : " + resposta);
		
		System.out.println("Finalizando a Thread " + Thread.currentThread().getName());
	}

}
