package cmpt220;

import java.util.Scanner;

public class project1 {
	public static void main (String[] args) {
		String input = "";
		Scanner histogram = new Scanner(System.in);
		System.out.print("Input : ");// prompts user to input the numbers for the histogram	
		
	    //enters the entire line from the user
		input = histogram.nextLine();
		histogram.close();		
		
		//this splits the numbers the user entered based on how they are spaced out
		String inputArr[] = input.split("\\s");	
		
		//this creates an integer array 
		int arr[] = new int[inputArr.length];
		for (int i=0; i<inputArr.length;i++) {//this converts the string array to an integer array
			arr[i] = Integer.parseInt(inputArr[i]);
		}
		System.out.println("Output : ");//this prints out the histogram
		printChart(arr);
	}
	
	
	
	// this is to create a function that will be able to find the maximum value in the array
	public static int getMax(int arr[]) {
		int max = Integer.MIN_VALUE;		
		// creating a loop for the entire array
		for (int i=0;i<arr.length;i++) {
			if (arr[i] > max) {// if the current values entered are greater than max then the program should change the max  value
				max = arr[i];
			}}
		return max;
	}
	
	
	public static void printChart(int arr[]) {
		// this  function allows the user to get the value in the array
		int max = getMax(arr);
		for (int i=max; i>=0;i--) {// this runs a loop from the max value in the array to 0
			System.out.printf("%2d  |  ",i);//this prints the initial section of y-axis
			
			// this runs a loop over the input array
			for (int number : arr) {
				if (number>=i) {
					System.out.printf("x  ");// if the value in the array is greater than equal or equal to the i value, then print the value
				} else {
					System.out.printf("   ");// else it prints a space character
				}}
			System.out.println();// prints a new line after the initial line
		}
		

		System.out.print("------");// prints the divider line
		
		// this is to create a loop over the input array and prints the divider3 times for each value input by the user
		for (int i=1; i<=arr.length;i++) {
			System.out.print("---");
		}		
		System.out.println("----");// prints the remaining divider with a new line as well		
		System.out.print("     ");// prints the initial section of x-axis		
		// this creates a loop over the input array and prints the value using 3 character arrangement
		for (int number : arr) {
			System.out.printf("%3d", number);
		}

		System.out.println();// prints a new line in the end
	}
	
}
