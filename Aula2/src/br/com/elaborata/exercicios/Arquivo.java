/**
 * 
 */
package br.com.elaborata.exercicios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author aluno
 *
 */
public class Arquivo {
	
	private String fosfile;
	private FileOutputStream fos = null;
	private FileInputStream fis = null;
	private ObjectInputStream input = null;
	private ObjectOutputStream output = null;

	public Arquivo(String file) {
		super();
		
		try {
			
			this.fosfile = file;
			this.fis = new FileInputStream(file);
			
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
	}
	
	public void serializar(Serializable objeto) {
		
		try {
			
//nao consegui fazer funcionar dele reler a lista na hora de salvar			
//			ArrayList<Pessoa> listapessoas = new ArrayList<Pessoa>();
//			listapessoas = (ArrayList<Pessoa>) descerealizar();
//			
//			for (Serializable pessoa : (ArrayList<Pessoa>) objeto) {
//				
//				listapessoas.add((Pessoa) pessoa);
//				
//			}
			
			this.fos = new FileOutputStream(fosfile);
			output = new ObjectOutputStream(fos);
			
			output.writeObject(objeto);
			output.flush();
			output.close();
			
			System.out.println("\nArquivo serializado com sucesso\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Object descerealizar() {
		
		try {
			
			input = new ObjectInputStream(fis);
			return input.readObject();
		
		} catch (EOFException e) {
		
			return null;
			
		} catch (IOException e) {

			e.printStackTrace();
			return null;
		
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
		
	}
	
}