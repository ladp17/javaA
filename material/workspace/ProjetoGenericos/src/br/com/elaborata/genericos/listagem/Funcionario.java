/**
 * 
 */
package br.com.elaborata.genericos.listagem;

/**
 * @author Roque Junior
 *
 */
public class Funcionario {

	private String nome;
	private String telefone;

	public Funcionario() {
	}

	public Funcionario(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", telefone=" + telefone + "]";
	}

}
