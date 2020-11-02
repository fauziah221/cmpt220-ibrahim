package cmpt220;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		Scanner geometry = new Scanner(System.in);

		double[][] points = new double[3][2];
		System.out.print("Please enter x1 y1 x2 y2 x3 y3: ");

		for (int i = 0; i < points.length; i++)
			for (int j = 0; j < points[i].length; j++)
				points[i][j] = geometry.nextDouble();

		double a = getTriangleArea(points);
		if (a == 0) {
			System.out.println("The three points are on the same line");
		} else {
			System.out.printf("The area of the triangle is %.2f", a);
		}
	}
	// this is not the right signature for the method
	public static double getTriangleArea(double[][] points) {

		double s1 = distanceOfPoints(points[0][0], points[0][1], points[1][0], points[1][1]);
		double s2 = distanceOfPoints(points[0][0], points[0][1], points[2][0], points[2][1]);
		double s3 = distanceOfPoints(points[2][0], points[2][1], points[1][0], points[1][1]);
		double s = (s1 + s2 + s3) / 2;
		// calculate area
		double a = s * (s - s1) * (s - s2) * (s - s3);

		if (a < 0.000001)
			return 0;
		else
			return Math.sqrt(a);
	}

	public static double distanceOfPoints(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

}
