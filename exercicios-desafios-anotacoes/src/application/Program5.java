package application;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculator;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumference(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n ", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("PI Value: %.2f%n ", Calculator.PI);

		sc.close();
	}

}
