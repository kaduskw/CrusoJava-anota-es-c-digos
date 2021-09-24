package application;

import java.util.Scanner;

import entities.Account;

import java.util.Locale;

public class Program7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.println("Enter the account number: ");
		int number = sc.nextInt();
		System.out.println("Enter the account holder: ");
		sc.nextLine();// Foi usado para consumir uma quebra de linha do Next INT
		String holder = sc.nextLine();
		System.out.println("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter the initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account); 

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}
}
