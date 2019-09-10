package br.com.elaborata.colecao.split;

public class Funcionario {
	
	private Integer matricula;
	private String nome;
	private String endereco;
	
	public Funcionario(Integer matricula, String nome, String endereco){
		this.matricula = matricula;
		this.nome= nome;
		this.endereco=endereco;		
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Funcionario(){
		
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	

}
