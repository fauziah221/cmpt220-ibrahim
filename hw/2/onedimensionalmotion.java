package cmpt220;

import java.util.Scanner;

public class onedimensionalmotion {
	public static void main(String[] args) {
		double a,b;
		try (Scanner dimensionalmotion = new Scanner(System.in)) {
			
			System.out.println("Please type in the initial velocity in meters per second (m/s)= ");
			a = dimensionalmotion.nextDouble();	
			 
			System.out.println("Please type in the time elapsed in seconds (s)= ");
			b = dimensionalmotion.nextDouble();
		}	
		
		double result = (a * b) + (98 * (b*b)/2); //calculate the height of the building, given the travel time for the ball to the ground using Eq3
		System.out.println("The height of the building is: ");
		 double num = result;

	        System.out.format("%.3f metres", num);
	}
}
