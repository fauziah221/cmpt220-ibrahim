package cmpt220;

import java.util.Scanner;

public class problem4 {
	 public static void main(String[] args) {   	
		 try (Scanner problem4 = new Scanner(System.in)) {
			 System.out.println("Please enter a positive integer:");//this asks user for a positive integer
			        int integer = problem4.nextInt();
			  
			 double result= Math.sqrt(integer);//calculates the square root of the positive integer 			 
			 System.out.println("sqrt(" + integer + ")" + " is "  + result);  
			 }}

}
