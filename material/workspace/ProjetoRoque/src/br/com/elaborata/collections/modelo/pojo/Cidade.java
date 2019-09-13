/**
 * 
 */
package br.com.elaborata.collections.modelo.pojo;

/**
 * @author Roque Junior
 *
 */
public class Cidade {

	private Integer codigo;
	private String estado;
	private String nome;

	public Cidade() {
	}

	public Cidade(Integer codigo, String estado, String nome) {
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
