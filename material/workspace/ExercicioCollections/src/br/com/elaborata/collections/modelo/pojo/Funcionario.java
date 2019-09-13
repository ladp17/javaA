/**
 * 
 */
package br.com.elaborata.collections.modelo.pojo;

import br.com.elaborata.collections.modelo.enume.Endereco;
import br.com.elaborata.collections.modelo.enume.Estado;
import br.com.elaborata.collections.modelo.enume.Pais;

/**
 * Classe que representa os funcionarios<br>
 * 
 * @author Roque Junior
 * @since 2019
 *
 */
public class Funcionario {

	private Integer codigo;
	private String nome;
	private Endereco endereco;
	private Cidade cidade;
	private Estado estado;
	private Pais pais;

	public Funcionario() {
	}

	public Funcionario(Integer codigo, String nome, Endereco endereco, Cidade cidade, Estado estado, Pais pais) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
