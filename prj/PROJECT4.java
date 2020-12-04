package cmpt220;

import java.util.Scanner;

public class PROJECT4 {
	public static void main(String[] args) throws CloneNotSupportedException{//cloneable interface not being used
	    try (Scanner complex = new Scanner(System.in)) {//for input from user
	    	
			System.out.print("Please enter the first complex number: ");//prompts the user to input the first complex number 
			double a = complex.nextDouble();
			double b = complex.nextDouble();
			Complex complex1 = new Complex(a, b);//creates the first object named complex 1

			System.out.print("Please enter the second complex number: ");//prompts the user to input the second complex number 
			double c = complex.nextDouble();
			double d = complex.nextDouble();
			Complex complex2 = new Complex(c, d);//creates the second object named complex 2
			
			System.out.println("(" + complex1 + ")" + " + " + "(" + complex2 + ")" + " = " + complex1.add(complex2));//add method called and displays the addition result
			System.out.println("(" + complex1 + ")" + " - " + "(" + complex2 + ")" + " = " + complex1.subtract(complex2));//subtract method called and displays the subtraction result
			System.out.println("(" + complex1 + ")" + " * " + "(" + complex2 + ")" + " = " + complex1.multiply(complex2));//multiply method called and displays the multiplication result
			System.out.println("(" + complex1 + ")" + " / " + "(" + complex2 + ")" + " = " + complex1.divide(complex2));//division method called and displays the divided result
			System.out.println("|" + complex1 + "| = " + complex1.abs());}//abs method called and displays the absolute result
		}
}



