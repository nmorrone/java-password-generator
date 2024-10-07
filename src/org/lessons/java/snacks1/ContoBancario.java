package org.lessons.java.snacks1;

import java.util.Scanner;

public class ContoBancario {

	int accountNumber;
	double balance;
	
	Scanner input = new Scanner(System.in);
	
	ContoBancario () {
	
		System.out.println("Inserisci le 10 cifre del tuo conto bancario");
		accountNumber = input.nextInt();
		this.balanceDefault(balance);
		this.accountManage();
	}
	
	
	double balanceDefault(double balance) {
		System.out.print("inserisci il saldo del conto (facoltativo)");
		balance = input.nextDouble();
		if(balance >= 0.0) {
			this.balance = balance;
			return this.balance;
		}
		else {
			this.balance = 0.0;
			return this.balance;
		}
	}
	
	public void accountManage() {
		System.out.println("digita 1 per prelavare, 2 per depositare, 3 per il saldo");
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println("digita l'importo (es 0.00) che vuoi prelevare");
			double amount = input.nextDouble();
			this.balance = balance - amount;
			System.out.println("Hai prelevato: " + String.valueOf(amount) + "il tuo saldo attuale è:" + String.valueOf(balance));
		}
		else if(choice == 2) {
			System.out.println("digita l'importo (es 0.00) che vuoi depositare");
			double amount = input.nextDouble();
			this.balance = balance + amount;
			System.out.println("Hai depositato: " + String.valueOf(amount) + "il tuo saldo attuale è:" + String.valueOf(balance));
			
		}
		
		else if(choice == 3) {
			System.out.println("Il tuo saldo attuale è: " + balance);
		}
	

	
}
	
}
	


