/**
 * 
 */
package br.com.elaborata.colecao.comparator;

/**
 * @author aluno
 *
 */
public class Aluno {

	private Integer matricula;
	private String nome;
	private String sexo;
	
	public Aluno(Integer numero, String nome, String sexo) {
		super();
		this.matricula = numero;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Aluno [numero=" + matricula + ", nome=" + nome + ", sexo=" + sexo + "]";
	}	
	
	
}
