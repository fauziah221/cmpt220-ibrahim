//package cmpt220;

import java.util.Scanner;

public class problem4{
	public static void main(String[] args){   
	System.out.println("Please enter the number of rows: ");
	Scanner pascaltriangle=new Scanner(System.in);
	int rownumber=pascaltriangle.nextInt();
	
	for(int i=0;i<rownumber;i++)
	{
	int value = 1;
	System.out.format( "%" + (rownumber - i)* 2+ "s" , "");
	for(int j=0;j<=i;j++)
	{
	System.out.format("%4d",value);
	value = value *(i - j)/(j + 1);
	}
	System.out.println("");
	}
	}
	

}
