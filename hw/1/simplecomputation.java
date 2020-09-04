 package cmpt220;

 import java.util.Scanner;

 public class simplecomputation {

		    public static void main(String[] args) {   	
		    	double a,b,c;
		    	
		    	try (Scanner input = new Scanner(System.in)) {
					System.out.println("Type a number for a: ");
					a = input.nextDouble();
					
					System.out.println("Type a number for b: ");
					b = input.nextDouble();
					
					System.out.println("Type a number for c: ");
					c = input.nextDouble();
				}
		    	double discriminant = (b * b) - (4* a *c);
		    	System.out.println("The quadratic equation's discriminant is" +discriminant);
		    }		    	  	
 }
