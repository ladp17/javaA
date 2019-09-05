/**
 * 
 */
package br.com.elaborata.curriculo;

import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author aluno
 *
 */
public class MainCurriculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sair:
		while (true) {
			String menu = "1 - Cadastrar\n" +
						  "2 - Obter e mostrar na tela\n" + 
						  "3 - Alterar\n" + 
						  "0 - Sair";

			switch (Integer.valueOf(JOptionPane.showInputDialog(menu))) {
			case 1:
				cadastrar();
				break;
			case 2:
				obter();
				break;
			case 3:
				alterar(new Curriculo());
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema, volte sempre!");
				break sair;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, favor tentar novamente");
				break;
			}

		}
	}

	public static void cadastrar() {
//		Curriculo curriculo = new Curriculo();
		try {

//			curriculo.setNome(JOptionPane.showInputDialog("Nome:"));
//			curriculo.setEscolaridade(JOptionPane.showInputDialog("Escolaridade:"));
//			curriculo.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Idade:")));
//			curriculo.setObjetivo(JOptionPane.showInputDialog("Objetivo:"));

			serializar(montarCadastro());
//			serializar(curriculo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não localizado!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar o arquivo, tente novamente!");
			e.printStackTrace();
		}

	}

	private static void serializar(Curriculo curriculo) throws IOException, FileNotFoundException {
		ObjectOutputStream output = 
				new ObjectOutputStream(
						new FileOutputStream("curriculo.ser"));

		output.writeObject(curriculo);
		output.flush();
		output.close();
	}

	private static void obter() {
		try {
			Curriculo curriculo = (Curriculo) desSerializar();

			String resultado = 
					"\nNome: " + curriculo.getNome() + 
					"\nEscolaridade: " + curriculo.getEscolaridade()+ 
					"\nIdade: " + curriculo.getIdade() + 
					"\nObjetivo: " + curriculo.getObjetivo();

			JOptionPane.showMessageDialog(null, resultado);

		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "O objeto contido no arquivo é diferente, verifique e tente novamente!");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado, verifique e tente novamente!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao obter o curriculo, tente novamente!");
			e.printStackTrace();
		}

	}

	private static void alterar(Curriculo curriculo) {
		
		try {

			curriculo.setNome(JOptionPane.showInputDialog("Nome:"));
			curriculo.setEscolaridade(JOptionPane.showInputDialog("Escolaridade:"));
			curriculo.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Idade:")));
			curriculo.setObjetivo(JOptionPane.showInputDialog("Objetivo:"));

			serializar(curriculo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não localizado!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar o arquivo, tente novamente!");
			e.printStackTrace();
		}

	}

	

	private static Object desSerializar() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = 
				new ObjectInputStream(
						new FileInputStream("curriculo.ser"));

		Object object = input.readObject();
		input.close();

		return object;
	}

	private static Curriculo montarCadastro(){
		Curriculo curriculo = new Curriculo();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,5));
		JTextField nome = new JTextField(10);
		JTextField escolaridade = new JTextField(10);
		JTextField idade = new JTextField(10);
		JTextField objetivo = new JTextField(10);
		panel.add(new JLabel("Nome : "));
		panel.add(nome);
		panel.add(new JLabel("Escolaridade : "));
		panel.add(escolaridade);
		panel.add(new JLabel("Idade : "));
		panel.add(idade);
		panel.add(new JLabel("Objetivo : "));
		panel.add(objetivo);
		JOptionPane.showOptionDialog(null,
				panel, 
				"Curriculo",
				JOptionPane.CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null, null, null);
		
		curriculo.setNome(nome.getText());
		curriculo.setEscolaridade(escolaridade.getText());
		curriculo.setIdade(Integer.valueOf(idade.getText()));
		curriculo.setObjetivo(objetivo.getText());

		
		return curriculo;
		
	}
}
