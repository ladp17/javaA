/**
 * 
 */
package br.com.elaborata.teste.escrita.serial;

import java.io.Serializable;

/**
 * @author aluno
 *
 */
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1597011004615613771L;
	/**
	 * 
	 */

	private Integer id;
	private String nome;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
}
