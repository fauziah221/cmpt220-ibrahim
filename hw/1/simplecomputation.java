 package cmpt220;

 import java.util.Scanner;

 public class simplecomputation {

		    public static void main(String[] args) {   	
		    	double a,b,c;
		    	
		    	try (Scanner keyboard = new Scanner(System.in)) {
					System.out.println("Type a number for a: ");
					a = keyboard.nextDouble();
					
					System.out.println("Type a number for b: ");
					b = keyboard.nextDouble();
					
					System.out.println("Type a number for c: ");
					c = keyboard.nextDouble();
				}
		    	double discriminant = (b * b) - (4* a *c);
		    	System.out.println("The quadratic equation's discriminant is" +discriminant); //finds the discriminant
		    }		    	  	
 }
