//package cmpt220;

import java.util.Scanner;

public class problem3 { 
	public static void main(String[] args){
        try (Scanner time = new Scanner (System.in)) {
        System.out.println("Please enter total seconds: ");
        int totalseconds = time.nextInt();
        time.close();
        System.out.println("The hours, minutes, and seconds for total seconds " + totalseconds + " is: " + format(totalseconds));}}
    
	
	public static String format(int totalseconds) {
        int hours = 0;
        int minutes = 0;
        int seconds=0;

        if (totalseconds >= 3600){
            hours = totalseconds/3600;
            int rSeconds = totalseconds%3600;
            minutes = rSeconds/60;
            rSeconds = rSeconds%60;
            seconds = rSeconds;}
        
        else if (totalseconds >=60) {
            minutes = totalseconds/60;
            int rSeconds = totalseconds%60;
            seconds = rSeconds;}
        else
            seconds = totalseconds;
        
        
        if (minutes < 10 ) {
            return hours + ":0" + minutes + ":" + seconds; }
        else if (seconds <10) {
            return hours + ":" + minutes + ":0" + seconds;}
        else 
            return hours + ":" + minutes + ":" + seconds;}
}

