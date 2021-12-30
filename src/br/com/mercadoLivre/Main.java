package br.com.mercadoLivre;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//CRIAMOS OS VEICULOS
		Veiculo veiculo1 = new Veiculo("Fiesta", "Ford", 1000.0);
		Veiculo veiculo2 = new Veiculo("Focus", "Ford", 1200.0);
		Veiculo veiculo3 = new Veiculo("Explorer", "Ford", 2500.0);
		Veiculo veiculo4 = new Veiculo("Uno", "FIAT", 500.0);
		Veiculo veiculo5 = new Veiculo("Cronos", "FIAT", 1000.0);
		Veiculo veiculo6 = new Veiculo("Torino", "FIAT", 1250.0);
		Veiculo veiculo7 = new Veiculo("Aveo", "Chevrolet", 1250.0);
		Veiculo veiculo8 = new Veiculo("Spin", "Chevrolet", 2500.0);
		Veiculo veiculo9 = new Veiculo("Corolla", "Toyota", 1200.0);
		Veiculo veiculo10 = new Veiculo("Fortuner", "Toyota", 3000.0);
		Veiculo veiculo11 = new Veiculo("Logan", "Ford", 950.0);
		//CRIAMOS A LISTA
		List<Veiculo> listaDeVeiculo= new ArrayList<Veiculo>();
		//VAMOS ADICIONAR UM VEICULO POR VEZ DENTRO DA LISTA
		listaDeVeiculo.add(veiculo1);
		listaDeVeiculo.add(veiculo2);
		listaDeVeiculo.add(veiculo3);
		listaDeVeiculo.add(veiculo4);
		listaDeVeiculo.add(veiculo5);
		listaDeVeiculo.add(veiculo6);
		listaDeVeiculo.add(veiculo7);
		listaDeVeiculo.add(veiculo8);
		listaDeVeiculo.add(veiculo9);
		listaDeVeiculo.add(veiculo10);
		listaDeVeiculo.add(veiculo11);
		// CRIAMOS A GARAGEM PASSANDO O ID 1 E A LISTA DE VEICULOS QUE CRIAMOS
		Garagem garagem = new Garagem(1, listaDeVeiculo);
		
//		ordenar lista de veiculo por preco menor ao maior imprimir na tela
		
		
		
//		EXERCICIO 5
		List<Veiculo> veiculosBaratinho = listaDeVeiculo.stream().filter(x-> x.getValor()<1000).collect(Collectors.toList());
		
		List<Veiculo> veiculosMedio = listaDeVeiculo.stream().filter(x-> x.getValor()>=1000).collect(Collectors.toList());
		
		 double soma = listaDeVeiculo.stream().map(x-> x.getValor()).mapToDouble(Double::doubleValue).sum();
		 

		
		
		
//		EXERCICIO 4
//		listaDeVeiculo.stream().sorted(
//		Comparator.comparing(Veiculo::getMarca).thenComparing(Veiculo::getValor))
//			.forEach(System.out::println);//IMPRIMIU NA TELA
		
		
		
		
		
		
//		EXERCICIO 3
//		listaDeVeiculo.stream()
//		.sorted((x,y)->x.getMarca().compareToIgnoreCase(y.getMarca()))
//			.sorted((x,y)->x.getValor().compareTo(y.getValor()))//CLASSIFICOU POR ORDEM DE GETVALOR
//				.forEach(System.out::println);//IMPRIMIU NA TELA
		
		
	}

}
