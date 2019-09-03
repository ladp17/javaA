package br.com.elaborata.testes;

public class Somar {
	private int soma;
	synchronized int somar(int numeros[]) {
		soma = 0;
		for (int i=0; i < numeros.length; i++) {
			soma += numeros[i];
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("Thread interrompida.");
			}
		}
		return soma;
	}
}
