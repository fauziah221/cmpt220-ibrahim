package cmpt220;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		 try (Scanner mathtutor = new Scanner(System.in)) {
			System.out.println("Main menu");	
			System.out.println("1: Addition");	
			System.out.println("2: Subtraction");	
			System.out.println("3: Multiplication");	
			System.out.println("4: Division");	
			System.out.println("5: Exit");

		int selection = 0;
		System.out.print("Enter a choice: ");

		selection = mathtutor.nextInt();
		while (selection != 5) {
		int FirstNumber= (int) (Math.random()*10);
		int SecondNumber= (int) (Math.random()*10);
		switch (selection) {

		case 1:
		int addition = FirstNumber + SecondNumber;
		System.out.println("What is " + FirstNumber + " + " + SecondNumber + "? ");
		
		try{
		int additionInput = mathtutor.nextInt();
		if (additionInput == addition) {
		System.out.println("Correct"); }
		
		else {
			System.out.println("Your answer is wrong. The correct answer is " + addition);}
			
		}catch(Exception e) {System.out.println("Your answer is wrong. The correct answer is " + addition);}

		break;

		case 2:
		int subtraction = FirstNumber - SecondNumber;

		System.out.println("What is " + FirstNumber + " - " + 	SecondNumber + "? ");
		try {
		int subtractionInput = mathtutor.nextInt();

		if (subtractionInput == subtraction) {
		System.out.println("Correct");} 
		
		else {
		System.out.println("Your answer is wrong. The correct answer is " + subtraction);}
		
		}catch(Exception e) {System.out.println("Your answer is wrong. The correct answer is " + subtraction);}
		
		break;

		case 3:
		int multiplication = FirstNumber * SecondNumber;

		System.out.print("What is " + FirstNumber + " * " + SecondNumber + "? ");
		try {
		int multiplicationInput = mathtutor.nextInt();

		if (multiplicationInput == multiplication) {
		System.out.println("correct");}
		
		else {
		System.out.println("Your answer is wrong. The correct answer is " + multiplication);}
		
		}catch(Exception e) {System.out.println("Your answer is wrong. The correct answer is " + multiplication);}
		
		break;
		
		case 4:

		while (SecondNumber == 0) {
		SecondNumber = (int) Math.round((Math.random() * 10));}//in order to prevent the number from being zero;

		double division = FirstNumber / SecondNumber;

		System.out.println("What is " + FirstNumber + " / " + SecondNumber + "? ");
		
		try {
		double divisionInput = mathtutor.nextDouble();

		if (divisionInput == division) {
		System.out.println("Correct");} 
		
		else {
		System.out.println("Your answer is wrong. The correct answer is " + division);}
		
		}catch(Exception e) {System.out.println("Your answer is wrong. The correct answer is " + division);}
		
		break;

		case 5:
		System.exit(0);
		}
		mathtutor. nextLine();
		System.out.println("");
		System.out.println("Main menu");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("5: Exit");
		System.out.println("Enter a choice: ");
	    selection = mathtutor.nextInt();
		}
		}}

}
