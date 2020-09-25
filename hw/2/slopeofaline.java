//package cmpt220;

import java.util.Scanner;

public class slopeofaline {
     public static void main(String[] args) {
	 double x1,y1,x2,y2;
	 try (Scanner slope = new Scanner(System.in)) {
		 System.out.println("Please enter the value of x1: ");
				x1 = slope.nextDouble();
				
	     System.out.println("Please enter the value of y1: ");
				y1 = slope.nextDouble();
				
		 System.out.println("Please enter the value of x2: ");
				x2 = slope.nextDouble();
				
		 System.out.println("Please enter the value of y2: ");
				y2 = slope.nextDouble();
	}
    double result = (y2-y1)/(x2-x1); //calculates the slope of a line 
		System.out.println("The slope of a line is: ");
		 double num = result;

	        System.out.format("%.5f", num);
     }
} 
