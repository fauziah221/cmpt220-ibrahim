//package cmpt220;

import java.util.Scanner;

public class problem1 {
	public static Point getIntersectingPoint(Point A, Point B, Point C, Point D) {
		double a1 = B.y - A.y;
		double b1 = A.x - B.x;
		double c1 = a1 * (A.x) + b1 * (A.y);

		double a2 = D.y - C.y;
		double b2 = C.x - D.x;
		double c2 = a2 * (C.x) + b2 * (C.y);

		double d = a1 * b2 - a2 * b1;

		if (d == 0) {
			return new Point(Double.MAX_VALUE, Double.MAX_VALUE);
		}

		else {
			double x = (b2 * c1 - b1 * c2) / d;
			double y = (a1 * c2 - a2 * c1) / d;
			return new Point(x, y);
		}
	}

	public static void main(String args[]) {
		Scanner intersectingpoint = new Scanner(System.in);

		double x1, y1, x2, y2, x3, y3, x4, y4;

		System.out.println("Please enter x1,y1,x2,y2,x3,y3,x4,y4: ");
		x1 = intersectingpoint.nextDouble();
		y1 = intersectingpoint.nextDouble();
		x2 = intersectingpoint.nextDouble();
		y2 = intersectingpoint.nextDouble();
		x3 = intersectingpoint.nextDouble();
		y3 = intersectingpoint.nextDouble();
		x4 = intersectingpoint.nextDouble();
		y4 = intersectingpoint.nextDouble();

		Point A = new Point(x1, y1);
		Point B = new Point(x2, y2);
		Point C = new Point(x3, y3);
		Point D = new Point(x4, y4);

		Point i = getIntersectingPoint(A, B, C, D);

		if (i.x == Double.MAX_VALUE && i.y == Double.MAX_VALUE) {
			System.out.println("The two lines are parallel");
		}

		else {
			System.out.print("The intersecting point is at ");

			Point.answerForPoint(i);
		}
	}

}
