package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductInVect;

public class ProgramVect1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductInVect[] vect = new ProductInVect[n];
		
		for(int i=0; i<vect.length; i++) { // pode ser usado o i< vect.lenght, é melhor usar
			sc.nextLine(); // foi usado um next line para consumir uma linha do next int usado acima
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductInVect(name, price);
		}
		
		double sum = 0.0;
		
		for(int i =0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average price : %.2f%n", avg);
		
		sc.close();
	}

}
