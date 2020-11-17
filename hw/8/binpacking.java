//package cmpt220;

import java.util.Scanner;

public class binpacking {
		public static int nextBin( int numberofobjects, int weightofobjects[], int containers) {
				
				int number = 1, content = containers;
				
				for (int i = 0; i<numberofobjects; i++) {
					  if (weightofobjects[i] > content) { 
		                  number++;
		                  content = containers - weightofobjects[i]; 
		          } 
					  else
		                  content -= weightofobjects[i]; 
					  if((weightofobjects[i]+content)==10){
		                  System.out.println("Container "+ number +" contains objects with weight "+ weightofobjects[i]+" "+content);}} 
		  return number; 
		} 

		public static void main(String[] args) { 

			int containers = 10; 
			System.out.println("Please enter the number of objects: ");
		Scanner bin = new Scanner(System.in);
		int number = bin.nextInt();
		System.out.println("Please enter the weights of the objects:");
		int []obj = new int[number];
		for(int i=0; i<number; i++)
			obj[i] = bin.nextInt();

	  
				System.out.println("Number of bins required : " + nextBin(number, obj, containers)); 
			}
}



