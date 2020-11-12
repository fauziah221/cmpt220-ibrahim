package cmpt220;

import java.util.Scanner;

class BinaryFormatException extends Exception {
    public BinaryFormatException() {
    }
    public BinaryFormatException(String str) {
        super(str);}
    public BinaryFormatException(String str, Throwable cause) {
        super(str, cause);}
}


public class bfe {

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int calc = 0;
        
        for (int i = 0; i < binaryString.length(); ++i) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new BinaryFormatException("Not a binary number");}
            
            calc += Math.pow(2, binaryString.length()-i-1) * (binaryString.charAt(i) - '0');}
        return calc;}

    public static void main(String[] args) {
        try (Scanner binaryf = new Scanner(System.in)) {
			System.out.print("Please enter a binary number: ");
			String binary = binaryf.nextLine();
			try {System.out.println("The decimal equivalent of this binary number " + binary + " is " + bin2Dec(binary));} 
			
			catch (BinaryFormatException e){
			    System.out.println(e.getMessage());
			}}}
}

