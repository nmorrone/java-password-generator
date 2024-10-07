package org.lessons.java.snacks1;

import java.util.Scanner;

//definisco classe studente
public class Studente {

	String name;
	String surname;
	int age;
	String info;
	
	Scanner input = new Scanner(System.in);
	
	//definisco costruttore
	Studente(){
		this.name = input.next();
		this.surname = input.next();
		this.age = input.nextInt();
		this.info = getStudentInfo();

	}
	
	private String getStudentInfo() {
		this.info = name + " " + surname + ", " + String.valueOf(age);
		return info;
	}
	
}



