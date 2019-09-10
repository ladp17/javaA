/**
 * 
 */
package br.com.elaborata.colecao.festa;

/**
 * @author Roque Junior
 *
 */
public class Cliente {

	private String nome;
	private String telefone;
	private String sexo;
	private String endereco;
	private String idade;
	private String cidade;
	private String estado;
	private String pais;

	public Cliente() {
	}

	
	public Cliente(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}


	public Cliente(String nome, String telefone, String sexo, String endereco, String idade, String cidade,
			String estado, String pais) {
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
		this.endereco = endereco;
		this.idade = idade;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
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

	@Override
	public String toString() {

		StringBuffer strb = new StringBuffer();
		strb.append("Nome: " + this.nome + "\n");
		strb.append("Telefone: " + this.telefone + "\n");
		strb.append("Sexo: " + this.sexo + "\n");
		strb.append("Endereço: " + this.endereco + "\n");
		strb.append("Idade: " + this.idade + "\n");
		strb.append("Cidade: " + this.cidade + "\n");
		strb.append("Estado: " + this.estado + "\n");
		strb.append("País: " + this.pais);

		return strb.toString();
	}

}
