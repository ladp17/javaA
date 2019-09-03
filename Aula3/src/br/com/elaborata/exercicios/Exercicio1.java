/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author aluno
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Integer numeroDeFilas = 10;		
		final Integer numeroDeClientes = 10;

		System.out.println("instanciando simulador de filas com " + numeroDeFilas + " filas");		
		SimuladorDeFilas filas = new SimuladorDeFilas(numeroDeFilas, numeroDeClientes);
		
		System.out.println("startando");
		filas.start();
		
	}

}
