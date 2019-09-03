/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Random;

/**
 * @author aluno
 *
 */
public class Fila extends Thread {
	private Integer numeroDeClientes;
	
	
	public Fila(Integer numeroDeClientes) {
		super();
		this.numeroDeClientes = numeroDeClientes;
	}

	@Override
	public void run() {
		
		super.run();
		this.atenderCliente();
		
	}
	
	private long aleatorio() {
		Random random = new Random();			
		Long aleatorio;
		final Long maxRandom = 1000L;
		
		aleatorio = random.nextLong();
		
		aleatorio = (aleatorio < 0)? -aleatorio : aleatorio;

		if (aleatorio > maxRandom) {
			
			return maxRandom;
			
		}
		
		return aleatorio;		
	}
	
	public void atenderCliente() {
		
		for (int i = 0; i < numeroDeClientes; i++) {
					
			try {
				Thread.sleep(aleatorio());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.getName() + ": Cliente " + i  + " atendido");
			
			
		}
		
	}
	
}
