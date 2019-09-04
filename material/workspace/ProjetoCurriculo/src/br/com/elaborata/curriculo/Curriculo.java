/**
 * 
 */
package br.com.elaborata.curriculo;

import java.io.Serializable;

/**
 * @author aluno
 *
 */
public class Curriculo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7621888788496953802L;
	private String nome;
	private String escolaridade;
	private Integer idade;
	private String objetivo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

}
