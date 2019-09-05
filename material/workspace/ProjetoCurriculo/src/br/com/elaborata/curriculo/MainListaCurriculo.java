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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author aluno
 *
 */
public class MainListaCurriculo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sair: while (true) {
			String menu = "1 - Cadastrar\n" + "2 - Obter e mostrar na tela\n" + "3 - Alterar\n" + "0 - Sair";

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
				break sair;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, favor tentar novamente");
				break;
			}

		}
	}

	public static void cadastrar() {

		try {
			serializar(new ArrayList<Curriculo>());
//			serializar(montarCadastro());
			// serializar(curriculo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não localizado!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar o arquivo, tente novamente!");
			e.printStackTrace();
		}

	}

	private static void serializar(List<Curriculo> curriculos) throws IOException, FileNotFoundException {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("curriculo.ser"));

		output.writeObject(curriculos);
		output.flush();
		output.close();
	}

	private static void obter() {
		try {
			String resultado = "";
			List<Curriculo> curriculos = (List<Curriculo>) desSerializar();
			for (Curriculo curriculo2 : curriculos) {
				resultado += "\nNome: " + curriculo2.getNome() + "\nEscolaridade: " + curriculo2.getEscolaridade()
						+ "\nIdade: " + curriculo2.getIdade() + "\nObjetivo: " + curriculo2.getObjetivo();

			}

			JOptionPane.showMessageDialog(null, resultado);

		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"O objeto contido no arquivo é diferente, verifique e tente novamente!");
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
			List<Curriculo> curriculos = (List<Curriculo>) desSerializar();

			curriculo.setNome(JOptionPane.showInputDialog("Nome:"));
			curriculo.setEscolaridade(JOptionPane.showInputDialog("Escolaridade:"));
			curriculo.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Idade:")));
			curriculo.setObjetivo(JOptionPane.showInputDialog("Objetivo:"));

			curriculos.add(curriculo);
			serializar(curriculos);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não localizado!");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar o arquivo, tente novamente!");
			e.printStackTrace();
		}

	}

	private static List<Curriculo> desSerializar() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("curriculo.ser"));

		List<Curriculo> curriculos = (List<Curriculo>) input.readObject();
		input.close();

		return curriculos;
	}

	private static Curriculo montarCadastro() {
		Curriculo curriculo = new Curriculo();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 5));
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
		JOptionPane.showOptionDialog(null, panel, "Curriculo", JOptionPane.CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
				null, null, null);

		curriculo.setNome(nome.getText());
		curriculo.setEscolaridade(escolaridade.getText());
		curriculo.setIdade(Integer.valueOf(idade.getText()));
		curriculo.setObjetivo(objetivo.getText());

		return curriculo;

	}
}
