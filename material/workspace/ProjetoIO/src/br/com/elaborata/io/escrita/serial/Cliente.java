/**
 * 
 */
package br.com.elaborata.io.escrita.serial;

import java.io.Serializable;

/**
 * @author Roque Junior
 *
 */
public class Cliente implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6443922083474552117L;
	private Integer id;
	private String nome;
	private String sobrenome;

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
