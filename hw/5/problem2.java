package cmpt220;

import java.lang.Character;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) 
	{
		String s;
		try (Scanner capitalization = new Scanner (System.in)) {
		System.out.print("Please enter a string: ");
		s= capitalization.nextLine();
		
		System.out.println("The new string is: " + title(s));}}
    	
    
    public static String title(String s)
    { 
    	
    	StringBuilder sbr = new StringBuilder(s);
	    for (int i = 0;i <sbr.length(); i++)
	    {
	      char ch = sbr.charAt(i);
	    	if ((i ==0 && Character.isLowerCase(ch)) || 
	    			(i > 0 && sbr.charAt(i - 1) == ' ' && Character.isLowerCase(ch)))
	    		sbr.replace(i, i+1, Character.toUpperCase(ch) + "");	    
	    }
	    return sbr.toString();
    }
}
