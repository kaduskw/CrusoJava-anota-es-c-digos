package application;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class Program6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println();
		System.out.print("How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();
		double conversion = CurrencyConverter.dollarConverter(dollarPrice, dollarBought);
		System.out.println();
		System.out.printf("Amount to be paid in reais = %.2f%n ",conversion);
		
		
		sc.close();
	}

}
