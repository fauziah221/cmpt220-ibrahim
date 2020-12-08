package cmpt220;

import java.util.Scanner;

public class Extra {
	   public static void main(String[] args) {
		   Scanner extra = new Scanner(System.in);
		    System.out.print("Please type in X1 = ");
			double X1 = extra.nextFloat();
			System.out.print("Please type in Y1 = ");
			double Y1 = extra.nextFloat();
			
			System.out.print("Please type in X2 = ");
			double X2 = extra.nextFloat();
			
			System.out.print("Please type in Y2 = ");
			double Y2 = extra.nextFloat();
			
			System.out.print("Please type in Y3 = ");
			double X3 = extra.nextFloat();
			
			System.out.print("Please type in Y3 = ");
			double Y3 = extra.nextFloat();
			  
			System.out.println("Z1 = " + X1 + " " + Y1 + "i");
			System.out.println("Z2 = " + X2 + " " + Y2 + "i");
			System.out.println("Z3 = " + X3 + " " + Y3 + "i");
			  
			double areaformula = ((X1*(Y2-Y3)) + (X2*(Y3-Y1)) + (X3*(Y1-Y2)))*0.5;
			System.out.println("Therefore the area is = " + areaformula);
		    extra.close();
	   }
}


