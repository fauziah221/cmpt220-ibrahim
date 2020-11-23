//package cmpt220;

public class Time implements Cloneable, Comparable<Object>{
		   long t;
		
		   public Time() {
		       t = System.currentTimeMillis()/1000;
		       }
		
		   public Time(long t) {
		       this.t = t;
		       }
		
		   public Time(int h, int m, int s) {
		       t = (((h*60)+m)*60)+s;
		       }
		
		   int getHour() {
			   return (int)(t/3600%24);}
		
		   int getMinute() {
			   return (int)(t/60%60);}
		
		   int getSecond() {
			   return (int)(t%60);}
			     
		   long getSeconds(){
		       return t;}
		
		   public String toString() {
			   return getHour() + (getHour() > 1 ? " hours " : " hour ") + getMinute() + (getMinute() > 1 ? " minutes " : " minute ") + getSecond() + (getSecond() > 1 ? " seconds " : " second ");}
		
		   public int compareTo(Object arg0){
		       return (int) (t - ((Time)arg0).t);}
		  
		   public Time clone(){
		       Time t2 = new Time();
		       t2.t = t;
		       return t2;
		       }
		  
		   public boolean equals(Time T){
		       return T.t == t;
		       }
		
}