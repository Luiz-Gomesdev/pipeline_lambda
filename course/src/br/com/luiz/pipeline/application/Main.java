package br.com.luiz.pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

		// Pega os elementos da list e multiplica por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		// Somando todos os itens da lista
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		//Filtrando n�meros pares da list e criando novo array
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
		
		// Filtrando n�meros pares da list e multiplicando por 10
		List<Integer> newList2 = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList2.toArray()));
		

	}

}
