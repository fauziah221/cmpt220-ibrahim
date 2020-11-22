package cmpt220;

import java.util.Scanner;//for user input
import java.text.DecimalFormat;//to convert to decimal

public class project2 {
	public static void main(String[] args) {
		Scanner projecttwo = new Scanner(System.in);//for user input
		
		double investmentAmount;//stores for the variable for investment amount
		double r;//storage for the variable for the rate of interest
		int n = 0;//storage for the variable for the number of years
		
		//this prompts the user input the amount to be invested
		System.out.println("Please enter amount to be invested:");
		investmentAmount = projecttwo.nextDouble();
		
		//this prompts the user input the interest rate
		System.out.println("Please enter the interest rate:");
		r = projecttwo.nextDouble();
		
		//displays the future investment value by the given year
		System.out.println("The amount invested:" + investmentAmount);
		System.out.println("Annual interest rate:" + r + "%\n");
		
		
		//future investment value as well n(number of years) is displayed
		System.out.println("Years\tFuture Value");
		for(int i = 1; i<=30; i++) {//for loop repeats till it reaches the given number years(30) 
			double FV= futureInvestmentValue(investmentAmount,(r * .01)/12,i);//calculates the future investment value in a single year
			DecimalFormat d= new DecimalFormat("##.00");//converts to decimal
			
			System.out.println(i + "\t" + d.format(FV));//displays year
		}
	}
	//finding the future investment value using method header double futureInvestmentValue(double investmentAmount,double monthlyInterestRate, int years)
	public static double futureInvestmentValue(double investmentAmount,double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);//formula to find future investment
	}}
