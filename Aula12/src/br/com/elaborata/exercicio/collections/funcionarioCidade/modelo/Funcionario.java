package br.com.elaborata.exercicio.collections.funcionarioCidade.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.elaborata.exercicio.collections.funcionarioCidade.controle.Conexao;
import br.com.elaborata.exercicio.collections.funcionarioCidade.dao.FuncionarioDAO;

public class Funcionario implements FuncionarioDAO{

	public Integer numero;
	public String nome;
	public String endereco;
	public String cidade;
	public String estado;
	public String pais;
	
	public Funcionario() {
	}
		
	public Funcionario(Integer numero, String nome, String endereco, String cidade, String estado, String pais) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public Funcionario(String numero, String nome, String endereco, String cidade, String estado, String pais) {
		super();
		this.numero = Integer.valueOf(numero);
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public void setNumero(String numero) {
		this.numero = Integer.valueOf(numero);
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return numero + "," + nome + "," + endereco + "," + cidade + "," + estado + "," + pais;
	}

	@Override
	public void inserir(Funcionario funcionario) {
		
		Connection conexao = Conexao.getConexao();
		
		try {
			
			PreparedStatement insert = conexao.prepareStatement("INSERT INTO Funcionario"
					+ "(nome, endereco, cidade, estado, pais) "
					+ "VALUES (?,?,?,?,?);");
			
			insert.setString(1, this.nome);
			insert.setString(2, this.endereco);
			insert.setString(3, this.cidade);
			insert.setString(4, this.estado);
			insert.setString(5, this.pais);
			
			insert.execute();
			
		} catch (SQLException e) {
		System.out.println("ERRO: Verifique se os dados de conexão estão corretos!");
		} finally {
			
			if (conexao != null) {
				
				try {
					conexao.close();
					System.out.println("conexao encerrada com sucesso!");
				} catch (SQLException e) {

					System.out.println("ERRO: " + e.getMessage());
				
				}
				
			}
			
		}
		
	}
	
}
