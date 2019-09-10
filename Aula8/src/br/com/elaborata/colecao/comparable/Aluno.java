/**
 * 
 */
package br.com.elaborata.colecao.comparable;

/**
 * @author aluno
 *
 */
public class Aluno implements Comparable<Aluno>{

	private Integer matricula;
	private String nome;
	private String sexo;
	
	public Aluno(Integer numero, String nome, String sexo) {
		super();
		this.matricula = numero;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Integer getNumero() {
		return matricula;
	}

	public void setNumero(Integer numero) {
		this.matricula = numero;
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

	@Override
	public int compareTo(Aluno aluno) {
		
		return this.nome.compareToIgnoreCase(aluno.getNome());
				
	}
	
	
	
}
