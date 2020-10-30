package cmpt220;

import java.util.Scanner; 

public class problem2 {
	   public static void main(String args[]) {       
		       Scanner centeroftriangle = new Scanner(System.in);
	           double x1,y1,x2,y2,x3,y3;
	           
	           System.out.println("Please enter x1, y1, x2, y2, x3, y3:");
	           x1 = centeroftriangle.nextDouble();
	           y1 = centeroftriangle.nextDouble();
	           x2 = centeroftriangle.nextDouble();
	           y2 = centeroftriangle.nextDouble();
	           x3 = centeroftriangle.nextDouble();
	           y3 = centeroftriangle.nextDouble();

	           double x = (x1 + x2 + x3) /3; 
	           double y = (y1 + y2 + y3) /3; 

 
	           System.out.println("The center point is at "+ "(" + x + ", " + y + ")"); 
	   } 
} 


