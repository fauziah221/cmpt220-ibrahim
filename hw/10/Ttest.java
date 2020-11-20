package cmpt220;

import java.util.Scanner;

public class Ttest {
		   public static void main(String args[]) {
		       Scanner timet = new Scanner(System.in);
		       int h, m, s;
		       long t;
		       System.out.println("Please enter time1 (hour minute second):");
		       h = timet.nextInt();
		       m = timet.nextInt();
		       s = timet.nextInt();
		       Time t1 = new Time(h, m, s);
		       
		       System.out.println(t1);
		       System.out.println("Elapsed seconds in time1: " + t1.getSeconds());
		       System.out.println("Please enter time2 (elapsed time):");
		       
		       long seconds = timet.nextLong();
		       
		       Time t2 = new Time(seconds);
		       System.out.println(t2);
		       System.out.println("Elapsed seconds in time2: " + t2.getSeconds());
		       System.out.println("time1.compareTo(time2)?\n" + t1.compareTo(t2));
		       
		       Time t3 = t1.clone();
		       System.out.println("time3 is created as a clone of time1");
		       System.out.println("time1.compareTo(time3)? " + t1.compareTo(t3));
		   }
}
