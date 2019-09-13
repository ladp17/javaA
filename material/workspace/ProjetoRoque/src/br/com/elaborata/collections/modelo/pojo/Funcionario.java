/**
 * 
 */
package br.com.elaborata.collections.modelo.pojo;

/**
 * @author Roque Junior
 *
 */
public class Funcionario {

	private Integer codigo;
	private String nome;
	private String endereco;
	private Cidade cidade;
	private String estado;
	private String pais;

	public Funcionario() {
	}

	public Funcionario(Integer codigo, String nome, String endereco, Cidade cidade, String estado, String pais) {
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
