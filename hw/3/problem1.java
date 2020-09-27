//package cmpt220;

import java.util.Scanner;

public class problem1 {
	 public static void main(String[] args) {   	
		 try (Scanner problem1 = new Scanner(System.in)) {
			 System.out.print("Please enter a numerator: ");//this asks user for the numerator
			        int numerator = problem1.nextInt();
			        
			 System.out.print("Please enter a denominator: ");//this asks the user for the denominator
			        int denominator = problem1.nextInt();

			        
			if (numerator < denominator) {
			    System.out.println( numerator + " / " + denominator + " is a proper fraction");//this provides the answer and indicates that it is a proper fraction
			}

			
			else if( numerator % denominator == 0 ) {
			    System.out.print( numerator + " / " + denominator + " is an improper fraction ");//this provides the answer and indicates that it is an improper fraction
			    
			    System.out.println(" and it can be reduced to " + numerator / denominator);
			}
			
			
			else{
			    System.out.print( numerator + " / " + denominator + " is an improper fraction ");//this provides the answer and indicates that it is an improper fraction
			    
			    System.out.print("and its mixed fraction is " + numerator / denominator + " + " + numerator % denominator + " / " + denominator);//this provides the answer as a mixed fraction
			}}}
}

