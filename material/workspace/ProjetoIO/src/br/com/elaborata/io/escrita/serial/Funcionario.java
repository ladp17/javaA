/**
 * 
 */
package br.com.elaborata.io.escrita.serial;

import java.io.Serializable;

/**
 * @author Roque Junior
 *
 */
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4112344761002466839L;
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
