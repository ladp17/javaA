/**
 * 
 */
package br.com.elaborata.genericos.listagem;

/**
 * @author Roque Junior
 *
 */
public class Impressora {

	private String marca;
	private String modelo;
	private Integer qtdePaginasMinuto;

	public Impressora() {
	}

	public Impressora(String marca, String modelo, Integer qtdePaginasMinuto) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.qtdePaginasMinuto = qtdePaginasMinuto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getQtdePaginasMinuto() {
		return qtdePaginasMinuto;
	}

	public void setQtdePaginasMinuto(Integer qtdePaginasMinuto) {
		this.qtdePaginasMinuto = qtdePaginasMinuto;
	}

	@Override
	public String toString() {
		return "Impressora [marca=" + marca + ", modelo=" + modelo + ", qtdePaginasMinuto=" + qtdePaginasMinuto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((qtdePaginasMinuto == null) ? 0 : qtdePaginasMinuto.hashCode());
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
		Impressora other = (Impressora) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (qtdePaginasMinuto == null) {
			if (other.qtdePaginasMinuto != null)
				return false;
		} else if (!qtdePaginasMinuto.equals(other.qtdePaginasMinuto))
			return false;
		return true;
	}
	
	

}
