//package cmpt220;

import java.util.Scanner;

public class rectangle {
	public static void main(String[] args) {
		
           //Calculating the rectangle perimeter,area and diagonal length
		Scanner rectangle = new Scanner(System.in);
			System.out.println("Please type both the width and height of a rectangle:");
			
			double a= rectangle.nextDouble();
			double b = rectangle.nextDouble();
			
			System.out.println("The periemter of the rectangle is: " + 2 * (a + b));// calculates the perimeter
			System.out.println("The area of the rectangle is: " + a * b);//calculates the area 
			System.out.println("The length of the diagonal in the rectangle is: "+Math.sqrt(a * a+ b * b));// calculates the diagonal length 
		}
}

