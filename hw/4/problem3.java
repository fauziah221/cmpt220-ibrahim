package cmpt220;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		 try (Scanner bioinformatics= new Scanner(System.in)) {
			 System.out.println("Enter a genome string: ");
			 
			 String genome = bioinformatics.nextLine();
			 boolean seen = false;
			 int begin = -1;
			 for (int i=0; i<genome.length() -2; i++) 
			 {String triplets = genome.substring(i, i+3);
			 
			 if (triplets.equals("ATG")) 
			 {begin =i+3;}
			 else if (((triplets.equals("TAG")) || (triplets.equals("TAA")) || (triplets.equals("TGA"))) &&
			 (begin != -1))
				 
			 {String gene = genome.substring(begin, i);
			 if (gene.length()%3==0)
			 {seen = true;
			 System.out.println(gene);
			 begin = -1;}}}
			 if (!seen)
			 System.out.println("No gene is found");
			 }}
}