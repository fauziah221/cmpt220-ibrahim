package cmpt220;

import java.util.Scanner;

public class frictioncoefficient {
	 public static void main(String[] args) {   	
		 double f,m,a;	
		 try (Scanner friction = new Scanner(System.in)) {
			 System.out.println("Please enter the friction force in Newtons: ");
					f = friction.nextDouble();
					
		     System.out.println("Please enter the object’s mass in kg: ");
					m = friction.nextDouble();
					
			 System.out.println("Please enter the object’s acceleration in m/s^2: ");
					a = friction.nextDouble();					
		}
			double result = (f - m * a ) / ( m * 9.8) ; //displays coefficient of friction
			System.out.println("The  coefficient for friction is: ");
			double num = result;

	        System.out.format("%.6f", num);
	 }	 
}
 