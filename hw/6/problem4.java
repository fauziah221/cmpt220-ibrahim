package cmpt220;

import java.util.Scanner;

public class problem4 {
	 public static double [][] inverse (double[][] A) {
	        double a = A[0][0];
	        double b = A[0][1];
	        double c = A[1][0];
	        double d = A[1][1];	        
	        double method = (a * d) - (b * c);
	        
	        A[0][0] = d / method;
	        A[0][1] = -b / method;
	        A[1][0] = -c /method;
	        A[1][1] = a / method;
	        return (A);}
	 
	 
	  public static void main(String[] args) {
	      try (Scanner matrix = new Scanner (System.in)) {
		    System.out.print("Please enter a, b, c, d:");
	        double a = matrix.nextDouble ();
	        double b = matrix.nextDouble ();
	        double c = matrix.nextDouble ();
	        double d = matrix.nextDouble ();          
	        double [][]array = {{a, b}, {c, d}};
	                
	        if (inverse (array) == null)
	            System.out.println ("No inverse matrix");
	        else {
	              System.out.println ("" + array[0][0] + " " + array[0][1]);
	              System.out.println ("" + array[1][0] + " " + array[1][1]);
	  }}}
	}