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

		for (String x : list) { // la�o "for each"
			System.out.println(x);

		}

		System.out.println("--------------------/--------------------");

		// list.remove(1); //pode usar "Alex"

		list.removeIf(x -> x.charAt(0) == 'M'); // fun��o lambda, predicado (Pegue um valor x tipo String e me retorne
												// se o valor � 0 ou 1)

		// Imprimindo a lista novamente
		// Remove todo mundo cujo primeiro caracter come�a com a letra M

		for (String x : list) { // la�o "for each"
			System.out.println(x);

		}

		System.out.println("--------------------/---------------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		System.out.println("-------------------/----------------------");

		/*
		 * Primeiro converte pra Stream, faz a opera��o lambda e depois volta pra lista
		 * novamente
		 */

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // S� estamos
																											// pegando
																											// quem
																											// come�a
																											// com A"

		for (String x : result) { // la�o "for each"
			System.out.println(x);

		}

		System.out.println("-------------------/----------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);/*
								 * Fun��o que retorna o primeiro elemento que come�a com a letra A se n�o
								 * existir ele retorna nulo
								 */
		System.out.println(name);

	}
}