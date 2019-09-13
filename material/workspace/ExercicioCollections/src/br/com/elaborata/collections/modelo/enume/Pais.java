/**
 * 
 */
package br.com.elaborata.collections.modelo.enume;

/**
 * Enumerador que representa o Pais do funcionario<br>
 * 
 * @author Roque Junior
 *
 */
public enum Pais {
	
	BRASIL(1, "Brasil"),
	RUSSIA(2, "Rússia"),
	ESPANHA(3, "Espanha"),
	;

	private Integer codigo;
	private String descricao;
	
	Pais(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
