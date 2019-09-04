/**
 * 
 */
package br.com.elaborata.threads.somar;

/**
 * @author Roque Junior
 *
 */
public class Somar {

	private int soma;

	public synchronized int somar(int[] numeros) {
		soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("A Thread foi interrompida");
			}

		}
		return soma;
	}

}
