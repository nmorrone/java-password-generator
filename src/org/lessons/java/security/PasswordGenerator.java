package org.lessons.java.security;

import java.util.Scanner;


public class PasswordGenerator {
	
	public static void main(String[]args) {
		
		System.out.println("Benvenuto nel tuo generatore di Password!");
		
		Scanner userName = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo Nome");

		String name = userName.next();
		
		Scanner userSurname = new Scanner(System.in);
		
		System.out.println("Adesso il tuo Cognome");
		
		String surname = userSurname.next();
		
		Scanner favoriteColor = new Scanner(System.in);
		
		System.out.println("Qual è il tuo colore preferito?");
		
		String color = favoriteColor.next();
		
		Scanner birthDay = new Scanner(System.in);
		
		System.out.println("Che giorno sei nato/a?");
		
		String day = birthDay.next();
		
		Scanner birthMonth = new Scanner(System.in);
		
		System.out.println("di quale mese?");
		
		String month = birthMonth.next();
		
		Scanner birthYear = new Scanner(System.in);
		
		System.out.println("In che anno sei nato?");
		
		String year = birthYear.next();
		
		
	}
	

}


