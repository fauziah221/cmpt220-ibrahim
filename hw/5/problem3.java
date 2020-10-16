package cmpt220;

import java.util.Scanner;

public class problem3 { 
    public static void main(String[] args) {    
         try (Scanner time = new Scanner (System.in)) {
        	 int seconds;
             int minutes ;
             int hours;
             System.out.print("Enter the number of seconds : ");
             seconds = time.nextInt();
             hours = seconds / 3600;
             minutes = (seconds%3600)/60;
             int secondsresult = (seconds% 3600)%60;


             System.out.println("The hours, minutes, and seconds for total seconds " + seconds +  " is " + hours + ":" + minutes + ":" + secondsresult);
         }}
 }
