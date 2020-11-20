package cmpt220;

import java.util.Scanner;

public class Rtest {
	        public static void main(String[] args){
	                Scanner rational = new Scanner(System.in);
	                
	                System.out.println ("Please enter the first rational number: ");
	                String r1 =rational.nextLine();
	                
	                System.out.println("Please enter the second rational number: ");
	                String r2 = rational.nextLine();
	                
	                rational.close();
	                
	                Rational rone = Rational.parseRationalNumber(r1);
	                Rational rtwo = Rational.parseRationalNumber(r2);
	                
	                System.out.println(rone+" + "+rtwo+" = " +rone.addition(rtwo));
	        }
}



