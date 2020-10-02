package cmpt220;

import java.util.Scanner;

public class problem2 {	
	    public static void main(String[] args) {
		 
	    int n;  	    
	    double radius,x,y;
	    try (Scanner pentagon = new Scanner(System.in)) {
	  	             System.out.println("Enter the number of sides :");
	  	             n = (int) pentagon.nextDouble();
	  	             
	  	             System.out.println("Enter the radius of the bounding circle:");
	  	             radius = pentagon.nextDouble();      
            for (int i = n ; i>=1;i--)	{					 
		  	x= radius * Math.cos(2 * Math.PI * i /n);				 
			y= radius * Math.sin(2 * Math.PI * i/n);  
	         System.out.println("The coordinates of the points on the polygon are :" + "(" + x + "," + y + ")");          
	          }}}
}
	


