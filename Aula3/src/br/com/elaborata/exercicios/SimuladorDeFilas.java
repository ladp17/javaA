/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.ArrayList;

/**
 * @author aluno
 *
 */
public class SimuladorDeFilas {

	private Integer numeroDeFilas;
	private Integer numeroDeClientes;
	
	ArrayList<Fila> filas = new ArrayList<Fila>();
	
	public SimuladorDeFilas(Integer numeroDeFilas, Integer numeroDeClientes) {
		
		super();
		this.numeroDeFilas = numeroDeFilas;
		this.numeroDeClientes = numeroDeClientes;
	
	}
	
	public void criafilas() {
		
		for (int i = 0; i < this.numeroDeFilas; i++) {
			
			String nomeDaFila = "Fila " + i;
			
			System.out.println("instanciando " + nomeDaFila);
			Fila fila = new Fila(numeroDeClientes);
			fila.setName(nomeDaFila);
			
			filas.add(fila);
			
		}
		
	}
	
	public void start() {
		
		System.out.println("criando filas");
		this.criafilas();
		
		System.out.println("startando filas");
		for (Fila fila : filas) {
			
			System.out.println("startando fila " + filas.indexOf(fila));
			fila.start();
			
		}
		
	}
	
}
