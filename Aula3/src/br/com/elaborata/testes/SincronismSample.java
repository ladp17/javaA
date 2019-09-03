package br.com.elaborata.testes;

public class SincronismSample {

	public static void main(String[] args) {
		
			int numeros1[] = {1, 2, 3, 4, 5};
			int numeros2[] = {5, 6, 7, 8, 9};
			ThreadSoma t1 = new ThreadSoma(numeros1);
			t1.setName("Thread 1");
			ThreadSoma t2 = new ThreadSoma(numeros2);
			t2.setName("Thread 2");
			t1.start();
			t2.start();
		}
	
}
