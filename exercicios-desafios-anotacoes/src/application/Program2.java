package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();

		System.out.print("Enter rectangle width : ");
		rect.width = sc.nextDouble();
		System.out.print("Enter rectangle heigh : ");
		rect.height = sc.nextDouble();
		
		System.out.println();

		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();

	}

}
