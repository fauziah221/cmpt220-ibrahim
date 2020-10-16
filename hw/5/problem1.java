package cmpt220;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {    	
        try (Scanner integer = new Scanner (System.in)) {
			 int integerValue; 
			 System.out.print("Please enter an integer: ");
			 integerValue = integer.nextInt();
			 String binaryNumber = decimalToBinary(integerValue);
	         System.out.println("The binary value is: " + binaryNumber);
				}
    }
    public static String decimalToBinary(int value) { 
    	String binaryNumber = "";
    		while (value !=0) {
    			if (binaryNumber.length() % 5 ==0)
    			{ binaryNumber = "" + binaryNumber;}
    			binaryNumber = (value % 2) + binaryNumber;
    			                 value/=2;		
    		}
		return binaryNumber;
    }
}
