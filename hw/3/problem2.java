//package cmpt220;

import java.util.Scanner;

public class problem2 {

     public static void main(String[] args) {
     double b,m;
    	 
	 try (Scanner slope = new Scanner(System.in)) {
	 double x1,x2,y1,y2;
		 System.out.println("Please enter the value of x1: ");
				x1 = slope.nextDouble();
				
	     System.out.println("Please enter the value of y1: ");
				y1 = slope.nextDouble();
				
		 System.out.println("Please enter the value of x2: ");
				x2 = slope.nextDouble();
				
		 System.out.println("Please enter the value of y2: ");
		        y2 = slope.nextDouble();
	 
      m = (y2 - y1) / (x2 - x1);
      b = (y1 - (x1 * m));
	 
		 if (m == 1 || b==1 ) 
		   System.out.println("The line equation equation for two points (" + x1 + "," + y1 + ") and " + "(" + x2 + "," + y2 + ") is y = x");
		 else if( m!=1 ||  b!=1)
		   System.out.println("The line equation equation for two points (" + x1 + "," + y1 + ") and " + "(" + x2 + "," + y2 + ") is y = "+ m + "x" + b);
	 }}
}
		