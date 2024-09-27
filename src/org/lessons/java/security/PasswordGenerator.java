package org.lessons.java.security;

import java.util.Scanner;


public class PasswordGenerator {
	
	public static void main(String[]args) {
		
		System.out.println("Benvenuto nel tuo generatore di Password!");
		
		//chiedo all'utente di inserire il nome
		Scanner userName = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo Nome");

		String name = userName.next();
		
		
		//chiedo all'utente di inserire il cognome
		Scanner userSurname = new Scanner(System.in);
		
		System.out.println("Adesso il tuo Cognome");
		
		String surname = userSurname.next();
		
		
		//chiedo all'utente il colore preferito
		Scanner favoriteColor = new Scanner(System.in);
		
		System.out.println("Qual è il tuo colore preferito?");
		
		String color = favoriteColor.next();
		
		
		//chiedo all'utente il giorno di nascita
		Scanner birthDay = new Scanner(System.in);
		
		System.out.println("Che giorno sei nato/a?");
		
		int day = birthDay.nextInt();
		
		
		//chiedo all'utente il mese di nascita
		Scanner birthMonth = new Scanner(System.in);
		
		System.out.println("di quale mese?");
		
		int month = birthMonth.nextInt();
		
		
		//chiedo all'utente l'anno di nascita
		Scanner birthYear = new Scanner(System.in);
		
		System.out.println("In che anno sei nato?");
		
		int year = birthYear.nextInt();
		
		int somma = day + month + year;
		
		//genero la password personalizzata dell'utente
		
		System.out.println("Ciao " + name + " ecco la tua password personalizzata:");
		
		System.out.println(name + "-" + surname + "-" + color + "-" + somma);
		
		
		
	}
	

}


