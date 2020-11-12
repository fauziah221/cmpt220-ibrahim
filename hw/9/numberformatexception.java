package cmpt220;

import java.util.Scanner;

public class numberformatexception {
	  public static int bin2Dec(String binaryString) throws NumberFormatException {
	        int calc = 0;
	        for(int i = 0; i < binaryString.length(); ++i) {
	            if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
	                throw new NumberFormatException();
	            }
	            calc += Math.pow(2, binaryString.length() - i - 1) * (binaryString.charAt(i) - '0');
	        }
	        return calc;
	    }

	    public static void main(String[] args) {
	        Scanner number = new Scanner(System.in);
	        System.out.print("Please enter a binary number: ");
	        String s= number.nextLine();
	        try {
	            System.out.println("The decimal equivalent of this binary number " + s + " is " + bin2Dec(s));} 
	        catch (NumberFormatException e) {
	            System.out.println("Not a binary number");
	        }
	    }

	}