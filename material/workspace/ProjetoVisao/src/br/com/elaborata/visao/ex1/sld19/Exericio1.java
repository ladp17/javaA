/**
 * 
 */
package br.com.elaborata.visao.ex1.sld19;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * @author Roque Junior
 *
 */
public class Exericio1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Exericio1() {
		setTitle("Exercicio 1");
//		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JTextField idade = new JTextField(15);
		JRadioButton masculino = new JRadioButton("Masculino");
		JRadioButton feminino = new JRadioButton("Feminino");
		ButtonGroup genero = new ButtonGroup();
		genero.add(masculino);
		genero.add(feminino);
		
		JComboBox<String> timeCoracao = new JComboBox<String>();
		timeCoracao.addItem("Selecione...");
		timeCoracao.addItem("Atlético");
		timeCoracao.addItem("Coritiba");
		timeCoracao.addItem("Paraná");
		timeCoracao.addItem("Outros");
		
		
		
		panel.setLayout(new GridLayout(5, 2, 10, 10));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		panel.add(new JLabel("Idade"));
		panel.add(idade);
		panel.add(new JLabel("Gênero"));
		panel.add(masculino);
		panel.add(new JLabel(""));
		panel.add(feminino);
		panel.add(new JLabel("Time Coração"));
		panel.add(timeCoracao);
		
		JButton cancelar = new JButton("Cancelar");
		JButton ok = new JButton("OK");
		
		panel.add(cancelar);
		panel.add(ok);

		
		add(panel);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exericio1();
	}

}
