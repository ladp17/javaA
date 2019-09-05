/**
 * 
 */
package br.com.elaborata.visao;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 * @author Roque Junior
 *
 */
public class Formulario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Formulario() {
		setTitle("Exemplo de Formulário no Java");
		setSize(400, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JTextField jtextfield = new JTextField();
//		jtextfield.setText("");
//		jtextfield.setToolTipText("Informe seu nome");
//		jtextfield.setBounds(20, 20, 200, 20);
//		add(jtextfield);
		
//		JPasswordField jpasswordfield = new JPasswordField();
//		jpasswordfield.setText("");
//		jpasswordfield.setEchoChar('*');
//		jpasswordfield.setBounds(20, 20, 200, 20);
//		add(jpasswordfield);
		
//		JTextArea jtextarea = new JTextArea();
//		jtextarea.setText("");
//		JScrollPane scrollpane = new JScrollPane(jtextarea);
//		scrollpane.setBounds(20, 20, 300, 100);
//		add(scrollpane);
		
		
//		JRadioButton fldPessoaFisica = new JRadioButton();
//		fldPessoaFisica.setText("Pessoa Física");
//		fldPessoaFisica.setBounds(40, 20, 200, 20);
//		this.add(fldPessoaFisica);
//		JRadioButton fldPessoaJuridica = new JRadioButton();
//		fldPessoaJuridica.setText("Pessoa Jurídica");
//		fldPessoaJuridica.setBounds(180, 20, 200, 20);
//		this.add(fldPessoaJuridica);
//		ButtonGroup groupOpcoes = new ButtonGroup();
//		groupOpcoes.add(fldPessoaFisica);
//		groupOpcoes.add(fldPessoaJuridica);
		
		
//		JCheckBox fldAlunoAtivo = new JCheckBox();
//		fldAlunoAtivo.setText("Ativo?");
//		fldAlunoAtivo.setBounds(20, 20, 100, 20);
//		add(fldAlunoAtivo);
//		
//		JCheckBox fldAlunoInativo = new JCheckBox();
//		fldAlunoInativo.setText("Inativo?");
//		fldAlunoInativo.setBounds(20, 50, 200, 20);
//		add(fldAlunoInativo);
//		
//		if(fldAlunoInativo.isSelected()) {
//			System.out.println("Selecionei o Inativo");
//		}
		
//		JComboBox fldEstadoCivil = new JComboBox();
//		fldEstadoCivil.setBounds(20, 80, 100, 20);
//		fldEstadoCivil.addItem("Selecione...");
//		fldEstadoCivil.addItem("Solteiro");
//		fldEstadoCivil.addItem("Casado");
//		fldEstadoCivil.addItem("Divorcidado");
//		fldEstadoCivil.addItem("Viúvo");
//		add(fldEstadoCivil);
//
//		fldEstadoCivil.getSelectedItem();

		DefaultListModel listJodadores = new DefaultListModel();
		listJodadores.addElement("Jogador 1");
		listJodadores.addElement("Jogador 2");
		listJodadores.addElement("Jogador 3");
		listJodadores.addElement("Jogador 4");
		listJodadores.addElement("Jogador 5");
		listJodadores.addElement("Jogador 6");
		listJodadores.addElement("Jogador 7");
		listJodadores.addElement("Jogador 8");
		
		DefaultListModel listJodadores1 = new DefaultListModel();
		
		JList fldJogadores = new JList(listJodadores);
		fldJogadores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JList fldJogadores1 = new JList(listJodadores1);
		fldJogadores1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		JScrollPane scrollpane = new JScrollPane(fldJogadores);
		scrollpane.setBounds(20, 20, 150, 130);
		add(scrollpane);
		
		JScrollPane scrollpane1 = new JScrollPane(fldJogadores1);
		scrollpane1.setBounds(190, 20, 150, 130);
		
		add(scrollpane1);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Formulario();
	}
}
