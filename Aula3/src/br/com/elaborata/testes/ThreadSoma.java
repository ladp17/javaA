package br.com.elaborata.testes;

public class ThreadSoma extends Thread {
	private static Somar somar = new Somar();
	private int numeros[];
	private int resposta;
	public ThreadSoma(int numeros[]) {
		this.numeros = numeros;
	}
	public void run() {
		System.out.println("Iniciando a thread " +
		Thread.currentThread().getName());
		resposta = somar.somar(numeros);
		System.out.println("Total da soma: " + resposta);
		System.out.println("Finalizando a thread " +
		Thread.currentThread().getName());
	}
}
