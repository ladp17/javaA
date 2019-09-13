/**
 * 
 */
package br.com.elaborata.collections.modelo.pojo;

import br.com.elaborata.collections.modelo.enume.Estado;

/**
 * Classe que representa a cidade do funcionário<br>
 * 
 * @author Roque Junior
 * @since 2019
 *
 */
public class Cidade {

	private Integer codigo;
	private Estado estado;
	private String nome;

	public Cidade() {
	}

	public Cidade(Integer codigo, Estado estado, String nome) {
		this.codigo = codigo;
		this.estado = estado;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
