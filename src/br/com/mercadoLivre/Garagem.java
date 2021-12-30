package br.com.mercadoLivre;

import java.util.List;

public class Garagem {
	
	private Integer Id;
	private List<Veiculo> listaDeVeiculo;
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public List<Veiculo> getListaDeVeiculo() {
		return listaDeVeiculo;
	}
	
	public void setListaDeVeiculo(List<Veiculo> listaDeVeiculo) {
		this.listaDeVeiculo = listaDeVeiculo;
	}
	
	public Garagem(Integer id, List<Veiculo> listaDeVeiculo) {
		super();
		Id = id;
		this.listaDeVeiculo = listaDeVeiculo;
	}
	@Override
	public String toString() {
		return "Garagem [Id=" + Id + ", listaDeVeiculo=" + listaDeVeiculo + "]";
	}	

}
