/**
 * 
 */
package br.com.elaborata.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author aluno
 *
 */
public class Teclado {
	
	private Scanner scanner = new Scanner(System.in);

	public String leNome() {
		
		return JOptionPane.showInputDialog("Digite nome");
		
	}
	
	public String leEscolaridade() {
		
		return JOptionPane.showInputDialog("Digite escolaridade");
		
	}
	
	public Integer leIdade() {
		
		return Integer.valueOf(JOptionPane.showInputDialog("Digite idade"));
		
	}
	
	public String leObjetivo() {
		
		return JOptionPane.showInputDialog("Digite objetivo");
		
	}
	
	public Integer leInt() {
		
		return scanner.nextInt();
		
	}
	
}
