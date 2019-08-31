/**
 * 
 */
package br.com.elaborata.exercicios;

import java.io.Serializable;

/**
 * @author aluno
 *
 */
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8206893125582351685L;
	
	
	private String nome;
	private String escolaridade;
	private Integer idade;
	private String objetivo;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((escolaridade == null) ? 0 : escolaridade.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((objetivo == null) ? 0 : objetivo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (escolaridade == null) {
			if (other.escolaridade != null)
				return false;
		} else if (!escolaridade.equals(other.escolaridade))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (objetivo == null) {
			if (other.objetivo != null)
				return false;
		} else if (!objetivo.equals(other.objetivo))
			return false;
		return true;
	}

	public Pessoa(String nome, String escolaridade, Integer idade, String objetivo) {
		super();
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.idade = idade;
		this.objetivo = objetivo;
	}
	
	public Pessoa() {
		super();
	}
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

	@Override
	public String toString() {
		return "Pessoa [nome: " + nome + "\n escolaridade: " + escolaridade + "\n idade: " + idade + "\n objetivo: " + objetivo
				+ "]";
	}
	
	
	
}
