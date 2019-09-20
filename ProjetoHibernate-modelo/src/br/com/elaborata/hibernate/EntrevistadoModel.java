package br.com.elaborata.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Entrevistados")
public class EntrevistadoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@Column(name = "idade")
	private int idade;

	@Column(name = "genero")
	private String genero;

	@Column(name = "time_coracao")
	private String timeCoracao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_pesquisa", nullable = false)
	private PesquisaModel pesquisa;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTimeCoracao() {
		return timeCoracao;
	}

	public void setTimeCoracao(String timeCoracao) {
		this.timeCoracao = timeCoracao;
	}

	public PesquisaModel getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(PesquisaModel pesquisa) {
		this.pesquisa = pesquisa;
	}

}
