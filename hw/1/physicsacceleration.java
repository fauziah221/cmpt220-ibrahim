 package cmpt220;
 
 import java.util.Scanner;

 public class physicsacceleration {
		    public static void main(String[] args) { 
		    	double StartVelocity, EndVelocity, time; //variables
		    	try (Scanner input = new Scanner(System.in)) {
					System.out.println("Type initial velocity(m/s): ");
					StartVelocity = input.nextDouble(); //input initialVelocity
					
					System.out.println("Type Type final velocity(m/s): ");
					EndVelocity = input.nextDouble(); //input finalVelocity
					
					System.out.println("Type the time in sec(s): ");
					time = input.nextDouble(); //input time
				}

		    	double result = (EndVelocity - StartVelocity)/time; //calculate average velocity
		    	System.out.println("\n The average acceleration is: " +result);
		    }
 }
