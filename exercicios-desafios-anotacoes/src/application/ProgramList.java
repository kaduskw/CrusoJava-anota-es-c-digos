package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");

		System.out.println(list.size());

		for (String x : list) { // laço "for each"
			System.out.println(x);

		}

		System.out.println("--------------------/--------------------");

		// list.remove(1); //pode usar "Alex"

		list.removeIf(x -> x.charAt(0) == 'M'); // função lambda, predicado (Pegue um valor x tipo String e me retorne
												// se o valor é 0 ou 1)

		// Imprimindo a lista novamente
		// Remove todo mundo cujo primeiro caracter começa com a letra M

		for (String x : list) { // laço "for each"
			System.out.println(x);

		}

		System.out.println("--------------------/---------------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		System.out.println("-------------------/----------------------");

		/*
		 * Primeiro converte pra Stream, faz a operação lambda e depois volta pra lista
		 * novamente
		 */

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Só estamos
																											// pegando
																											// quem
																											// começa
																											// com A"

		for (String x : result) { // laço "for each"
			System.out.println(x);

		}

		System.out.println("-------------------/----------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);/*
								 * Função que retorna o primeiro elemento que começa com a letra A se não
								 * existir ele retorna nulo
								 */
		System.out.println(name);

	}
}