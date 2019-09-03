/**
 * 
 */
package br.com.elaborata.exercicios;

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
	
	public void atenderCliente() {
		
		for (int i = 0; i < numeroDeClientes; i++) {
						
			System.out.println(this.getName() + ": Cliente " + i  + " atendido");
			
			
		}
		
	}
	
}
