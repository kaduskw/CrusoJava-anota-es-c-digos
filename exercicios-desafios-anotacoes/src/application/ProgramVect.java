package application;

import java.util.Scanner;
import java.util.Locale;

public class ProgramVect {

	/* Programa simples de como imputar dados em vetores e fazer uma media entre os dados*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i ++) {
			vect[i] = sc.nextDouble();
		}
		 
		double soma = 0.0;
		
		for(int i =0; i<n; i++) {
			soma += vect[i];
		}
		
		double avg = soma/n;
		
		System.out.printf("Average height : %.2f%n " , avg);
		
		sc.close();
	}

}
