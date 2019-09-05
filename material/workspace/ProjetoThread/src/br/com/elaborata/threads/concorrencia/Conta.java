/**
 * 
 */
package br.com.elaborata.threads.concorrencia;

import javax.swing.JOptionPane;

/**
 * @author Roque Junior
 *
 */
public class Conta {

	private Double saldo = 3000.00;

	public Double getSaldo() {
		return saldo;
	}
	
	public void sacar(Double valor) {
		if(valor > this.saldo) {
//			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
			System.out.println("Saldo é insuficiente");
		} else {
			this.saldo -= valor;
		}
	}
}
