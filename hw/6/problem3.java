//package cmpt220;

import java.util.Scanner;

import java.util.Arrays;

public class problem3 {
	   public static void main(String[] args) {
	       System.out.println("Please enter the first string: ");
			        Scanner anagrams = new Scanner(System.in);
					String x = anagrams.next();
					System.out.println("Please enter the second string: ");
					anagrams = new Scanner (System.in);
					String y = anagrams.next();
					
					if(isAnagram(x,y))
					{
						System.out.println(x + " and " + y + " are anagram");
					}
					else
					{
						System.out.println(x + " and " + y + " are not anagram");}
					}				
	  
		public static boolean isAnagram(String sone, String stwo){
			sone = sone.toLowerCase();
			stwo = stwo.toLowerCase();
			sone = sone.replace(" ", "");
			stwo = stwo.replace(" ", "");
			sone = sone.replace("-", "");
			stwo = stwo.replace("-", "");
			
			char[] chrArrayOne  = sone.toCharArray();
			char[] chrArrayTwo = stwo.toCharArray();
			
			if(chrArrayOne.length != chrArrayTwo.length)
			{
				return false;
			}
			
			Arrays.sort(chrArrayOne);
			Arrays.sort(chrArrayTwo);
			
			for(int i= 0; i < chrArrayOne.length; i++)
			{
				if(chrArrayOne[i] != chrArrayTwo[i])
				{
					return false;
				}
			return true;
			}
			return false;
		}
}
