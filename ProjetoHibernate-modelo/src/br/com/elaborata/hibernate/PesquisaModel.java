/**
 * 
 */
package br.com.elaborata.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Roque Junior
 *
 */
@Entity
@Table(name = "Pesquisas")
public class PesquisaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo", unique = true)
	private Integer codigo;

	@Column(name = "data_pesquisa")
	private String data;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pesquisa", cascade = CascadeType.ALL)
	private Set<EntrevistadoModel> entrevistados = new HashSet<>(0);

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}
	
	@Transient
	public String getDataFormatada() {
		return String.format("dd/MM/yy", data);
	}

	public void setData(String data) {
		this.data = data;
	}

	public Set<EntrevistadoModel> getEntrevistados() {
		return entrevistados;
	}

	public void setEntrevistados(Set<EntrevistadoModel> entrevistados) {
		this.entrevistados = entrevistados;
	}

}