package cmpt220;

import java.util.Scanner;

public class problem2 {
		 public static int[] count(String s) {
		        int[] count = new int[10];
		        for(int i = 0; i < s.length(); ++i) {
		            if(Character.isDigit(s.charAt(i))) {
		                count[s.charAt(i)-'0']++;}}
		        return count;}

		    public static void main(String[] args) {
		        try (Scanner in = new Scanner(System.in)) {
					System.out.println("Enter a string: ");
					String l = in.nextLine();
					int[] count = count(l);
					for(int i = 0; i < count.length; ++i) {
					    if(count[i] != 0) {
					        System.out.printf("Digit %d occurs %d times\n", i, count[i]);
					    }}}}

}