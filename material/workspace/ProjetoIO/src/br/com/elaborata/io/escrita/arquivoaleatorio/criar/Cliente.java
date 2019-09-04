package br.com.elaborata.io.escrita.arquivoaleatorio.criar;

public class Cliente {

	private int id; // código de identificação do cliente 
	private String nome; // nome do cliente 
	private String sobrenome; // sobrenome do cliente 
	private double saldo; // saldo do cliente 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
