/**
 * 
 */
package br.com.elaborata.exercicios;

/**
 * @author ladp17
 *
 */
public class Impressora {
	private String marca;
	private String modelo;
	private Integer qtdePaginasMinuto;

	public Impressora() {
	}

	public Impressora(String marca, String modelo, Integer qtdePaginasMinuto) {
		this.marca = marca;
		this.modelo = modelo;
		this.qtdePaginasMinuto = qtdePaginasMinuto;
	}

	@Override
	public String toString() {
		return "Impressora\n"
				+ "marca: " + marca 
				+ "\n modelo: " + modelo 
				+ "\n qtdePaginasMinuto: " + qtdePaginasMinuto;
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
