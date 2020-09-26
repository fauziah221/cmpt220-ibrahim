package cmpt220;

import java.util.Random;
import java.util.Scanner;

public class problem4 {
	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
        if (number1 < number2) {
		    int temp = number1;
		    
		    number1 = number2;
		    number2 = temp;
        } 
        
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        
        String[] rightanswer= {"Excellent", "Way to go", "Correct"};
              Random randomword= new Random();
              int randomwordone = randomword.nextInt(3);
        String[] wronganswer= {"Wrong", "Incorrect", "Not right"};
              Random randomword2= new Random();
              int randomwordtwo = randomword2.nextInt(3);
     
        Scanner subtract = new Scanner(System.in);
        int answer = subtract.nextInt();
        
        if (number1 - number2 == answer) {
        	System.out.println(rightanswer[randomwordone]);
        }
        else {
        System.out.println(wronganswer[randomwordtwo]); 
        System.out.println(number1 + " - " + number2 +" should be " + (number1 - number2));
        }}
}