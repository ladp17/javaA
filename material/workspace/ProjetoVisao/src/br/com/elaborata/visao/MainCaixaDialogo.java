/**
 * 
 */
package br.com.elaborata.visao;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Roque Junior
 *
 */
public class MainCaixaDialogo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(
		// null,
		// "Aqui vai a informação",
		// "Aqui vai o Título",
		// JOptionPane.ERROR_MESSAGE);

		// ***********************************************************************

		// int resposta = JOptionPane.showConfirmDialog(
		// null,
		// "Mensagem de Confirmação",
		// "Título",
		// JOptionPane.YES_NO_OPTION,
		// JOptionPane.QUESTION_MESSAGE);
		//
		// if(resposta == JOptionPane.YES_OPTION) {
		// JOptionPane.showMessageDialog(null, "Você pressionou sim");
		// } else if(resposta == JOptionPane.NO_OPTION) {
		// JOptionPane.showMessageDialog(null, "Você pressionou não");
		// } else {
		// JOptionPane.showMessageDialog(null, "Você não pressionou nenhum
		// botão");
		// }

		// ***********************************************************************

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		panel.add(new JLabel("Digite um número entre 0 e 1000"));
		JTextField textField1 = new JTextField(10);
		panel.add(textField1);
		panel.add(new JLabel("Digite uma frase"));
		JTextField textField2 = new JTextField(20);
		panel.add(textField2);
		int result = JOptionPane.showOptionDialog(
				null, 
				panel, 
				"Digite um número", 
				JOptionPane.YES_NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				new Object[] { "Sim", "Não", "Cancelar" }, 
				null);
		if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você clicou no botão Ok");
		} else if (result == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Você clicou no botão Cancelar");
		} else {
			JOptionPane.showMessageDialog(null, "Você não pressionou nenhum botão");
		}
		
		JOptionPane.showMessageDialog(null, textField1.getText());
		JOptionPane.showMessageDialog(null, textField2.getText());

	}

}
