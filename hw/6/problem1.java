package cmpt220;

import java.util.ArrayList;

import java.util.Scanner;

public class problem1 {
	   public static void main(String[] args) {
			try (Scanner convexpolygon = new Scanner(System.in)) {
		       System.out.println("Please enter the number of the points of your convex polygon:");
		       int points = convexpolygon.nextInt();
	
		       double[][]coordinates = new double[points][2];
	
		       System.out.println("Please enter coordinates of the points of your convex polygon: ");
		       for (int i = 0; i < coordinates.length; i++) {
		           for (int j = 0; j < coordinates[i].length; j++) {
		               coordinates[i][j] = convexpolygon.nextDouble();}}
	       convexpolygon.close();

	       System.out.println("The total area for the coordinates entered is: " + polygonConvexArea(coordinates));}}

	 
	   
	   public static double polygonConvexArea(double[][] points) {
	       ArrayList<Double> X = new ArrayList<Double>();
	       ArrayList<Double> Y = new ArrayList<Double>();

	       for (int i = 0; i < points.length; i++) {
	           X.add(points[i][0]);
	           Y.add(points[i][1]);}
	       
	       double summation = 0;

	       for (int i = 0; i < X.size(); i++) {
	           if (i == X.size() - 1) 
	           { 
	               summation += (X.get(i) * Y.get(0) - Y.get(i) * X.get(0));
	           } else {
	               summation += (X.get(i) * Y.get(i + 1) - Y.get(i) * X.get(i + 1));
	           }}
	       
	       return Math.abs(summation / 2);}
}