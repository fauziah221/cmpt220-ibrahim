//package cmpt220;

import java.util.Random;

import java.util.Scanner;

public class outofboundsexception {
	public static void main(String[] args) {
		int n = 100;
		
		Random r = new Random();
		Scanner outofboundsexception = new Scanner(System.in);
		int[] array = new int[n];
		 
		for (int i = 0; i<n; i++) {
			array[i] = 1 + r.nextInt(100);}
		
		System.out.println("Please enter the index of the array: ");
		int x = outofboundsexception.nextInt();
		
	    try
	    {int number = array[x];
	    System.out.println("Corresponding element value is " + number);}
	    catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Out of bounds");}					
	    }
}
