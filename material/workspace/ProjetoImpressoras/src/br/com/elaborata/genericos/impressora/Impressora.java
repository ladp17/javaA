/**
 * 
 */
package br.com.elaborata.genericos.impressora;

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

}
