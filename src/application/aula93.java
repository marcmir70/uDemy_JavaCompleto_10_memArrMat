//uDemy, curso Java Completo, secao 10, aula 93
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aula93 {
	public static void main(String[] args) {
//		List<Integer> list1; // esta unica declaracao nao permite o uso da lista
		
//		List<String> list = new List<>(); // proibido instanciar listas
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		System.out.println("-1-lista elementos----------");
		for (String x : list) {
			System.out.println(x);
		}		

		System.out.println("-2-inclui Marco na pos.2----");
		list.add(2, "Marco");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-3-mostra tamannho da lista-");
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}	

		System.out.println("-4-remove Anna--------------");
		System.out.println(list.size());
		list.remove("Anna");
		for (String x : list) {
			System.out.println(x);
		}
			
		System.out.println("-5-remove pos.1 [Alex]------");
		System.out.println(list.size());
		list.remove(1);
		for (String x : list) {
			System.out.println(x);
		}

// remove por predicado... via funcao Lambda
		System.out.println("-6-remove todos com 'M'-----");
		list.add(1, "Alex");
		list.add("Anna");
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // remove todos que comecem com a letra M - "->" funcao lambda
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-7-pos. do Bob, depois do Marco [inexistente]--");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // encontra a posicao de um elemento "Bob"
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // encontra a posicao de um elemento "Marco"
		
// usa funcao stream (que aceita expressao lambda)...
		System.out.println("-9-filtra todos com 'A'-----");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // tipo stream especial que aceita expressoes com a funcao lambda
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-10-mostra 1º elemento que atenda um predicado--");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // encontra 1º elemento com letra A
		System.out.println(name);
		
		System.out.println("-11-mostra 1º elemento com 'J'--");
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);  // encontra 1º elemento com letra J
		System.out.println(name);
	}
}