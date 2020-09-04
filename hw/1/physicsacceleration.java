 package cmpt220;

 import java.util.Scanner;

 public class physicsacceleration {
		    public static void main(String[] args) { 
		    	double StartVelocity, EndVelocity, time; 
		        try(Scanner input = new Scanner(System.in)) {
					System.out.println("Type initial velocity(m/s): ");
					StartVelocity = input.nextDouble(); 					
					System.out.println("Type Type final velocity(m/s): ");
					EndVelocity = input.nextDouble(); 					
					System.out.println("Type the time in sec(s): ");
					time = input.nextDouble(); 
				}
		    	double result = (EndVelocity - StartVelocity)/time; //calculate average velocity
		    	System.out.println("\n The average acceleration is: " +result);
		    }
 }
