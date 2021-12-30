package br.com.mercadoLivre;

public class Veiculo {
	
	private String modelo;
	private String marca;
	private Double valor;
	
	
	public Veiculo(String modelo, String marca, Double valor) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", marca=" + marca + ", valor=" + valor + "]";
	}
	
	

}
