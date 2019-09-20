package br.com.elaborata.hibernate;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "despesas")
public class DespesaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7681499438689356405L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "codigo", unique = true, nullable = false)
	private int codigo;

	@Column(name = "categoria", nullable = false, length = 40)
	private String categoria;

	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

	@Column(name = "valor", nullable = false)
	private Double valor;

	@Column(name = "data_pagamento", nullable = false)
	private String dataPagamento;

	public DespesaModel() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public String toString() {
		return "DespesaModel [codigo=" + codigo + ", categoria=" + categoria + ", descricao=" + descricao + ", valor="
				+ valor + ", dataPagamento=" + dataPagamento + "]";
	}

}
