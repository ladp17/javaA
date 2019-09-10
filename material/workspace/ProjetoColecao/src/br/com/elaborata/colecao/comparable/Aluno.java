/**
 * 
 */
package br.com.elaborata.colecao.comparable;

/**
 * @author Roque Junior
 *
 */
public class Aluno implements Comparable<Aluno>{

	private Integer matricula;
	private String nome;
	private Character sexo;

	public Aluno() {
	}

	public Aluno(Integer matricula, String nome, Character sexo) {
		this.matricula = matricula;
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

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	@Override
	public int compareTo(Aluno aluno) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(aluno.getNome());
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + "]";
	}
	
	

}
