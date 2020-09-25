package cmpt220;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		
	double rone,rtwo,radius,x,y,angle,distance;
		 try (Scanner circle = new Scanner(System.in)) {

	rone = Math.random();
	rtwo = Math.random();
	
	radius = 5;
	angle = rone * 2 * Math.PI ;
	
	x = radius * rtwo * Math.cos(angle);
	y = radius * Math.sin(angle);
	
	distance = Math.sqrt(Math.pow(x,2) + Math.pow (y,2));
	    System.out.println("The point is (" + x + "," +  y + ") and its distance to the center is " + distance);
		 }}
}
